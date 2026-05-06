public class Beneficiario {
   
    private String nome;
    private String rg;
    private String cpf;
    private String tipoImovel; 
    private double metragem;
    private double renda;
    private String beneficios;
    private double debitoIptu;

    public Beneficiario(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public Beneficiario(String nome, String rg, String cpf, String tipoImovel, 
                        double metragem, double renda, String beneficios, double debitoIptu) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.tipoImovel = tipoImovel;
        this.metragem = metragem;
        this.renda = renda;
        this.beneficios = beneficios;
        this.debitoIptu = debitoIptu;
    }

    public double calcularDebitoBase(String tipo, double metros) {
        double valorMetro;
        
        switch (tipo.toLowerCase()) {
            case "casa":
                valorMetro = 5.976;
                break;
            case "apartamento":
                valorMetro = 7.298;
                break;
            default:
                valorMetro = 9.858;
                break;
        }
        
        this.debitoIptu = valorMetro * metros;
        return this.debitoIptu;
    }
    public void calcularIsencao(int tempoMoradia, boolean prestouServicoEstado) {
        double percentualIsencao = 0;
        double salarioMinimo = 1512.00;

        if (tempoMoradia > 10) {
            percentualIsencao = 1.0; 
            System.out.println("Isenção aplicada: 100% (Tempo de moradia > 10 anos)");
        } 
        else if (prestouServicoEstado) {
            percentualIsencao = 0.40;
            System.out.println("Isenção aplicada: 40% (Serviço ao Estado)");
        } 
        else {
            if (this.renda < salarioMinimo) {
                percentualIsencao = 0.25;
                System.out.println("Isenção aplicada: 25% (Renda abaixo do teto)");
            } else if (this.renda == salarioMinimo) {
                percentualIsencao = 0.17;
                System.out.println("Isenção aplicada: 17% (Renda equivalente ao teto)");
            } else {
                percentualIsencao = 0.09;
                System.out.println("Isenção aplicada: 9% (Renda acima do teto)");
            }
        }

        double valorDesconto = this.debitoIptu * percentualIsencao;
        double valorFinal = this.debitoIptu - valorDesconto;

        System.out.printf("Valor do Débito Original: R$ %.2f%n", this.debitoIptu);
        System.out.printf("Valor do Desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor Final a Pagar: R$ %.2f%n", valorFinal);
    }}
