/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.herancapooexercicio;

/**
 *
 * @author vande
 */
public class ContaCorrente extends Conta {
    private double taxaMensal;

    public ContaCorrente(int numero, String titular, double saldo, double taxa) {
        super(numero, titular, saldo); // Chama o construtor da mãe
        this.taxaMensal = taxa;
    }

    @Override
    public void processamentoMensal() {
        saldo -= taxaMensal;
    }
}