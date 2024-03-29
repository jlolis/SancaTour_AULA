package com.example.joaoelolis.sancatour.modelos;

public class Ponto {

    private String id;
    private String nome;
    private String distancia;


    public Ponto(String id, String nome, String distancia) {
        this.id = id;
        this.nome = nome;
        this.distancia = distancia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }
}
