/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Faculdade;

/**
 *
 * @author vande
 */
public abstract class Curso {
    private String codigo;
    private String nome;
    private String area;
    private int nmrVagas;
    private double taxaMatricula;

    public Curso(String codigo, String nome, String area, int nmrVagas, double taxaMatricula) {
        this.codigo = codigo;
        this.nome = nome;
        this.area = area;
        this.nmrVagas = nmrVagas;
        this.taxaMatricula = taxaMatricula;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getArea() {
        return area;
    }

    public int getNmrVagas() {
        return nmrVagas;
    }

    public double getTaxaMatricula() {
        return taxaMatricula;
    }
    public abstract String consultarInformacoes();
    public abstract double calcularPrecoMatricula(boolean convenio);
    
    
    
    
    
    
}
