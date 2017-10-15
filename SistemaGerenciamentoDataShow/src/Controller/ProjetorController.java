
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
			stmt.setString(2, projetor.getModelo());
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
	
	public String alterarProjetor(Projetor projetor, String id) {
		
		String SQL = "UPDATE Projetor SET marca = ?, modelo = ?, numeroSerie = ?, dataCompra = ?, ansiLumens = ?, estado = ?,  preco = ?, numeroHorasUso = ? WHERE idProjetor = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, projetor.getMarca());
			stmt.setString(2, projetor.getModelo());
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
	
	public String alterarProjetorMarca(Projetor projetor, String id) {
		
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
	
	public String alterarProjetorModelo(Projetor projetor, String id) {
		
		String SQL = "UPDATE Projetor SET modelo = ? WHERE idProjetor = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setString(1, projetor.getModelo());

			if (stmt.executeUpdate() > 0) {

				return "Atualização de novo Projetor realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar novo Projetor.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String alterarProjetorNumeroSerie(Projetor projetor, String id) {
		
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
	
	public String alterarProjetorDataCompra(Projetor projetor, String id) {
		
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
	
	public String alterarProjetorAnsiLumens(Projetor projetor, String id) {
		
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
	
	public String alterarProjetorEstado(Projetor projetor, String id) {
		
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
	
	public String alterarProjetorPreco(Projetor projetor, String id) {
		
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
		
	public String alterarProjetorNumeroHorasUso(Projetor projetor, String id) {
		
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
	
	public String excluirProjetor(String id) {

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
	
	/**
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Projetor> listarTodosProjetores() {
		
		String SQL = "SELECT * FROM Projetor ORDER BY 1 ASC;";

		ArrayList<Projetor> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Projetor projetor = new Projetor();

					projetor.setMarca			(rs.getString("marca"));
					projetor.setModelo		(rs.getString("modelo"));
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
	
	/**
	* 
	* @param marca
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Projetor> listarProjetoresEspecificosMarca(String marca, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Projetor WHERE marca LIKE '%" +marca+ "%'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY marca DESC";
		} else {
			
			SQL += " ORDER BY marca ASC";
		}
		
		SQL += ";";

		ArrayList<Projetor> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Projetor projetor = new Projetor();

					projetor.setIdProjetor		(rs.getString("idProjetor"));
					projetor.setMarca			(rs.getString("marca"));
					projetor.setModelo		(rs.getString("modelo"));
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
	
	/**
	* 
	* @param modelo
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Projetor> listarProjetoresEspecificosModelo(String modelo, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Projetor WHERE modelo LIKE '%" +modelo+ "%'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY modelo DESC";
		} else {
			
			SQL += " ORDER BY modelo ASC";
		}
		
		SQL += ";";

		ArrayList<Projetor> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Projetor projetor = new Projetor();

					projetor.setIdProjetor		(rs.getString("idProjetor"));
					projetor.setMarca			(rs.getString("marca"));
					projetor.setModelo		(rs.getString("modelo"));
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
	
	/**
	* 
	* @param numeroSerie
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Projetor> listarProjetoresEspecificosNumeroSerie(String numeroSerie, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Projetor WHERE numeroSerie LIKE '%" +numeroSerie+ "%'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY numeroSerie DESC";
		} else {
			
			SQL += " ORDER BY numeroSerie ASC";
		}
		
		SQL += ";";

		ArrayList<Projetor> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Projetor projetor = new Projetor();

					projetor.setIdProjetor		(rs.getString("idProjetor"));
					projetor.setMarca			(rs.getString("marca"));
					projetor.setModelo		(rs.getString("modelo"));
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
	
	/**
	* 
	* @param dataCompra
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Projetor> listarProjetoresEspecificosDataCompra(String dataCompra, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Projetor WHERE dataCompra = '%" +formatarData(dataCompra)+ "%'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY dataCompra DESC";
		} else {
			
			SQL += " ORDER BY dataCompra ASC";
		}
		
		SQL += ";";

		ArrayList<Projetor> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Projetor projetor = new Projetor();

					projetor.setIdProjetor		(rs.getString("idProjetor"));
					projetor.setMarca			(rs.getString("marca"));
					projetor.setModelo		(rs.getString("modelo"));
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
	
	/**
	* 
	* @param ansiLumens
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Projetor> listarProjetoresEspecificosAnsiLumens(String ansiLumens, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Projetor WHERE ansiLumens LIKE '%" +ansiLumens+ "%'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY ansiLumens DESC";
		} else {
			
			SQL += " ORDER BY ansiLumens ASC";
		}
		
		SQL += ";";

		ArrayList<Projetor> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Projetor projetor = new Projetor();

					projetor.setIdProjetor		(rs.getString("idProjetor"));
					projetor.setMarca			(rs.getString("marca"));
					projetor.setModelo		(rs.getString("modelo"));
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
	
	/**
	* 
	* @param estado
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Projetor> listarProjetoresEspecificosEstado(String estado, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Projetor WHERE estado LIKE '%" +estado+ "%'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY estado DESC";
		} else {
			
			SQL += " ORDER BY estado ASC";
		}
		
		SQL += ";";

		ArrayList<Projetor> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Projetor projetor = new Projetor();

					projetor.setIdProjetor		(rs.getString("idProjetor"));
					projetor.setMarca			(rs.getString("marca"));
					projetor.setModelo		(rs.getString("modelo"));
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
	
	/**
	* 
	* @param preco
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Projetor> listarProjetoresEspecificosPreco(String preco, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Projetor WHERE preco LIKE '%" +preco+ "%'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY preco DESC";
		} else {
			
			SQL += " ORDER BY preco ASC";
		}
		
		SQL += ";";

		ArrayList<Projetor> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Projetor projetor = new Projetor();

					projetor.setIdProjetor		(rs.getString("idProjetor"));
					projetor.setMarca			(rs.getString("marca"));
					projetor.setModelo		(rs.getString("modelo"));
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
	
	/**
	*  
	* @param numeroHorasUso 
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Projetor> listarProjetoresEspecificosNumeroHorasUso(String numeroHorasUso, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Projetor WHERE numeroHorasUso LIKE '%" +numeroHorasUso+ "%'"; 

		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY numeroHorasUso DESC";
		} else {
			
			SQL += " ORDER BY numeroHorasUso ASC";
		}
		
		SQL += ";";
		
		ArrayList<Projetor> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Projetor projetor = new Projetor();

					projetor.setIdProjetor		(rs.getString("idProjetor"));
					projetor.setMarca			(rs.getString("marca"));
					projetor.setModelo		(rs.getString("modelo"));
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