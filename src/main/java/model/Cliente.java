package model;

public class Cliente {
	
	private int IdCliente;
	private String nome;
	private String cpf;

	public int getId() {
		return IdCliente;
	}
	public void setId(int IdCliente) {
		this.IdCliente = IdCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome){
		   this.nome = nome;
		}
	public String getCpf() {
		return cpf;
	}
	public void setCpf( String string) {
		this.cpf = string;
	}


}
