/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA7QUESTION1;

/**
 *
 * @author vande
 */
public class PessoaEmpregada extends Pessoa {
    private float salario;
    
   public PessoaEmpregada(String nome, String cpf, float salario){
       super(nome, cpf);
       this.salario = salario;
   }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    @Override
    public float calcularEmprestimo(){
       return this.salario*2;
   }
    
   
    
}
