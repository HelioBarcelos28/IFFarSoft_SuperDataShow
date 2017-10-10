
package Controller;

import Model.Projetor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author LucasMarcon
 *
 * DESCRIÇÃO: oi sor
 */

public class ProjetorController {

	private final Connection conexao;

	public ProjetorController(Connection conexao) {

		this.conexao = conexao;
	}
	
	public java.sql.Date formatarData(String data) {

		Date d = null;

		try {

			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			d = dateFormat.parse(data);
		} catch (ParseException e) {

			System.out.println("Erro ao converter a data.");
		}

		java.sql.Date dataSql = new java.sql.Date(d.getTime());

		return dataSql;
	}
	
	public String inserirProjetor(Projetor projetor) {

		String SQL = "INSERT INTOR Projetor (marca, modelo, numeroSerie, dataCompra, ansiLumens, estado, preco, numeroHorasUso) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);

			stmt.setString(1, projetor.getMarca());
			stmt.setString(2, projetor.getModelos());
			stmt.setString(3, projetor.getNumeroSerie());
			stmt.setDate(4, formatarData(projetor.getDataCompra()));
			stmt.setString(5, projetor.getAnsiLumens());
			stmt.setString(6, projetor.getEstado());
			stmt.setDouble(7, Double.parseDouble(projetor.getPreco()));
			stmt.setInt(8, Integer.parseInt(projetor.getNumeroHorasUso()));

			if (stmt.executeUpdate() > 0) {

				return "Inclusão de novo Projetor realizada com sucesso.";
			} else {

				return "Erro ao tentar incluir novo Projetor.";
			}

		} catch (SQLException e) { return e.getMessage(); }
	}
	
	public String atualizaProjetor(Projetor projetor, String id) {
		
		String SQL = "UPDATE Projetor SET marca = ?, modelo = ?, numeroSerie = ?, dataCompra = ?, ansiLumens = ?, estado = ?,  preco = ?, numeroHorasUso = ? WHERE idProjetor = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, projetor.getMarca());
			stmt.setString(2, projetor.getModelos());
			stmt.setString(3, projetor.getNumeroSerie());
			stmt.setDate(4, formatarData(projetor.getDataCompra()));
			stmt.setString(5, projetor.getAnsiLumens());
			stmt.setString(6, projetor.getEstado());
			stmt.setDouble(7, Double.parseDouble(projetor.getPreco()));
			stmt.setInt(8, Integer.parseInt(projetor.getNumeroHorasUso()));

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Projetor realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar novo Projetor.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String atualizaProjetorMarca(Projetor projetor, String id) {
		
		String SQL = "UPDATE Projetor SET marca = ?WHERE idProjetor = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, projetor.getMarca());

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Projetor realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar novo Projetor.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String atuaProjetorModelo(Projetor projetor, String id) {
		
		String SQL = "UPDATE Projetor SET modelo = ? WHERE idProjetor = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, projetor.getModelos());

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Projetor realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar novo Projetor.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String atuaProjetorNumeroSerie(Projetor projetor, String id) {
		
		String SQL = "UPDATE Projetor SET numeroSerie = ? WHERE idProjetor = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, projetor.getNumeroSerie());

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Projetor realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar novo Projetor.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String atualizarProjetorDataCompra(Projetor projetor, String id) {
		
		String SQL = "UPDATE Projetor SET dataCompra = ? WHERE idProjetor = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setDate(1, formatarData(projetor.getDataCompra()));

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Projetor realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar novo Projetor.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String atualizarProjetorAnsiLumens(Projetor projetor, String id) {
		
		String SQL = "UPDATE Projetor SET ansiLumens = ? WHERE idProjetor = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, projetor.getAnsiLumens());

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Projetor realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar novo Projetor.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String atualizarProjetorEstado(Projetor projetor, String id) {
		
		String SQL = "UPDATE Projetor SET estado = ? WHERE idProjetor = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, projetor.getEstado());

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Projetor realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar novo Projetor.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String atualizarProjetorPreco(Projetor projetor, String id) {
		
		String SQL = "UPDATE Projetor SET preco = ? WHERE idProjetor = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setDouble(1, Double.parseDouble(projetor.getPreco()));

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Projetor realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar novo Projetor.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
		
	public String atualizarProjetorNumeroHorasUso(Projetor projetor, String id) {
		
		String SQL = "UPDATE Projetor SET numeroHorasUso = ? WHERE idProjetor = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setInt(1, Integer.parseInt(projetor.getNumeroHorasUso()));

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Projetor realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar novo Projetor.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String excluirProjetor(Projetor projetor, String id) {

		String SQL = "DELETE FROM Projetor WHERE idProjetor = '" +Integer.parseInt(id)+ "';";

		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);

			if (stmt.executeUpdate() > 0) {

				return "Exclusão de Projetor realizada com sucesso.";
			} else {

				return "Erro ao tentar excluir Projetor.";
			}
		} catch (SQLException e) { return e.getMessage(); }
	}
	
	public ArrayList<Projetor> ListarTodosProjetores() {
		
		String SQL = "SELECT * FROM Projetor;";

		ArrayList<Projetor> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Projetor projetor = new Projetor();

					projetor.setMarca			(rs.getString("marca"));
					projetor.setModelos		(rs.getString("modelo"));
					projetor.setNumeroSerie		(rs.getString("numeroSerie"));
					projetor.setDataCompra		(rs.getString("dataCompra"));
					projetor.setAnsiLumens		(rs.getString("ansiLumens"));
					projetor.setEstado		(rs.getString("estado"));
					projetor.setPreco			(rs.getString("preco"));
					projetor.setNumeroHorasUso	(rs.getString("numeroHorasUso"));

					listaProjetor.add(projetor);
				}
			}

			return listaProjetor;

		} catch (SQLException e) { return null; }
	}
}