package com.fvncional.developer.emmersonprova.Models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "disciplina")
public class Disciplina {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String nome;

    public Disciplina(){

    }
    public Disciplina(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
