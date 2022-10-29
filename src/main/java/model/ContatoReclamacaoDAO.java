package model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;


public class ContatoReclamacaoDAO {
	/*
	 * CRUD c: create r: read u: update d: delete
	 */

	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(ContatoReclamacao c1) {
		// metodo de salvar

		String sql = "INSERT INTO Cliente(email,assunto, cpf)" + "VALUES(?,?,?)";
		// interrogação será substituida pelos parametros inseridos

		// testa se a conexão ainda não existe
		Connection conn = null;

		PreparedStatement pstm = null;
		try {
			// criar uma conexao com o banco de dados
			conn = Conexao.creatConnectiontoMySQL();
			// criamos uma PrepareStatement, para executar uma query

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, c1.getEmail());
			pstm.setString(2, c1.getAssunto());
			pstm.setString(3, c1.getCpf());

			// executar a inserção de dados
			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fechar as conexoes
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void removebyId(int Id_cliente) {
		String sql = "DELETE FROM Cliente WHERE Id_cliente = ?";
		try {
			conn = Conexao.creatConnectiontoMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, Id_cliente);

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fechar as conexoes
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void update(Cliente cliente) {
		String sql = "UPDATE Cliente SET Email = ?, Assunto = ?, Cpf = ?" + "WHERE Id_cliente = ?";
		try {
			conn = Conexao.creatConnectiontoMySQL();

			pstm = conn.prepareStatement(sql);

			// primeiro parametro (nome) da tabela (cliente) do banco
			pstm.setString(1, cliente.getNome());
			// segundo parametro (cpf) da tabela (cliente) do banco

			pstm.setString(2, cliente.getCpf());
			// terceiro parametro (endereco) da tabela (cliente) do banco

			// para que não seja alterado todas as linhas da tabela
			pstm.setInt(3, cliente.getId());

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fechar as conexoes
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public  List<Cliente> getClientes() {

		String sql = "SELECT * FROM Cliente";

		List<Cliente> clienteLista = new ArrayList<Cliente>();
		
		// classe que vai recuperar e mostrar os dados do banco Viajemais ( Tabela Clientes)
		ResultSet rset = null;
		try {
			conn = Conexao.creatConnectiontoMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			// enquanto houver dados no banco faça

			while (rset.next()) {
				Cliente cliente = new Cliente();

				// recupera o Id do banco e atribui ao objeto
				cliente.setId(rset.getInt("Id"));
				
				// recupera o nome do banco e atribui ao objeto
				cliente.setNome(rset.getString("Email"));
				
				//recupera o Assunto e atribui ao objeto 
				cliente.setCpf(rset.getString("Assunto"));
				
				//recupera o CPF e atribui ao objeto 
				cliente.setCpf(rset.getString("Cpf"));
				
				// Adiciono o Cliente recuperado, a lista de clientes
				clienteLista.add(cliente);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fechar as conexoes
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return clienteLista;
 
	}
	
	public Cliente buscaById(int Id) {
		String sql = "SELECT * FROM Cliente WHERE id IN (?);";
		ResultSet rset = null;
		Cliente cliente = new Cliente();

		try {
			conn = Conexao.creatConnectiontoMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, Id);

			rset = pstm.executeQuery();

			rset.next();
			cliente.setId(rset.getInt("Email"));
			cliente.setNome(rset.getString("Assunto"));
			cliente.setCpf(rset.getString("Cpf"));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstm != null) {

					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}

		}
		return cliente;
	}

	public static void removeById(int id) {
	}

	
}