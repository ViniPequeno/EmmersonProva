package com.fvncional.developer.emmersonprova.DAO;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface Professor {
    @Query("SELECT * FROM professor")
    List<Professor> listProfessor();

    @Query("SELECT * FROM professor WHERE id = :id")
    Professor getAluno(int id);

    @Insert
    void insertAll(Professor... professors);

    @Update
    void updateAll(Professor... professors);

    @Delete
    void delete(Professor... professors);
}
