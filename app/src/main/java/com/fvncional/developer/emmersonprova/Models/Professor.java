package com.fvncional.developer.emmersonprova.Models;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "professor")
public class Professor {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nome;
    private String turma;
    private String senha;

    @ForeignKey(
            entity = Disciplina.class,
            parentColumns = "id",
            childColumns = "disciplinaId")
    private int disciplinaId;

    public Professor(){

    }
    public Professor(int id) {
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

    public int getDisciplinaId() { return disciplinaId; }

    public void setDisciplinaId(int disciplina) { this.disciplinaId = disciplina; }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
