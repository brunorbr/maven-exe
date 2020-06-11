package com.pucrs;

public class Motorista {
    
    public enum FormaPagamento{
        CARTÃO, DINHEIRO, TODAS
    }

    private String cpf;
    private String nome;
    private Veiculo veiculo;
    private FormaPagamento formaPgto;
    
    public Motorista(String cpf,
                     String nome,
                     Veiculo veiculo,
                     FormaPagamento formaPgto){
        this.cpf = cpf;
        this.nome = nome;
        this.veiculo = veiculo;
        this.formaPgto = formaPgto;
    }

    public String getCpf(){
        return cpf;
    }

    public String nome(){
        return nome;
    }

    public Veiculo getVeiculo(){
        return veiculo;
    }

    public FormaPagamento getFormaPgto(){
        return formaPgto;
    }
}