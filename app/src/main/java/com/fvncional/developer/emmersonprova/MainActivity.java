package com.fvncional.developer.emmersonprova;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fvncional.developer.emmersonprova.Database.AppDatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;


public class MainActivity extends AppCompatActivity {

    Button btnProf, btnAluno, btnRelatorio, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProf = findViewById(R.id.btnProf);
        btnAluno = findViewById(R.id.btnAluno);
        btnRelatorio = findViewById(R.id.btnRelatorio);
        btnSair = findViewById(R.id.btnSair);

        btnProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ProfessorActivity.class);
                startActivity(i);
            }
        });

        btnAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AlunoActivity.class);
                startActivity(i);
            }
        });

        btnRelatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, RelatorioActivity.class);
                startActivity(i);
            }
        });

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("sistema", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor;
                editor = sharedPreferences.edit();
                editor.putBoolean("logado", false);
                editor.putString("login", "");
                editor.commit();
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
                MainActivity.this.finish();
            }
        });
    }
}
