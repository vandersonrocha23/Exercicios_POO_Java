/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.atividadecomputador;

/**
 *
 * @author vande
 */
public class ArmazenamentoInterno {
    private String marca;
    private int capacidade;
    private String typeinterface;

    public ArmazenamentoInterno(String marca, int capacidade, String typeinterface) {
        this.marca = marca;
        this.capacidade = capacidade;
        this.typeinterface = typeinterface;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getTypeinterface() {
        return typeinterface;
    }

    public void setTypeinterface(String typeinterface) {
        this.typeinterface = typeinterface;
    }
 
}
