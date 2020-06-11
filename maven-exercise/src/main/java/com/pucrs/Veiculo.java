package com.pucrs;

public class Veiculo {

    public enum CategoriaVeiculo {
        SIMPLES, NORMAL, LUXO
    }

    private String placa;
    private String marca;
    private String cor;
    private CategoriaVeiculo categoria;

    public Veiculo(String placa, 
                   String marca, 
                   String cor, 
                   CategoriaVeiculo categoria){
        this.placa = placa;
        this.marca = marca;
        this.cor = cor;
        this.categoria = categoria;
    }

    public String getPlaca(){
        return placa;
    }

    public String getMarca(){
        return marca;
    }

    public String cor(){
        return cor;
    }

    public CategoriaVeiculo getCategoria(){
        return categoria;
    }

    @Override
    public String toString(){
        return "========Veiculo========
        Placa: " + getPlaca() +
        "Marca: " + getMarca() +
        "Cor: " + getCor() +
        "Categoria: " + getCategoria();
    }
}