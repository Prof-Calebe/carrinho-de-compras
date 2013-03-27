package br.calebe.exemplos.ex01;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object obj) {
        return equals((Produto) obj);
    }

    public boolean equals(Produto obj) {
        return nome.equals(obj.nome);
    }
}
