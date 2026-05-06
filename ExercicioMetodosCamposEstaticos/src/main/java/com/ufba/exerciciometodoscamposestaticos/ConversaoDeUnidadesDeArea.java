/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.exerciciometodoscamposestaticos;

/**
 *
 * @author vande
 */
public class ConversaoDeUnidadesDeArea {
    
    public static double metrosParaPeQuadrados(double metros){
        return metros * 10.76f;
    }
    public static double pesQuadrados(double pes){
        return pes * 929;
    }
    public static double milhasQuadradas(double centimetros){
        return centimetros * 640;
    }
    public static double acre(double pes ){
        return pes * 43.560f;
    } 
    
    public static double metrasPcmQuadrado(double metros){
        double pes = metrosParaPeQuadrados(metros);
        return pesQuadrados(pes);    
    }
    public static double metroParaAcre(double metros){
        double pes = metrosParaPeQuadrados(metros);
        return pes / 4356.0;
    }
}
