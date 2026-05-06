/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.empresa;

/**
 *
 * @author vande
 */
public class Funcionario {
    private String nome;
    private String matricula;
    private String funcao;
    private float salarioBruto;
    private String departamento;
    private boolean ehProprio;
    private double[] pagamentoliquido;

    public Funcionario(String nome, String matricula, String funcao, float salarioBruto, String departamento, boolean ehProprio) {
        this.nome = nome;
        this.matricula = matricula;
        this.funcao = funcao;
        this.salarioBruto = salarioBruto;
        this.departamento = departamento;
        this.ehProprio = ehProprio;
        this.pagamentoliquido = new double[12];
        calcularFolha();
    }
    private void calcularFolha(){
        double taxaDesconto;
        if (this.ehProprio == true){
            taxaDesconto = 0.10;
        } else {
            taxaDesconto = 0.08;
        }
        double liquido = this.salarioBruto * (1-taxaDesconto);
        for (int i = 0; i<12; i++){
            this.pagamentoliquido[i]= liquido;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalarioliquido(int mes) {
        return pagamentoliquido[mes-1];
    }

    public boolean isEhProprio() {
        return ehProprio;
    }
    
    
    
    
}
    
    
    
