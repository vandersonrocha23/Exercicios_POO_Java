/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufba.exercicioincremental;

/**
 *
 * @author vande
 */
public class ExercicioIncremental {

    public static void main(String[] args) {
        // Criando o Proprietário
        Proprietario dono = new Proprietario("Marcos Rocha", "marcos@email.com", "senha123");
        
        // Criando o Estudante
        Estudante aluno = new Estudante("Ana Clara", "ana@ufba.br", "minhasenha", "202410500");

        // Criando o Imóvel e associando ao proprietário via construtor
        Imovel apto = new Imovel(dono, "Quarto individual perto da biblioteca", "Ondina, Salvador");

        System.out.println("--- Sistema de Moradia Universitária ---");
        
        // Teste de Autenticação do Aluno
        if (aluno.autenticar("ana@ufba.br", "minhasenha")) {
            System.out.println("Login realizado para a estudante: " + aluno.getNomeCompleto());
        }

        // Teste de Associação (Estudante demonstra interesse no Imóvel)
        apto.adicionarInteressado(aluno);
        System.out.println("O imóvel em " + apto.getDescricaoCompleta() + " recebeu um novo interessado.");
    }
}

