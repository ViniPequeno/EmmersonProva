package com.fvncional.developer.emmersonprova;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.fvncional.developer.emmersonprova.Controller.DisciplinaController;
import com.fvncional.developer.emmersonprova.Models.Disciplina;

import androidx.appcompat.app.AppCompatActivity;

public class AddDisciplinaActivity extends AppCompatActivity {

    EditText txtNome;
    Button btnConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_disciplina);

        txtNome = findViewById(R.id.txtNome);
        btnConfirmar = findViewById(R.id.btnConfirmar);
    }

    public void cadastrar(View v){
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(txtNome.getText().toString());

        DisciplinaController dc = new DisciplinaController(this);
        dc.inserir(disciplina);
    }
}
