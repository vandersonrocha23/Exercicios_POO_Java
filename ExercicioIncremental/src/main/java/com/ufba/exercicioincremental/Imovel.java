/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.exercicioincremental;

/**
 *
 * @author vande
 */
import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private Proprietario propietario;
    private String localizacaoDetalhada;
    private String descricaoCompleta;
    private List<Estudante> interessados;

    public Imovel(Proprietario propietario, String localizacaoDetalhada, String descricaoCompleta) {
        this.propietario = propietario;
        this.localizacaoDetalhada = localizacaoDetalhada;
        this.descricaoCompleta = descricaoCompleta;
        this.interessados = new ArrayList<>();
    }
    
    public void adicionarInteressado(Estudante estudante){
        this.interessados.add(estudante);
    }

    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

    public void setDescricaoCompleta(String descricaoCompleta) {
        this.descricaoCompleta = descricaoCompleta;
    }
    
    
    
}
