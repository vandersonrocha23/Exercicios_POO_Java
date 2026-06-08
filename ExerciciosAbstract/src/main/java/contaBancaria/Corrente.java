/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaBancaria;

/**
 *
 * @author vande
 */
public class Corrente extends Conta {
    public Corrente(String titular, String agencia){
        super(titular, agencia);
    }
    @Override
    public boolean sacar(double valor){
        if (valor > 0 && getSaldo()>=valor){
            alterarSaldo(-valor);
            return true;
        }
        return false;
    }
    
}
