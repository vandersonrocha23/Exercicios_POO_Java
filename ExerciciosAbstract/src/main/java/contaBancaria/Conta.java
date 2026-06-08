/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaBancaria;

/**
 *
 * @author vande
 */
public abstract class Conta {
    private String titular;
    private String agencia;
    private double saldo;

    public Conta(String titular, String agencia) {
        this.titular = titular;
        this.agencia = agencia;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor){
        if (valor > 0){
            this.saldo +=valor;
        }
    }
    protected void alterarSaldo(double valor){
        this.saldo +=valor;
    }
    public abstract boolean sacar(double valor);
    
    
}
