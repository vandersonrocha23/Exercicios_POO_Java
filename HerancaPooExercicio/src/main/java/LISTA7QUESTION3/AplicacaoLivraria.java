/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA7QUESTION3;

/**
 *
 * @author vande
 */
public class AplicacaoLivraria {
    public static String nomeLivraria = "Livaria VCR";
    
    public static void main(String[] args){
        Revista r1 = criarRevista("Placar", "Maio", 20.0, "Semanal");
        
        Revista r2 = criarRevista("Lance", "Maio", 18.0, "Mensal");
        
        LivroDidatico ld1 = criarLivroDidatico("Vetores e Geometria Analitica", "Panini", 300.0, "Paulo Winterls", "Livro tecnico", "Geometria");
        
        System.out.println("Resumo do Livro: " + ld1.consultarResumo());
        
        System.out.println("Mesma editora? "+ r1.temMesmaEditora(r2));
        
        comprar(ld1, 2);
        comprar(r1, 3);
        
    }
    public static Revista criarRevista(String n, String e, double p, String per){
        return new Revista(n, e, p, per);
    }
    public static LivroDidatico criarLivroDidatico(String nome, String editora, double preco, String autor, String resumo, String area) {
        return new LivroDidatico(nome, editora, preco, autor, resumo, area);
    }
    
    public static void comprar(Titulo t, int quantidade){
        double valorBruto = t.getPreco()*quantidade;
        
        double descontoTotal = (t.calcularDescontoEspecifico() + t.getDescontoBase()) * quantidade;
        double valorFinal = valorBruto - descontoTotal;
        
        System.out.println("\n--- NOTA FISCAL---");
        System.out.println("Livraria: " + nomeLivraria);
        System.out.println("Item: "+ t.getNome());
        System.out.println("Quantidade: "+ quantidade);
        System.out.printf("Preço total(Com desconto): R$%.2f\n", valorFinal);
    }
    
}
