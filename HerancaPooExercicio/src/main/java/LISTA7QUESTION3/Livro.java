/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA7QUESTION3;

/**
 *
 * @author vande
 */
public class Livro extends Titulo {
    private String autorPrincipal;
    private String resumo;
    
    public Livro(String nome, String editora, double preco, String autor, String resumo){
        super(nome, editora, preco);
        this.autorPrincipal = autor;
        this.resumo = resumo;
    }
    public String consultarResumo(){
        return resumo;
    }
    @Override
    public double calcularDescontoEspecifico(){
        return this.preco * 0.03;
    }

    @Override
    public String toString() {
        return "Livro: " +nome+" | Autor: "+ autorPrincipal+ " | Editora: " + editora+ " | Preço: "+preco;
    }
    
}
