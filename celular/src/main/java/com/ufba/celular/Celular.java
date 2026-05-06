/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufba.celular;

/**
 *
 * @author vande
 */
public class Celular {

    public static void main(String[] args) {
        Iphone c1 = new Iphone();
        c1.modelo = "Iphone 16e";
        c1.saudebateria = 79;
        c1.cor= "preto";
        c1.marca = "Apple";
        c1.carregado = false;
        
        c1.comprariphone();
        c1.carga();
        c1.resumodoaparelho();
           
            
        
    }
}
