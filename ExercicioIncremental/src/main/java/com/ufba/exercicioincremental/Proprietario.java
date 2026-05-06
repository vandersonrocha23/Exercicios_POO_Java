/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.exercicioincremental;

/**
 *
 * @author vande
 */
public class Proprietario {
    private String nomeCompleto;
    private String email;
    private String senha;
    private String documentosPropriedade;

    public Proprietario(String nomeCompleto, String email, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
    }
    
    public boolean autenticar(String email, String senha){
        return this.email.equals(email) && this.senha.equals(senha);
    }

    public String getDocumentosPropriedade() {
        return documentosPropriedade;
    }

    public void setDocumentosPropriedade(String documentosPropriedade) {
        this.documentosPropriedade = documentosPropriedade;
    }
    
    
    
}
