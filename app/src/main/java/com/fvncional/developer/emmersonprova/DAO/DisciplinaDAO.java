package com.fvncional.developer.emmersonprova.DAO;

import com.fvncional.developer.emmersonprova.Models.Disciplina;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface DisciplinaDAO {
    @Query("SELECT * FROM disciplina")
    List<Disciplina> listDisciplina();

    @Query("SELECT * FROM disciplina WHERE id = :id")
    Disciplina getDiscplina(int id);

    @Insert
    void insertAll(Disciplina... disciplinas);

    @Update
    void updateAll(Disciplina... disciplinas);

    @Delete
    void delete(Disciplina... disciplinas);
}
