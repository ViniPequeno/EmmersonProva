package com.fvncional.developer.emmersonprova.DAO;

import com.fvncional.developer.emmersonprova.Models.Aluno;
import com.fvncional.developer.emmersonprova.Models.Nota;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface NotaDAO {
    @Query("SELECT * FROM nota WHERE aluno = :aluno")
    List<Nota> listAluno(int aluno);

    @Insert
    void insertAll(Nota... notas);

    @Update
    void updateAll(Nota... notas);
}
