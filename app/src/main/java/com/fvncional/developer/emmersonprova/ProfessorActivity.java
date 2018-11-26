package com.fvncional.developer.emmersonprova;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

import com.fvncional.developer.emmersonprova.Controller.NotaController;
import com.fvncional.developer.emmersonprova.DAO.NotaDAO;
import com.fvncional.developer.emmersonprova.Models.Nota;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class ProfessorActivity extends AppCompatActivity {
    TextView lblTurma, lblDisciplina;
    Button btnAddAluno;
    TableLayout table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);

        lblTurma = findViewById(R.id.lblTurma);
        lblDisciplina = findViewById(R.id.lblDisciplina);
        table = findViewById(R.id.table);
        btnAddAluno = findViewById(R.id.btnAddAluno);

        NotaController nc = new NotaController(this);
        List<Nota> notas = nc.listAluno(0);

        for (Nota nota : notas){
            View tableRow = LayoutInflater.from(this).inflate(R.layout.prof_row,null,false);
            TextView lblNome  = (TextView) tableRow.findViewById(R.id.lblNome);
            TextView lblN1  = (TextView) tableRow.findViewById(R.id.lblN1);
            TextView lblN2  = (TextView) tableRow.findViewById(R.id.lblN2);
            TextView lblN3  = (TextView) tableRow.findViewById(R.id.lblN3);
            TextView lblN4  = (TextView) tableRow.findViewById(R.id.lblN4);
            TextView lblMedia  = (TextView) tableRow.findViewById(R.id.lblMedia);

            lblNome.setText("123");
            lblN1.setText("2014-02-05");
            lblN2.setText("2014-02-05");
            lblN3.setText("2014-02-05");
            lblN4.setText("2014-02-05");
            lblMedia.setText("456");
            table.addView(tableRow);
        }
    }
}
