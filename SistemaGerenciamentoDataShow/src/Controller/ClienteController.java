
package Controller;

/**
 *
 * @author LucasMarcon
 *
 * DESCRIÇÃO: Essa classe consiste na administração dos dados dos Clientes para cadastrá-los no banco de dados.
 */

import Model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteController {

	private final Connection conexao;

	public ClienteController(Connection conexao) {

		this.conexao = conexao;
	}
	
	public String inserirCliente(Cliente cliente) {

		String SQL = "INSERT INTO Cliente (estado, cep, razaoSocial, cnpj, email, telefone, rua, cidade, nomeContato) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, cliente.getEstado());
			stmt.setString(2, cliente.getCep());
			stmt.setString(3, cliente.getRazaoSocial());
			stmt.setString(4, cliente.getCnpj());
			stmt.setString(5, cliente.getEmail());
			stmt.setString(6, cliente.getTelefone());
			stmt.setString(7, cliente.getRua());
			stmt.setString(8, cliente.getCidade());
			stmt.setString(9, cliente.getNomeContato());

			if (stmt.executeUpdate() > 0) {

				return "Inclusão de novo Cliente realizada com sucesso.";
			} else {

				return "Erro ao tentar incluir novo Cliente.";
			}
		} catch (SQLException e) { return e.getMessage(); }
	}

	public String alterarCliente(Cliente cliente, String id) {
		
		String SQL = "UPDATE Cliente SET estado = ?, cep = ?, razaoSocial = ?, cnpj = ?, email = ?, telefone = ?, rua = ?, cidade = ?, nomeContato = ? WHERE idCliente = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, cliente.getEstado());
			stmt.setString(2, cliente.getCep());
			stmt.setString(3, cliente.getRazaoSocial());
			stmt.setString(4, cliente.getCnpj());
			stmt.setString(5, cliente.getEmail());
			stmt.setString(6, cliente.getTelefone());
			stmt.setString(7, cliente.getRua());
			stmt.setString(8, cliente.getCidade());
			stmt.setString(9, cliente.getNomeContato());

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Cliente realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar  novo Cliente.";
			}
		} catch (SQLException e) { return e.getMessage(); }
	}
	
	public String alterarClienteEstado(Cliente cliente, String id) {
		
		String SQL = "UPDATE Cliente SET estado = ? WHERE idCliente = '" +Integer.parseInt(id)+ "';";
		
		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, cliente.getEstado());

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Cliente realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar  novo Cliente.";
			}
		} catch (SQLException e) { return e.getMessage(); }
	}
	
	public String alterarClienteCep(Cliente cliente, String id) {
		
		String SQL = "UPDATE Cliente SET cep = ? WHERE idCliente = '" +Integer.parseInt(id)+ "';";
		
		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, cliente.getCep());

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Cliente realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar  novo Cliente.";
			}
		} catch (SQLException e) { return e.getMessage(); }
	}
	
	public String alterarClienteRazaoSocial(Cliente cliente, String id) {
		
		String SQL = "UPDATE Cliente SET razaoSocial = ? WHERE idCliente = '" +Integer.parseInt(id)+ "';";
		
		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, cliente.getRazaoSocial());

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Cliente realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar  novo Cliente.";
			}
		} catch (SQLException e) { return e.getMessage(); }
	}
	
	public String alterarClienteCnpj(Cliente cliente, String id) {
		
		String SQL = "UPDATE Cliente SET cnpj = ? WHERE idCliente = '" +Integer.parseInt(id)+ "';";
		
		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, cliente.getCnpj());

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Cliente realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar  novo Cliente.";
			}
		} catch (SQLException e) { return e.getMessage(); }
	}
	
	public String alterarClienteEmail(Cliente cliente, String id) {
		
		String SQL = "UPDATE Cliente SET email = ? WHERE idCliente = '" +Integer.parseInt(id)+ "';";
		
		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, cliente.getEmail());

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Cliente realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar  novo Cliente.";
			}
		} catch (SQLException e) { return e.getMessage(); }
	}
	
	public String alterarClienteTelefone(Cliente cliente, String id) {
		
		String SQL = "UPDATE Cliente SET telefone = ? WHERE idCliente = '" +Integer.parseInt(id)+ "';";
		
		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, cliente.getTelefone());

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Cliente realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar  novo Cliente.";
			}
		} catch (SQLException e) { return e.getMessage(); }
	}
	
	public String alterarClienteRua(Cliente cliente, String id) {
		
		String SQL = "UPDATE Cliente SET rua = ? WHERE idCliente = '" +Integer.parseInt(id)+ "';";
		
		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, cliente.getRua());

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Cliente realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar  novo Cliente.";
			}
		} catch (SQLException e) { return e.getMessage(); }
	}
	
	public String alterarClienteCidade(Cliente cliente, String id) {
		
		String SQL = "UPDATE Cliente SET cidade = ? WHERE idCliente = '" +Integer.parseInt(id)+ "';";
		
		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, cliente.getCidade());

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Cliente realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar  novo Cliente.";
			}
		} catch (SQLException e) { return e.getMessage(); }
	}
	
	public String alterarClienteNomeContato(Cliente cliente, String id) {
		
		String SQL = "UPDATE Cliente SET nomeContato = ? WHERE idCliente = '" +Integer.parseInt(id)+ "';";
		
		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, cliente.getNomeContato());

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Cliente realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar  novo Cliente.";
			}
		} catch (SQLException e) { return e.getMessage(); }
	}

	public String excluirCliente(String id) {

		String SQL = "DELETE FROM Cliente WHERE idCliente = '" +Integer.parseInt(id)+ "';";

		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);

			if (stmt.executeUpdate() > 0) {

				return "Exclusão de Cliente realizada com sucesso.";
			} else {

				return "Erro ao tentar excluir Cliente.";
			}
		} catch (SQLException e) { return e.getMessage(); }
	}

	public ArrayList<Cliente> listarTodosClientes() {
		
		String SQL = "SELECT * FROM Cliente ORDER BY 1 ASC;";

		ArrayList<Cliente> listaCliente = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Cliente cliente = new Cliente();
					
					cliente.setIdCliente	(rs.getString("idCliente"));
					cliente.setEstado		(rs.getString("estado"));
					cliente.setCep		(rs.getString("cep"));
					cliente.setRazaoSocial	(rs.getString("razaoSocial"));
					cliente.setCnpj		(rs.getString("cnpj"));
					cliente.setEmail		(rs.getString("email"));
					cliente.setTelefone	(rs.getString("telefone"));
					cliente.setRua		(rs.getString("rua"));
					cliente.setCidade		(rs.getString("cidade"));
					cliente.setNomeContato	(rs.getString("nomeContato"));

					listaCliente.add(cliente);
				}
			}

			return listaCliente;

		} catch (SQLException e) { return null; }
	}
	
	/**
	* 
	* @param estado
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Cliente> listarClientesEspecificosEstado(String estado, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Cliente WHERE estado LIKE '%" +estado+ "%'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY estado DESC";
		} else {
			
			SQL += " ORDER BY estado ASC";
		}
		
		SQL += ";";

		ArrayList<Cliente> listaCliente = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Cliente cliente = new Cliente();
					
					cliente.setIdCliente	(rs.getString("idCliente"));
					cliente.setEstado		(rs.getString("estado"));
					cliente.setCep		(rs.getString("cep"));
					cliente.setRazaoSocial	(rs.getString("razaoSocial"));
					cliente.setCnpj		(rs.getString("cnpj"));
					cliente.setEmail		(rs.getString("email"));
					cliente.setTelefone	(rs.getString("telefone"));
					cliente.setRua		(rs.getString("rua"));
					cliente.setCidade		(rs.getString("cidade"));
					cliente.setNomeContato	(rs.getString("nomeContato"));

					listaCliente.add(cliente);
				}
			}

			return listaCliente;

		} catch (SQLException e) { return null; }
	}
	
	/**
	* 
	* @param cep
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Cliente> listarClientesEspecificosCep(String cep, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Cliente WHERE cep LIKE '%" +cep+ "%'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY cep DESC";
		} else {
			
			SQL += " ORDER BY cep ASC";
		}
		
		SQL += ";";

		ArrayList<Cliente> listaCliente = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Cliente cliente = new Cliente();
					
					cliente.setIdCliente	(rs.getString("idCliente"));
					cliente.setEstado		(rs.getString("estado"));
					cliente.setCep		(rs.getString("cep"));
					cliente.setRazaoSocial	(rs.getString("razaoSocial"));
					cliente.setCnpj		(rs.getString("cnpj"));
					cliente.setEmail		(rs.getString("email"));
					cliente.setTelefone	(rs.getString("telefone"));
					cliente.setRua		(rs.getString("rua"));
					cliente.setCidade		(rs.getString("cidade"));
					cliente.setNomeContato	(rs.getString("nomeContato"));

					listaCliente.add(cliente);
				}
			}

			return listaCliente;

		} catch (SQLException e) { return null; }
	}
	
	/**
	* 
	* @param razaoSocial
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Cliente> listarClientesEspecificosRazaoSocial(String razaoSocial, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Cliente WHERE razaoSocial LIKE '%" +razaoSocial+ "%'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY razaoSocial DESC";
		} else {
			
			SQL += " ORDER BY razaoSocial ASC";
		}
		
		SQL += ";";

		ArrayList<Cliente> listaCliente = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Cliente cliente = new Cliente();
					
					cliente.setIdCliente	(rs.getString("idCliente"));
					cliente.setEstado		(rs.getString("estado"));
					cliente.setCep		(rs.getString("cep"));
					cliente.setRazaoSocial	(rs.getString("razaoSocial"));
					cliente.setCnpj		(rs.getString("cnpj"));
					cliente.setEmail		(rs.getString("email"));
					cliente.setTelefone	(rs.getString("telefone"));
					cliente.setRua		(rs.getString("rua"));
					cliente.setCidade		(rs.getString("cidade"));
					cliente.setNomeContato	(rs.getString("nomeContato"));

					listaCliente.add(cliente);
				}
			}

			return listaCliente;

		} catch (SQLException e) { return null; }
	}
	
	/**
	* 
	* @param rua
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Cliente> listarClientesEspecificosRua(String rua, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Cliente WHERE rua LIKE '%" +rua+ "%'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY rua DESC";
		} else {
			
			SQL += " ORDER BY rua ASC";
		}
		
		SQL += ";";

		ArrayList<Cliente> listaCliente = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Cliente cliente = new Cliente();
					
					cliente.setIdCliente	(rs.getString("idCliente"));
					cliente.setEstado		(rs.getString("estado"));
					cliente.setCep		(rs.getString("cep"));
					cliente.setRazaoSocial	(rs.getString("razaoSocial"));
					cliente.setCnpj		(rs.getString("cnpj"));
					cliente.setEmail		(rs.getString("email"));
					cliente.setTelefone	(rs.getString("telefone"));
					cliente.setRua		(rs.getString("rua"));
					cliente.setCidade		(rs.getString("cidade"));
					cliente.setNomeContato	(rs.getString("nomeContato"));

					listaCliente.add(cliente);
				}
			}

			return listaCliente;

		} catch (SQLException e) { return null; }
	}
	
	/**
	* 
	* @param cidade
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Cliente> listarClientesEspecificosCidade(String cidade, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Cliente WHERE cidade LIKE '%" +cidade+ "%'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY cidade DESC";
		} else {
			
			SQL += " ORDER BY cidade ASC";
		}
		
		SQL += ";";

		ArrayList<Cliente> listaCliente = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Cliente cliente = new Cliente();
					
					cliente.setIdCliente	(rs.getString("idCliente"));
					cliente.setEstado		(rs.getString("estado"));
					cliente.setCep		(rs.getString("cep"));
					cliente.setRazaoSocial	(rs.getString("razaoSocial"));
					cliente.setCnpj		(rs.getString("cnpj"));
					cliente.setEmail		(rs.getString("email"));
					cliente.setTelefone	(rs.getString("telefone"));
					cliente.setRua		(rs.getString("rua"));
					cliente.setCidade		(rs.getString("cidade"));
					cliente.setNomeContato	(rs.getString("nomeContato"));

					listaCliente.add(cliente);
				}
			}

			return listaCliente;

		} catch (SQLException e) { return null; }
	}
	
	/**
	* 
	* @param nomeContato
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Cliente> listarClientesEspecificosNomeContato(String nomeContato, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Cliente WHERE nomeContato LIKE '%" +nomeContato+ "%'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY nomeContato DESC";
		} else {
			
			SQL += " ORDER BY nomeContato ASC";
		}
		
		SQL += ";";

		ArrayList<Cliente> listaCliente = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Cliente cliente = new Cliente();
					
					cliente.setIdCliente	(rs.getString("idCliente"));
					cliente.setEstado		(rs.getString("estado"));
					cliente.setCep		(rs.getString("cep"));
					cliente.setRazaoSocial	(rs.getString("razaoSocial"));
					cliente.setCnpj		(rs.getString("cnpj"));
					cliente.setEmail		(rs.getString("email"));
					cliente.setTelefone	(rs.getString("telefone"));
					cliente.setRua		(rs.getString("rua"));
					cliente.setCidade		(rs.getString("cidade"));
					cliente.setNomeContato	(rs.getString("nomeContato"));

					listaCliente.add(cliente);
				}
			}

			return listaCliente;

		} catch (SQLException e) { return null; }
	}
	
	public ArrayList<String> listarEstados() {
		
		String SQL = "SELECT nome FROM Estado ORDER BY nome ASC;";
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			ArrayList<String> estados = new ArrayList();
			
			if (rs != null) {

				while (rs.next()) {

					estados.add(rs.getString("nome"));
				}
			}

			return estados;

		} catch (SQLException e) { return null; }
	}
	
	public ArrayList<String> listarCidades() {
		
		String SQL = "SELECT nome FROM Cidade ORDER BY nome ASC;";
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			ArrayList<String> estados = new ArrayList();
			
			if (rs != null) {

				while (rs.next()) {

					estados.add(rs.getString("nome"));
				}
			}

			return estados;

		} catch (SQLException e) { return null; }
	}
}