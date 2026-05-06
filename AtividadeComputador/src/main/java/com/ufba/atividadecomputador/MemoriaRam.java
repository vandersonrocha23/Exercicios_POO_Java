/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.atividadecomputador;

/**
 *
 * @author vande
 */
public class MemoriaRam {
    //atributos
    private String marca;
    private String tipo;
    private int capacidade;
    private int frequencia;

    //metodo construtor
    public MemoriaRam(String marca, String tipo, int capacidade, int frequencia) {
        this.marca = marca;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.frequencia = frequencia;
    }

    
    //metodos especiais
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
    

}
