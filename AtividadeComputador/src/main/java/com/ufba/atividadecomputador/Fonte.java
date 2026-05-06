/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.atividadecomputador;

/**
 *
 * @author vande
 */
public class Fonte {
    private String marca;
    private boolean bivolt;

    public Fonte(String marca, boolean bivolt) {
        this.marca = marca;
        this.bivolt = bivolt;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isBivolt() {
        return bivolt;
    }

    public void setBivolt(boolean bivolt) {
        this.bivolt = bivolt;
    }
 
}
