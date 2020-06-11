package com.pucrs;

import com.pucrs.Motorista.FormaPagamento;

public class Passageiro {
    private String cpf;
    private String nome;
    private FormaPagamento formaPgto;
    private String nroCartao;

    public Passageiro(String cpf, 
                      String nome, 
                      FormaPagamento formapgto,
                      String nroCartao){
        this.cpf = cpf;
        this.nome = nome;
        this.formaPgto = formapgto;
        if(nroCartao != null){
            setCartao(nroCartao);
        }
    }

    public void setCartao(String cartao){
        this.nroCartao = cartao;
    }

    public String getCpf(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public FormaPagamento getFormaPgto(){
        return formaPgto;
    }

    public String getCartao(){
        if(nroCartao != null)
            return nroCartao;
        else
            return "O cliente não possui cartao!";
    }
}