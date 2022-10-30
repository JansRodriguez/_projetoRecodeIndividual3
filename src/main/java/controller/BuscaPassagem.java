package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Passagem;
import model.PassagemDAO;


@WebServlet("/BuscaPassagem")
public class BuscaPassagem extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// recebendo os dados do formulario via parametro
		String dataViagem = request.getParameter("dataViagem");
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String tipoDoacao = request.getParameter("tipoDoacao");
		String telContato = request.getParameter("telContato");
		String email = request.getParameter("email");
		
		
		// criando o objeto contato 
		Passagem objContato =  new Passagem();
		
		// guardando os dados do formulario do objeto
		objContato.setDataViagem(dataViagem);
		objContato.setDataViagem(dataRetorno);
		objContato.setNome(nome);
		objContato.setNome(telefone);
		objContato.setNome(tipoDoacao);
		objContato.setNome(telContato);
		objContato.setNome(email);
		
		// criando um objeto DAO para enviar o objeto Contato para o banco de dados
		// usando o método save da classe ContatoDAO
		PassagemDAO cdao = new PassagemDAO();		
		cdao.save(objContato);
		
		// Redirecionando o usuario para a pagina inicial da aplicação.
		response.sendRedirect("home");
		
		
		
	}

}
