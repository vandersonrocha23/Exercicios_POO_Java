/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.exerciciomapset;

/**
 *
 * @author vande
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Enquete {
    private String id;
    private String pergunta;
    private List<String> opcoes;
    private Map<String, Integer> votos;
    private Set<String> usuariosVotaram;

    public Enquete(String id, String pergunta, List<String> opcoes) {
        this.id = id;
        this.pergunta = pergunta;
        this.opcoes = new ArrayList<>(opcoes); 
        this.votos = new HashMap<>();
        this.usuariosVotaram = new HashSet<>();

        for (String opcao : this.opcoes) {
            this.votos.put(opcao, 0);
        }
    }

    public void votar(String usuario, String opcao) {

        if (usuariosVotaram.contains(usuario)) {
            System.out.println("Voto ignorado: O usuário '" + usuario + "' já votou nesta enquete.");
            return;
        }

        if (!opcoes.contains(opcao)) {
            System.out.println("Voto ignorado: A opção '" + opcao + "' é inválida.");
            return;
        }

        int votosAtuais = votos.get(opcao);
        votos.put(opcao, votosAtuais + 1);
        usuariosVotaram.add(usuario);
        System.out.println("Voto de '" + usuario + "' registrado com sucesso na opção: " + opcao);
    }

    public Map<String, Integer> getResults() {
        return votos;
    }

    public String getWinner() {
        String vencedora = null;
        int maxVotos = -1;

        for (Map.Entry<String, Integer> entrada : votos.entrySet()) {
            if (entrada.getValue() > maxVotos) {
                maxVotos = entrada.getValue();
                vencedora = entrada.getKey();
            }
        }
        
        return vencedora;
    }

    public String getId() {
        return id;
    }
}