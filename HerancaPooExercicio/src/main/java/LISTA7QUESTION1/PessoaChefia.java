/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA7QUESTION1;

/**
 *
 * @author vande
 */
public class PessoaChefia extends PessoaEmpregada{
    private float bonus;
    public PessoaChefia(String nome, String cpf, float salario, float bonus){
        super(nome, cpf, salario);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public float calcularEmprestimo(){
        return super.calcularEmprestimo() + this.bonus;
    }
    
}
