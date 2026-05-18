/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufba.herancapooexercicio;

/**
 *
 * @author vande
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();

        // 1. Cadastro
        contas.add(new ContaCorrente(1, "João", 100.0, 10.0));
        contas.add(new ContaCorrente(2, "Maria", 50.0, 5.0));
        
        contas.add(new ContaEspecial(3, "Jose", 100.0, 500.0));
        contas.add(new ContaEspecial(4, "Ana", 50.0, 200.0));
        
        contas.add(new ContaPoupanca(5, "Carlos", 1000.0, 0.5));
        contas.add(new ContaPoupanca(6, "Beatriz", 2000.0, 1.0));

        // 2. Teste de Saques
        System.out.println("--- Testando Saques ---");
        contas.get(0).sacar(150); // Corrente João: Deve negar
        contas.get(2).sacar(400); // Especial Jose: Deve aceitar (limite)
        contas.get(4).sacar(1500); // Poupança Carlos: Deve negar

        // 3. Processamento Mensal
        for (Conta c : contas) {
            c.processamentoMensal();
        }

        // 4. Listagem Final
        System.out.println("\n--- Listagem de Contas (Pós Processamento) ---");
        for (Conta c : contas) {
            System.out.println(c.exibirDados());
        }
    }
}