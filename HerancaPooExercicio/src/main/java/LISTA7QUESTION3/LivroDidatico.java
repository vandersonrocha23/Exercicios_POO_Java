/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA7QUESTION3;

/**
 *
 * @author vande
 */
public class LivroDidatico extends Livro {
    private String area;
    
    public LivroDidatico(String nome, String editora, double preco, String autor, String resumo,  String area){
        super(nome, editora,preco, autor , resumo );
        this.area = area;
    }
    @Override
    public double calcularDescontoEspecifico(){
        return this.preco*0.10;
    }
    @Override
    public String toString(){
        return super.toString() + " | Area: "+ area;
    }
    
}
