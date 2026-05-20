/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA7QUESTION3;

/**
 *
 * @author vande
 */
public class Titulo {
    protected String nome;
    protected String editora;
    protected double preco;

    public Titulo(String nome, String editora, double preco) {
        this.nome = nome;
        this.editora = editora;
        this.preco = preco;
    }
    public double getDescontoBase(){
        return this.preco * 0.0005;
    }
    
    public double calcularDescontoEspecifico(){
        return 0;
    }

    @Override
    public String toString() {
        return "Titulo{" + "nome=" + nome + ", editora=" + editora + ", preco=" + preco + '}';
    }

    public String getNome() {
        return nome;
    }

    public String getEditora() {
        return editora;
    }

    public double getPreco() {
        return preco;
    }
    
    
    
    
    
    
}
