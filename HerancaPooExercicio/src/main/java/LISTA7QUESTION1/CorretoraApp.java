/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA7QUESTION1;

/**
 *
 * @author vande
 */
import java.util.ArrayList;

public class CorretoraApp {
    public static void main(String[] args){
        ArrayList<Pessoa> clientes = new ArrayList<>();
        
        clientes.add(new Pessoa("Vanderson", "071.696.485-89"));
        
        clientes.add(new PessoaEmpregada("Paulo", "789.456.123-00", 1520.00f));
        
        clientes.add(new PessoaChefia("Katia", "123.456.789-20", 3000.00f, 500.00f));
        
        System.out.println("---RELATÓRIO DE EMPRÉSTIMO---");
        for (Pessoa p: clientes) {
                System.out.println(p.exibirDados());
        }
    }
    
}
