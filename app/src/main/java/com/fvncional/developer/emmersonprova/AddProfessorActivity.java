package com.fvncional.developer.emmersonprova;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.fvncional.developer.emmersonprova.Controller.ProfessorController;
import com.fvncional.developer.emmersonprova.Models.Professor;

import androidx.appcompat.app.AppCompatActivity;

public class AddProfessorActivity extends AppCompatActivity {

    EditText txtNome, txtTurma, txtMatricula, txtLogin, txtSenha;
    Button btnConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_professor);

        txtNome = findViewById(R.id.txtNome);
        txtTurma = findViewById(R.id.txtTurma);
        txtMatricula = findViewById(R.id.txtMatricula);
        txtLogin = findViewById(R.id.txtLogin);
        txtSenha = findViewById(R.id.txtSenha);
        btnConfirmar = findViewById(R.id.btnConfirmar);
    }

    public void cadastrar(View v){
        Professor professor = new Professor();
        professor.setNome(txtNome.getText().toString());
        professor.setTurma(txtTurma.getText().toString());
        professor.setMatricula(Integer.parseInt(txtTurma.getText().toString()));
        professor.setLogin(txtLogin.getText().toString());
        professor.setSenha(txtSenha.getText().toString());

        ProfessorController pc = new ProfessorController(this);
        pc.inserir(professor);

        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }
}
