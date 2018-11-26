package com.fvncional.developer.emmersonprova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

public class ProfessorActivity extends AppCompatActivity {
    TextView lblTurma, lblDisciplina;
    TableLayout table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);

        lblTurma = findViewById(R.id.lblTurma);
        lblDisciplina = findViewById(R.id.lblDisciplina);
        table = findViewById(R.id.table);

        for (int i=0;i<5;i++){
            View tableRow = LayoutInflater.from(this).inflate(R.layout.prof_row,null,false);
            TextView lblNome  = (TextView) tableRow.findViewById(R.id.lblNome);
            TextView lblN1  = (TextView) tableRow.findViewById(R.id.lblN1);
            TextView lblN2  = (TextView) tableRow.findViewById(R.id.lblN2);
            TextView lblN3  = (TextView) tableRow.findViewById(R.id.lblN3);
            TextView lblN4  = (TextView) tableRow.findViewById(R.id.lblN4);
            TextView lblMedia  = (TextView) tableRow.findViewById(R.id.lblMedia);

            lblNome.setText(""+(i+1));
            lblN1.setText("2014-02-05");
            lblN2.setText("2014-02-05");
            lblN3.setText("2014-02-05");
            lblN4.setText("2014-02-05");
            lblMedia.setText(""+(20+(i+1)));
            table.addView(tableRow);
        }
    }
}
