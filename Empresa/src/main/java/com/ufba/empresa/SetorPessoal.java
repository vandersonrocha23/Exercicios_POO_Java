/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufba.empresa;

/**
 *
 * @author vande
 */
import java.util.ArrayList;
import java.util.List;
public class SetorPessoal {
    private String nomeEmpresa;
    private List<Funcionario> funcionarios;

    public SetorPessoal(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.funcionarios = new ArrayList<>();
    }
    
    public void admitirFuncionario(Funcionario f){
        this.funcionarios.add(f);
    }
    
    public void ImprimirFolhaJunho(){
        System.out.println("---FOLHA DE PAGAMENTO: JUNHO 2026---");
        for (Funcionario f: funcionarios){
            System.out.println("Nome: %s | Depto: %s | Função: %s | Tipo: %s | Bruto: R$%.2f | Líquido: R$%.2f%n",
                    f.getNome(), f.getDepartamento(), f.getFuncao(), f.isEhProprio() ? "Proprio" : "Terceirizado",
                    f.getSalarioBruto() f.getSalarioliquido(6));
        }
    }
    
    
    
}
