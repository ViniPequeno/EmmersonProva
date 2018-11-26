package com.fvncional.developer.emmersonprova.Controller;

import android.content.Context;

import com.fvncional.developer.emmersonprova.Database.AppDatabase;
import com.fvncional.developer.emmersonprova.Models.Aluno;

import java.util.List;

import androidx.room.Room;

public class AlunoController {

    private AppDatabase db;
    private String mensagem;

    public AlunoController(Context context) {
        db = Room.databaseBuilder(context, AppDatabase.class, "Banco").allowMainThreadQueries().build() ;
    }

    public void inserir(Aluno aluno) {
        db.alunoDAO().insertAll(aluno);
    }

    public void atualizar(Aluno aluno) {
        db.alunoDAO().updateAll(aluno);
    }

    public void deletar(Aluno aluno) {
        db.alunoDAO().delete(aluno);
    }

    public List<Aluno> listarTodos() {
        return db.alunoDAO().listAluno();
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
