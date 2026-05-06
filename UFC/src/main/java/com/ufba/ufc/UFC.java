/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufba.ufc;

/**
 *
 * @author vande
 */
public class UFC {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Anderson Silva", "Brazil", 36, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Chael Sonnen", "EUA", 34, 1.69f, 58.1f, 45, 12, 2);
        l[2] = new Lutador("Jon Jones", "EUA", 28, 1.65f, 80.9f, 30, 0, 0);
        l[3] = new Lutador("Alex Pereira", "Brazil", 29, 1.95f, 81.5f, 13, 2,0);
        l[4] = new Lutador("Conor McGregor", "Irlanda", 28, 1.78f, 119.1f, 25, 4, 0);
        l[5] = new Lutador("Khabib Nurmagomedov", "Russia", 29, 1.76f, 105.8f, 30, 0, 0);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();
       
              
    }
}
