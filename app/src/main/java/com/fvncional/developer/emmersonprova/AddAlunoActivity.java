package com.fvncional.developer.emmersonprova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.fvncional.developer.emmersonprova.Controller.AlunoController;
import com.fvncional.developer.emmersonprova.DAO.AlunoDAO;
import com.fvncional.developer.emmersonprova.Models.Aluno;

import java.util.List;

public class AddAlunoActivity extends AppCompatActivity {

    EditText txtMatricula, txtNome, txtTurma;
    Button btnConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_aluno);

        txtMatricula = findViewById(R.id.txtMatricula);
        txtNome = findViewById(R.id.txtNome);
        txtTurma = findViewById(R.id.txtTurma);
        btnConfirmar = findViewById(R.id.btnConfirmar);
    }

    public void cadastrar(View v){
        Aluno a = new Aluno();
        a.setMatricula(txtMatricula.getText().toString());
        a.setNome(txtNome.getText().toString());
        a.setTurma(txtTurma.getText().toString());

        AlunoController ac = new AlunoController(this);
        ac.inserir(a);
    }
}
