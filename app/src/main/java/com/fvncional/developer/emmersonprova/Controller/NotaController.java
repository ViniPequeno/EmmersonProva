package com.fvncional.developer.emmersonprova.Controller;

import android.content.Context;

import com.fvncional.developer.emmersonprova.Database.AppDatabase;
import com.fvncional.developer.emmersonprova.Models.Nota;

import java.util.List;

import androidx.room.Room;

public class NotaController {

    private AppDatabase db;
    private String mensagem;

    public NotaController(Context context) {
        db = Room.databaseBuilder(context, AppDatabase.class, "Banco").allowMainThreadQueries().build() ;
    }

    public void inserir(Nota nota) {
        db.notaDAO().insertAll(nota);
    }

    public void atualizar(Nota nota) {
        db.notaDAO().updateAll(nota);
    }

    public List<Nota> listAluno(int idAluno) {
        return db.notaDAO().listAluno(idAluno);
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
