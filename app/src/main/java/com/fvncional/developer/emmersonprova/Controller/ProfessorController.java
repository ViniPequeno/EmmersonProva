package com.fvncional.developer.emmersonprova.Controller;

import android.content.Context;

import com.fvncional.developer.emmersonprova.Database.AppDatabase;
import com.fvncional.developer.emmersonprova.Models.Professor;

import java.util.List;

import androidx.room.Room;

public class ProfessorController {

    private AppDatabase db;
    private String mensagem;

    public ProfessorController(Context context) {
        db = Room.databaseBuilder(context, AppDatabase.class, "Banco").allowMainThreadQueries().build() ;
    }

    public void inserir(Professor professor) {
        db.professorDAO().insertAll(professor);
    }

    public void atualizar(Professor professor) {
        db.professorDAO().updateAll(professor);
    }

    public void deletar(Professor professor) {
        db.professorDAO().delete(professor);
    }

    public Professor login(String login, String senha) {
        return db.professorDAO().login(login,senha);
    }

    public List<Professor> listarTodos() {
        return db.professorDAO().listProfessor();
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
