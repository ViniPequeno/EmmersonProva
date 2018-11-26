package com.fvncional.developer.emmersonprova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fvncional.developer.emmersonprova.Database.AppDatabase;

import androidx.room.Room;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name").build();
    }
}
