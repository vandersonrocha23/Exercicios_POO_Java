/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufba.bradesco;

/**
 *
 * @author vande
 */
public class Bradesco {

    public static void main(String[] args) {
        ContaBancaria p1= new ContaBancaria();
        p1.setNumConta(12459090);
        p1.setDono("Vanderson Coutinho Rocha");
        p1.abrirConta("CC");
        
        
        ContaBancaria p2 = new ContaBancaria();
        p2.setNumConta(99994444);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        
        p1.sacar(150);
        p1.fecharConta();
        
        
        p1.estadoatual();
        p2.estadoatual();
        
        
        //p1.setTipo("CP")

        //p1.setSaldo(1622);
        
    }
}
