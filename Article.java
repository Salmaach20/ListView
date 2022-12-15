package com.example.liste;
//package org.o7planning.simplelistview;


public class Article {
    public int code;
    public String libelle;
    public int pu;

    public Article(int code ,String libelle ,int pu) {
        this.pu = pu;
        this.libelle=libelle;
        this.code=code;
    }

    public int getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getpu() {
        return pu;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setpu(int pu) {
        pu = pu;
    }

    @Override
    public String toString() {
        return "Article      "+ code+"       "  + libelle +"         " + pu ;
    }
}