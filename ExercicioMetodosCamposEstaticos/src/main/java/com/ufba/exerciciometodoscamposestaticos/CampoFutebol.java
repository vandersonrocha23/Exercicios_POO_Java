/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.exerciciometodoscamposestaticos;

/**
 *
 * @author vande
 */
public class CampoFutebol {
    public static void main(String[] args){
        double areaCampo = 8250.0;
        
        double areaPes = ConversaoDeUnidadesDeArea.metrosParaPeQuadrados(areaCampo);
     
        double areaAcre = ConversaoDeUnidadesDeArea.metroParaAcre(areaCampo);
        
        double areaCm = ConversaoDeUnidadesDeArea.metrasPcmQuadrado(areaCampo);
        
        System.out.println("---Area do Campo de Futebol: 8250 metros quadrados---");
        System.out.println("---Em pés quadrados: " + areaPes);
        System.out.println("---Em cm quadrados: " + areaCm);
        System.out.println("---Em acre: "+ areaAcre);
    }
    
}
