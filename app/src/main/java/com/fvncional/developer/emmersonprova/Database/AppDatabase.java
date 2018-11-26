package com.fvncional.developer.emmersonprova.Database;

import com.fvncional.developer.emmersonprova.DAO.AlunoDAO;
import com.fvncional.developer.emmersonprova.DAO.DisciplinaDAO;
import com.fvncional.developer.emmersonprova.DAO.NotaDAO;
import com.fvncional.developer.emmersonprova.DAO.ProfessorDAO;
import com.fvncional.developer.emmersonprova.Models.Aluno;
import com.fvncional.developer.emmersonprova.Models.Disciplina;
import com.fvncional.developer.emmersonprova.Models.Nota;
import com.fvncional.developer.emmersonprova.Models.Professor;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Professor.class, Aluno.class, Disciplina.class, Nota.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract AlunoDAO alunoDAO();
    public abstract DisciplinaDAO disciplinaDAO();
    public abstract NotaDAO notaDAO();
    public abstract ProfessorDAO professorDAO();
}
