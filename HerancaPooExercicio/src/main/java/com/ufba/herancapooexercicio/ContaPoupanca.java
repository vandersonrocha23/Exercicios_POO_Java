/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.herancapooexercicio;

/**
 *
 * @author vande
 */
public class ContaPoupanca extends Conta {
    private double percentual;

    public ContaPoupanca(int numero, String titular, double saldo, double percentual) {
        super(numero, titular, saldo);
        this.percentual = percentual;
    }

    @Override
    public void processamentoMensal() {
        saldo += saldo * (percentual / 100);
    }
}