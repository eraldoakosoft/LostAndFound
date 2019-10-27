package com.example.lostfound.model;

import java.util.Date;

public class Documento {
    private String tipo;
    //essa variavel tem como objetivo pegar o nome completo como esta no documento encontrado
    private String nome;
    private String cpf;
    private String rg;
    private boolean status;
    private String nomeDaMae;
    private String naturalidade;
    private String idQuemAchou;
    private String dataNascimento;

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getIdQuemAchou() {
        return idQuemAchou;
    }

    public void setIdQuemAchou(String idQuemAchou) {
        this.idQuemAchou = idQuemAchou;
    }

    public Documento() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
