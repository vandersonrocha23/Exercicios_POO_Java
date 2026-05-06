/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.exerciciomapset;

/**
 *
 * @author vande
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciadorDeEnquetes {
    private Map<String, Enquete> bancoDeEnquetes;

    public GerenciadorDeEnquetes() {
        this.bancoDeEnquetes = new HashMap<>();
    }

    public void criarEnquete(String id, String pergunta, List<String> opcoes) {
        if (bancoDeEnquetes.containsKey(id)) {
            System.out.println("Erro: Já existe uma enquete com o ID " + id);
            return;
        }
        
        Enquete novaEnquete = new Enquete(id, pergunta, opcoes);
        bancoDeEnquetes.put(id, novaEnquete);
        System.out.println("Enquete '" + pergunta + "' criada com sucesso!");
    }

    public Enquete getEnquete(String id) {
        return bancoDeEnquetes.get(id);
    }
}
