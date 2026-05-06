/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.exercicioincremental;

/**
 *
 * @author vande
 */
public class Estudante {
    private String nomeCompleto;
    private String dataDeNascimento;
    private String celular;
    private String email;
    private String senha;
    private String nmrMatricula;
    private String universidade;
    private int idade;
    private String descricaoPessoal;

    public Estudante(String nomeCompleto, String email, String senha, String nmrMatricula) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.nmrMatricula = nmrMatricula;
    }
    public boolean autenticar(String email, String senha){
        return this.email.equals(email) && this.senha.equals(senha);
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNmrMatricula() {
        return nmrMatricula;
    }

    public void setNmrMatricula(String nmrMatricula) {
        this.nmrMatricula = nmrMatricula;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDescricaoPessoal() {
        return descricaoPessoal;
    }

    public void setDescricaoPessoal(String descricaoPessoal) {
        this.descricaoPessoal = descricaoPessoal;
    }
    
    
}
