package com.fvncional.developer.emmersonprova.Models;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "nota")
public class Nota {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private float media, nota1, nota2, nota3,nota4;

    @ForeignKey(
            entity = Aluno.class,
            parentColumns = "matricula",
            childColumns = "matAluno")
    private String matAluno;

    @ForeignKey(
            entity = Disciplina.class,
            parentColumns = "id",
            childColumns = "disciplinaId")
    private int disciplinaId;

    public Nota() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatAluno() {
        return matAluno;
    }

    public void setMatAluno(String matAluno) {
        this.matAluno = matAluno;
    }

    public int getDisciplinaId() {
        return disciplinaId;
    }

    public void setDisciplinaId(int disciplinaId) {
        this.disciplinaId = disciplinaId;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }
}
