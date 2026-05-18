/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.herancapooexercicio;

/**
 *
 * @author vande
 */
public class Conta {
    private int numero;
    private String titular;
    protected double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    // Lógica padrão: não permite saldo negativo
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque de R$ " + valor + " negado: saldo insuficiente.");
        }
    }

    public void processamentoMensal() {
        // Vazio na classe base, será preenchido nas filhas
    }

    public String exibirDados() {
        return "Número: " + numero + " | Titular: " + titular + " | Saldo: R$ " + saldo;
    }
}