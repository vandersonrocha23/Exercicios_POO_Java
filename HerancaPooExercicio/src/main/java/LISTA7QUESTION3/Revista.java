/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA7QUESTION3;

/**
 *
 * @author vande
 */
public class Revista extends Titulo{
    private String periodicidade;
    
    public Revista(String nome, String editora, double preco, String periodicidade){
        super(nome, editora, preco);
        this.periodicidade = periodicidade;
    }
    public boolean temMesmaEditora(Revista outra){
        return this.editora.equalsIgnoreCase(outra.getEditora());
    }
    @Override
    public double calcularDescontoEspecifico(){
        return this.preco * 0.02;
    }
    @Override
    public String toString() {
        return "Revista: " + nome + " | Editora: " + editora + " | Periodicidade: " + periodicidade + " | Preço: R$" + preco;
    }
    
}
