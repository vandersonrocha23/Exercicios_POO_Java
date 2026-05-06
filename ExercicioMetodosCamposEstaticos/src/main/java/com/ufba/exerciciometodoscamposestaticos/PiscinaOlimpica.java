/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.exerciciometodoscamposestaticos;

/**
 *
 * @author vande
 */
public class PiscinaOlimpica {
    public static void main (String[] args){
        double volumePiscina = 1890;
        
        double conversaoLitrosCubicos = ConversaoDeUnidadesDeVolume.mCubicosEmLitros(volumePiscina);
        double conversaoPesCubicos = ConversaoDeUnidadesDeVolume.mCubicosEmPesCubicos(volumePiscina);
        double volumeCm = ConversaoDeUnidadesDeVolume.mCubicosEmCmCubicos(volumePiscina);
        
        System.out.println("Volume da piscina olímpica (1.890 m³):");
        System.out.println("Em litros: " + conversaoLitrosCubicos );
        System.out.println("Em pes cubicos: "+ conversaoPesCubicos );
        System.out.println("Em cm cubicos: "+ volumeCm);
    }
    
}
