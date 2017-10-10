
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

	public String atualizarCliente(Cliente cliente, String id) {
		
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
	
	public String atualizarClienteEstado(Cliente cliente, String id) {
		
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
	
	public String atualizarClienteCep(Cliente cliente, String id) {
		
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
	
	public String atualizarClienteRazaoSocial(Cliente cliente, String id) {
		
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
	
	public String atualizarClienteCnpj(Cliente cliente, String id) {
		
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
	
	public String atualizarClienteEmail(Cliente cliente, String id) {
		
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
	
	public String atualizarClienteTelefone(Cliente cliente, String id) {
		
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
	
	public String atualizarClienteRua(Cliente cliente, String id) {
		
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
	
	public String atualizarClienteCidade(Cliente cliente, String id) {
		
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
	
	public String atualizarClienteNomeContato(Cliente cliente, String id) {
		
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

	public String excluirCliente(Cliente cliente, String id) {

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
		
		String SQL = "SELECT * FROM Cliente;";

		ArrayList<Cliente> listaCliente = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Cliente cliente = new Cliente();
					
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
}