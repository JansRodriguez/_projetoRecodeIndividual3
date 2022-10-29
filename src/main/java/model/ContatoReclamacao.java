package model;

public class ContatoReclamacao {
		
		private int IdContatoReclamacao;
		private String email;
		private String assunto;
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
		
		public String getAssunto() {
			return assunto;
		}
		public void setNome(String assunto){
			   this.assunto = assunto;
			}
		public String getCpf() {
			return cpf;
		}
		public void setCpf( String string) {
			this.cpf = string;
		}
}
