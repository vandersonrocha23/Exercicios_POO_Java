/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaBancaria;

/**
 *
 * @author vande
 */
public class Especial extends Conta {
    private double debitoMensal;
    private double limite;
    public Especial(String titular, String agencia, double debitoMensal, double limite){
        super(titular, agencia);
        this.debitoMensal = debitoMensal;
        this.limite = limite;
    }
    @Override
    public boolean sacar(double valor){
        if (valor > 0 && (getSaldo() + limite) >=valor){
            alterarSaldo(-valor);
            return true;
        }
        return false;
    }
    public void cobrarTaxaMensal(){
        alterarSaldo(-debitoMensal);
    }
    
}
