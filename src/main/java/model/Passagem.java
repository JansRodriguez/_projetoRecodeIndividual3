package model;

import java.sql.Date;

public class Passagem {
    
    private int idDestino;
    private Date dataViagem;
    private Date dataRetorno;
    private String localOrigem;
    private String localDestino;
    private double valor;
    private int numeroPassageiros;
    private Cliente clientecpf;
    private Promocoes idSolicitacao;
    
    public int getIdDestino() {
        return idDestino;
    }
    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }
    public Date getDataViagem() {
        return dataViagem;
    }
    public void setDataViagem(Date dataViagem) {
        this.dataViagem = dataViagem;
    }
    public Date getDataRetorno() {
        return dataRetorno;
    }
    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }
    public String getLocalOrigem() {
        return localOrigem;
    }
    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }
    public String getLocalDestino() {
        return localDestino;
    }
    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }
    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
    public Cliente getClientecpf() {
        return clientecpf;
    }
    public void setClientecpf(Cliente clientecpf) {
        this.clientecpf = clientecpf;
    }
    public Promocoes getIdSolicitacao() {
        return idSolicitacao;
    }
    public void setIdSolicitacao(Promocoes idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }






}
