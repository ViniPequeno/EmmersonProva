package com.fvncional.developer.emmersonprova;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fvncional.developer.emmersonprova.Controller.ProfessorController;
import com.fvncional.developer.emmersonprova.Database.AppDatabase;
import com.fvncional.developer.emmersonprova.Models.Professor;

public class LoginActivity extends AppCompatActivity {

    EditText txtLogin, txtSenha;
    Button btnEntrar, btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SharedPreferences sharedPreferences = getSharedPreferences("sistema", Context.MODE_PRIVATE);
        boolean logado = sharedPreferences.getBoolean("logado", false);
        Intent intent;

        //Se usuário já estiver logado, carrega a página inicial, senão, carrega a tela de login
        if (logado) {
            intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK ); // adiciona a flag para a intent
            startActivity(intent);
            LoginActivity.this.finish();
        }

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "Banco").build();

        txtLogin = findViewById(R.id.txtMatricula);
        txtSenha = findViewById(R.id.txtSenha);
        btnEntrar = findViewById(R.id.btnEntrar);
        btnCadastrar = findViewById(R.id.btnCadastrar);
    }

    public void entrar(View v){
        ProfessorController pc = new ProfessorController(this);
        String login = txtLogin.getText().toString();
        String senha = txtSenha.getText().toString();
        Professor p;
        if((p = pc.login(login, senha))!=null){

            SharedPreferences sharedPreferences = getSharedPreferences("sistema", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor;
            editor = sharedPreferences.edit();
            editor.putBoolean("logado", true);
            editor.putString("login", p.getLogin());
            editor.putString("turma", p.getTurma());
            editor.putString("senha", p.getSenha());
            editor.putInt("matricula", p.getMatricula());
            editor.putInt("idProf", p.getId());
            editor.commit();

            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }else{
            Toast.makeText(this,"Login ou senha errados",Toast.LENGTH_SHORT).show();
        }
    }

    public void cadastrar(View v){
        Intent i = new Intent(this, AddProfessorActivity.class);
        startActivity(i);
        LoginActivity.this.finish();
    }
}
