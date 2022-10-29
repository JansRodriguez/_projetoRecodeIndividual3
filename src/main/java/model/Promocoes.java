package model;

public class Promocoes {
	
	private int idSolicitacao;
	private String email;
	private String nome;
	private String destinoDesejado;
	private int qtdDias;
	private double valor;
	private Cliente clientecpf;
	
	
	public int getIdSolicitacao() {
        return idSolicitacao;
    }
    public void setIdSolicitacao(int idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDestinoDesejado() {
        return destinoDesejado;
    }
    public void setDestinoDesejado(String destinoDesejado) {
        this.destinoDesejado = destinoDesejado;
    }
    public int getQtdDias() {
        return qtdDias;
    }
    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Cliente getClientecpf() {
        return clientecpf;
    }
    public void setClientecpf(Cliente clientecpf) {
        this.clientecpf = clientecpf;
    }

}
