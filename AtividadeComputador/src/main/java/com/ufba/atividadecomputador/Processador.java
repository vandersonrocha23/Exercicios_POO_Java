/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.atividadecomputador;

/**
 *
 * @author vande
 */
public class Processador {
    private String marca;
    private String modelo;
    private double frequencia;
    private int nucleos;

    public Processador(String marca, String modelo, double frequencia, int nucleos) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
        this.nucleos = nucleos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }
    
    
}
