package com.fvncional.developer.emmersonprova.Controller;

import android.content.Context;

import com.fvncional.developer.emmersonprova.Database.AppDatabase;
import com.fvncional.developer.emmersonprova.Models.Disciplina;

import java.util.List;

import androidx.room.Room;

public class DisciplinaController {

    private AppDatabase db;
    private String mensagem;

    public DisciplinaController(Context context) {
        db = Room.databaseBuilder(context, AppDatabase.class, "Banco").allowMainThreadQueries().build() ;
    }

    public void inserir(Disciplina disciplina) {
        db.disciplinaDAO().insertAll(disciplina);
    }

    public void atualizar(Disciplina disciplina) {
        db.disciplinaDAO().updateAll(disciplina);
    }

    public void deletar(Disciplina disciplina) {
        db.disciplinaDAO().delete(disciplina);
    }

    public List<Disciplina> listarTodos() {
        return db.disciplinaDAO().listDisciplina();
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
