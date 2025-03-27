package Atv2;

public class Roupas {
    public String marca;
    public String tipo;
    public String tamanho;
    public int quantidade;
    public double valor;

    public Roupas(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double calcularValorTotal() {
        return quantidade * valor;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Não há estoque suficiente!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor unitário: R$" + valor);
        System.out.println("Valor total em estoque: R$" + calcularValorTotal());
        System.out.println("----------------------------------");
    }
}
