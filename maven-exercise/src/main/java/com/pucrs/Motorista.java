package com.pucrs;

public class Motorista {
    
    public enum FormaPagamento{
        CARTÃO, DINHEIRO, TODAS
    }

    String cpf;
    String nome;
    Veiculo veiculo;
    FormaPagamento formaPgto;
    
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

    public String getNome(){
        return nome;
    }

    public Veiculo getVeiculo(){
        return veiculo;
    }

    public FormaPagamento getFormaPgto(){
        return formaPgto;
    }

    @Override
    public String toString(){
        return "======Motorista======" +
        "CPF: " + getCpf() +
        "Nome: " + getNome() + 
        "Veiculo: " + getVeiculo().toString() + 
        "Forma de Pagamento: " + getFormaPgto();
    }
}