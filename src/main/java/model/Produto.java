/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class Produto {
    private String Nome;
    private double Valor;
    private int Unidade;
    private int QuantidadeEstoque;
    private int QuantidadeEstoqueMinima;
    private int QuantidadeEstoqueMaxima;

    public Produto() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public int getUnidade() {
        return Unidade;
    }

    public void setUnidade(int Unidade) {
        this.Unidade = Unidade;
    }

    public int getQuantidadeEstoque() {
        return QuantidadeEstoque;
    }

    public void setQuantidadeEstoque(int QuantidadeEstoque) {
        this.QuantidadeEstoque = QuantidadeEstoque;
    }

    public int getQuantidadeEstoqueMinima() {
        return QuantidadeEstoqueMinima;
    }

    public void setQuantidadeEstoqueMinima(int QuantidadeEstoqueMinima) {
        this.QuantidadeEstoqueMinima = QuantidadeEstoqueMinima;
    }

    public int getQuantidadeEstoqueMaxima() {
        return QuantidadeEstoqueMaxima;
    }

    public void setQuantidadeEstoqueMaxima(int QuantidadeEstoqueMaxima) {
        this.QuantidadeEstoqueMaxima = QuantidadeEstoqueMaxima;
    }
    
    
}
