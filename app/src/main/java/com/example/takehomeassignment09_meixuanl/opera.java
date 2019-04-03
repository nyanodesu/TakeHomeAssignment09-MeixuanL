package com.example.takehomeassignment09_meixuanl;

public class opera {
    private String name;
    private String composer;
    private int premiere;

    public opera(String name, String composer, int premiere){
        this.name = name;
        this.composer = composer;
        this.premiere = premiere;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public int getPremiere() {
        return premiere;
    }

    public void setPremiere(int premiere) {
        this.premiere = premiere;
    }
}
