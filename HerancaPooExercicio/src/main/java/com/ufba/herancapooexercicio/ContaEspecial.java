/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.herancapooexercicio;

/**
 *
 * @author vande
 */
public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, String titular, double saldo, double limite) {
        super(numero, titular, saldo);
        this.limite = limite;
    }

    // Sobrescrevemos o saque para permitir o uso do limite
    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= (saldo + limite)) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado (Limite utilizado).");
        } else {
            System.out.println("Saque de R$ " + valor + " negado: limite excedido.");
        }
    }
}