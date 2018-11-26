package com.fvncional.developer.emmersonprova.Models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "professor")
public class Professor {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nome;
    private Disciplina disciplina;
    private String turma;
    private String senha;

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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

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
