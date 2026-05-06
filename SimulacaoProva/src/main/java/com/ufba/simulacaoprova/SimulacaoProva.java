/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufba.simulacaoprova;

/**
 *
 * @author vande
 */
public class SimulacaoProva {

    public static void main(String[] args) {
        Prato p1 = new Prato(1, "Feijoada", 30.0f);
        Prato p2 = new Prato(2, "Cerveja", 10.0f);
        
        Mesa mesa = new Mesa(10, "Vanderson", "081.323.165-50", 2, p1);
        
        mesa.adicionarPrato(p2);
        mesa.adicionarPrato(p1);
        
        mesa.imprimirResultado();
        System.out.println("-----");
        
        mesa.imprimirConta(true);
        System.out.println("-----");
        
        mesa.imprimirConta(false);
        System.out.println("-----");
        
        mesa.removerPrato(1, true);
        
        mesa.imprimirConta(true);
    }
}
