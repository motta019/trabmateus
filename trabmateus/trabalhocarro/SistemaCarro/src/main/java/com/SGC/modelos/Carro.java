package main.java.com.sgc.modelos;

public class Carro {

    // Atributos
    private String modelo;
    private String marca;
    private int ano;
    private double preco;

    // Construtor vazio
    public Carro() {
    }

    // Construtor com parâmetros
    public Carro(String modelo, String marca, int ano, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    // Método específico
    public String verificarCategoria() {
        if (ano < 2000) {
            return "Carro considerado antigo.";
        } else {
            return "Carro considerado moderno.";
        }
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // toString
    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                '}';
    }
}