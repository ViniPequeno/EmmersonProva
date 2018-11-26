package com.fvncional.developer.emmersonprova.DAO;

import com.fvncional.developer.emmersonprova.Models.Aluno;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface AlunoDAO {
    @Query("SELECT * FROM aluno")
    List<Aluno> listAluno();

    @Query("SELECT * FROM aluno WHERE matricula = :matricula")
    Aluno getAluno(String matricula);

    @Insert
    void insertAll(Aluno... alunos);

    @Update
    void updateAll(Aluno... alunos);

    @Delete
    void delete(Aluno... alunos);
}
