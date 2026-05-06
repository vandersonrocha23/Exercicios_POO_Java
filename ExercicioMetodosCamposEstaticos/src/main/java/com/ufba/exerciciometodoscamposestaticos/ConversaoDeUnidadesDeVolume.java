/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.exerciciometodoscamposestaticos;

/**
 *
 * @author vande
 */
public class ConversaoDeUnidadesDeVolume {
    public static double litrosEmCmCubicos(double litros){
        return litros * 1000;
    } 
    public static double mCubicosEmLitros(double metro){
        return metro * 1000;
    }
    public static double mCubicosEmPesCubicos(double metros){
        return metros * 35.32;
    }
    public static double galaoEmPolCubicas(double galao){
        return galao * 231;
    }
    public static double galaoEmLitros(double galao){
        return galao * 3.785;
    }
    public static double mCubicosEmCmCubicos(double metros){
        double litros = mCubicosEmLitros(metros);
        return litrosEmCmCubicos(litros);
    }
    // Litros, pes cubicos e e centimentros cubicos.
    
}
