/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.exercicioincremental;

/**
 *
 * @author vande
 */
public class Contrato {
    private Imovel imovel;
    private String status;
    private boolean assinadoEstudante;
    private boolean assinadoProprietario;

    public Contrato(Imovel imovel) {
        this.imovel = imovel;
        this.status = "Pendente";
    }
    public void registrarAssinaturas(String perfil){
        if (perfil.equals("Estudante")) assinadoEstudante  = true;
        if (perfil.equals("Proprietario")) assinadoProprietario = true;
        verificarVigencia();
    }
    public void verificarVigencia(){
        if (assinadoEstudante && assinadoProprietario){
            this.status = "Vigente";
        }
    }
    public String getStatus(){
        return status;
    }
    
}
