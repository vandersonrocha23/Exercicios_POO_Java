/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaBancaria;

/**
 *
 * @author vande
 */
public class Poupanca extends Conta {
    private double taxaRendimento;
    
    public Poupanca(String titular, String agencia, double taxa){
        super(titular, agencia);
        this.taxaRendimento = taxa;
    }
    @Override
    public boolean sacar(double valor){
        if(valor > 0 && getSaldo() >= valor){
            alterarSaldo(-valor);
            return true;
        }
        return false;
    }
    public void creditarRendimentoMensal(){
        double rendimento = getSaldo() * taxaRendimento;
        if (rendimento > 0){
            alterarSaldo(rendimento);
        }
    }
    
}
