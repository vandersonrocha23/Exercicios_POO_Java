/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufba.heranca;

/**
 *
 * @author vande
 */
public class Heranca {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Vanderson");
        p2.setNome("Claudia");
        p3.setNome("Alisson");
        p4.setNome("Ilson");
        
        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);
        
        p2.setCurso("Ciencia da Computacao");
        p3.setSalario(2500.00f);
        p4.setSetor("Estoque");
        
        p3.receberAumento(505.05f);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        
        
       
        
        
    }
}
