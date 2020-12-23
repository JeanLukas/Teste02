package br.com.wswork.model;

public class Computador {
    private double preco;
    private int ano;
    private long id;
    private String cor;

    public Computador(double preco, int ano, long id, String cor) {
        this.preco = preco;
        this.ano = ano;
        this.id = id;
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
