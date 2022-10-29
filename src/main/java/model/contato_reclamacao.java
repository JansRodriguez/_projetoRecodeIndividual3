package model;

public class contato_reclamacao {
		
		private int IdContatoReclamacao;
		private String email;
		private String nome;
		private String cpf;
		
		public int getIdContatoReclamacao() {
			return IdContatoReclamacao;
		}
		public void setIdContatoReclamacao(int IdContatoReclamacao){
			this.IdContatoReclamacao = IdContatoReclamacao;
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
