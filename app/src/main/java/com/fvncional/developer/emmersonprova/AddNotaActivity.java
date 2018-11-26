package com.fvncional.developer.emmersonprova;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.fvncional.developer.emmersonprova.Controller.NotaController;
import com.fvncional.developer.emmersonprova.Models.Nota;

import androidx.appcompat.app.AppCompatActivity;

public class AddNotaActivity extends AppCompatActivity {

    EditText txtAluno, txtN1, txtN2, txtN3, txtN4, txtMedia, txtDisciplina;
    Button btnConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_nota);

        txtAluno = findViewById(R.id.txtAluno);
        txtN1 = findViewById(R.id.txtN1);
        txtN2 = findViewById(R.id.txtN2);
        txtN3 = findViewById(R.id.txtN3);
        txtN4 = findViewById(R.id.txtN4);
        txtMedia = findViewById(R.id.txtMedia);
        txtDisciplina = findViewById(R.id.txtDisciplina);
        btnConfirmar = findViewById(R.id.btnConfirmar);
    }

    public void cadastrar(View v){
        Nota nota = new Nota();

        nota.setMatAluno(txtAluno.getText().toString());
        nota.setNota1(Float.parseFloat(txtN1.getText().toString()));
        nota.setNota2(Float.parseFloat(txtN2.getText().toString()));
        nota.setNota3(Float.parseFloat(txtN3.getText().toString()));
        nota.setNota4(Float.parseFloat(txtN4.getText().toString()));
        nota.setMedia(Float.parseFloat(txtMedia.getText().toString()));
        nota.setDisciplinaId(Integer.parseInt(txtDisciplina.getText().toString()));

        NotaController nc = new NotaController(this);
        nc.inserir(nota);
    }
}
