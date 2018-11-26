package com.fvncional.developer.emmersonprova.Models;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "professor")
public class Professor {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int matricula;
    private String nome;
    private String login;
    private String turma;
    private String senha;

    @ForeignKey(
            entity = Disciplina.class,
            parentColumns = "id",
            childColumns = "disciplinaId")
    private int disciplinaId;

    public Professor(){

    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public Professor(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() { return login; }

    public void setLogin(String login) { this.login = login; }

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
