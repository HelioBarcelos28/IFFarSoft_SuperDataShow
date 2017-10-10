
package Controller;

import Model.Locacao;
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
 * DESCRIÇÃO:
 */

public class LocacaoController {

	private final Connection conexao;

	public LocacaoController(Connection conexao) {

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

	public String inserirLocacao(Locacao locacao) {

		String SQL = "INSERT INTO Locacao (valorLocacao, dataLocacao, dataDevolucaoPrevista, dataDevolucao, horasUsadas, idProjetor, idCliente, valorMulta) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setDouble(1, Double.parseDouble(locacao.getValorLocacao()));
			stmt.setDate(2, formatarData(locacao.getDataLocacao()));
			stmt.setDate(3, formatarData(locacao.getDataDevolucaoPrevista()));
			stmt.setDate(4, formatarData(locacao.getDataDevolucao()));
			stmt.setInt(5, Integer.parseInt(locacao.getHorasUsadas()));
			stmt.setInt(6, Integer.parseInt(locacao.getIdProjetor()));
			stmt.setInt(7, Integer.parseInt(locacao.getIdCliente()));
			stmt.setDouble(8, Double.parseDouble(locacao.getValorMulta()));

			if (stmt.executeUpdate() > 0) {

				return "Inclusão de nova Locação realizada com sucesso.";
			} else {

				return "Erro ao tentar incluir nova Locação.";
			}

		} catch (SQLException e) { return e.getMessage(); }
	}
	
	public String atualizarLocacao(Locacao locacao, String id) {
		
		String SQL = "UPDATE Locacao SET valorLocacao = ?, dataLocacao = ?, dataDevolucaoPrevista = ?, dataDevolucao = ?, horasUsadas = ?, idProjetor = ?, idClente = ?, valorMulta = ? WHERE idLocacao = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setDouble(1, Double.parseDouble(locacao.getValorLocacao()));
			stmt.setDate(2, formatarData(locacao.getDataLocacao()));
			stmt.setDate(3, formatarData(locacao.getDataDevolucaoPrevista()));
			stmt.setDate(4, formatarData(locacao.getDataDevolucao()));
			stmt.setInt(5, Integer.parseInt(locacao.getHorasUsadas()));
			stmt.setInt(6, Integer.parseInt(locacao.getIdProjetor()));
			stmt.setInt(7, Integer.parseInt(locacao.getIdCliente()));
			stmt.setDouble(8, Double.parseDouble(locacao.getValorMulta()));

			if (stmt.executeUpdate() > 0) {

				return "Atualização de nova Locação realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar nova Locação.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String atualizarLocacaoValorLocacao(Locacao locacao, String id) {
		
		String SQL = "UPDATE Locacao SET valorLocacao = ? WHERE idLocacao = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setDouble(1, Double.parseDouble(locacao.getValorLocacao()));

			if (stmt.executeUpdate() > 0) {

				return "Atualização de nova Locação realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar nova Locação.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String atualizarLocacaoDataLocacao(Locacao locacao, String id) {
		
		String SQL = "UPDATE Locacao SET dataLocacao = ? WHERE idLocacao = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setDate(1, formatarData(locacao.getDataLocacao()));

			if (stmt.executeUpdate() > 0) {

				return "Atualização de nova Locação realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar nova Locação.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String atualizarLocacaoDataDevolucaoPrevista(Locacao locacao, String id) {
		
		String SQL = "UPDATE Locacao SET dataDevolucaoPrevista = ? WHERE idLocacao = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setDate(1, formatarData(locacao.getDataDevolucaoPrevista()));

			if (stmt.executeUpdate() > 0) {

				return "Atualização de nova Locação realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar nova Locação.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String atualizarLocacaoDataDevolucao(Locacao locacao, String id) {
		
		String SQL = "UPDATE Locacao SET dataDevolucao = ? WHERE idLocacao = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setDate(1, formatarData(locacao.getDataDevolucao()));

			if (stmt.executeUpdate() > 0) {

				return "Atualização de nova Locação realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar nova Locação.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String atualizarLocacaoHorasUsadas(Locacao locacao, String id) {
		
		String SQL = "UPDATE Locacao SET horasUsadas = ? WHERE idLocacao = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setInt(1, Integer.parseInt(locacao.getHorasUsadas()));

			if (stmt.executeUpdate() > 0) {

				return "Atualização de nova Locação realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar nova Locação.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String atualizarLocacaoIdProjetor(Locacao locacao, String id) {
		
		String SQL = "UPDATE Locacao SET idProjetor = ? WHERE idLocacao = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setInt(1, Integer.parseInt(locacao.getIdProjetor()));

			if (stmt.executeUpdate() > 0) {

				return "Atualização de nova Locação realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar nova Locação.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String atualizarLocacaoIdCliente(Locacao locacao, String id) {
		
		String SQL = "UPDATE Locacao SET idClente = ? WHERE idCliente = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setInt(1, Integer.parseInt(locacao.getIdCliente()));

			if (stmt.executeUpdate() > 0) {

				return "Atualização de nova Locação realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar nova Locação.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String atualizarLocacaoValorMulta(Locacao locacao, String id) {
		
		String SQL = "UPDATE Cliente SET valorMulta = ? WHERE idCliente = '" +Integer.parseInt(id)+ "';";

		try {
			
			PreparedStatement stmt = conexao.prepareStatement(SQL);
			
			stmt.setDouble(1, Double.parseDouble(locacao.getValorMulta()));

			if (stmt.executeUpdate() > 0) {

				return "Atualização de nova Locação realizada com sucesso.";
			} else {

				return "Erro ao tentar Atualizar nova Locação.";
			}
		} catch (NumberFormatException | SQLException e) { return e.getMessage(); }
	}
	
	public String excluirLocacao(String id) {

		String SQL = "DELETE FROM Locacao WHERE idLocacao = '" +Integer.parseInt(id)+ "';";

		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);

			if (stmt.executeUpdate() > 0) {

				return "Exclusão de Locação realizada com sucesso.";
			} else {

				return "Erro ao tentar excluir Locação.";
			}
		} catch (SQLException e) { return e.getMessage(); }
	}
	
	public ArrayList<Locacao> listarTodasLocacoes() {
		
		String SQL = "SELECT * FROM Locacao ORDER BY ASC;";

		ArrayList<Locacao> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Locacao locacao = new Locacao();

					locacao.setValorLocacao			(rs.getString("valorLocacao"));
					locacao.setDataLocacao			(rs.getString("dataLocacao"));
					locacao.setDataDevolucaoPrevista	(rs.getString("dataDevolucaoPrevista"));
					locacao.setDataDevolucao		(rs.getString("dataDevolucao"));
					locacao.setHorasUsadas			(rs.getString("horasUsadas"));
					locacao.setIdProjetor			(rs.getString("idProjetor"));
					locacao.setIdLocacao			(rs.getString("idLocacao"));
					locacao.setValorMulta			(rs.getString("valorMulta"));
					
					listaProjetor.add(locacao);
				}
			}

			return listaProjetor;

		} catch (SQLException e) { return null; }
	}
	
	/**
	* 
	* @param valorLocacao
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Locacao> listarLocacoesEspecificasValorLocacao(String valorLocacao, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Locacao WHERE valorLocacao LIKE '" +valorLocacao+ "'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY DESC";
		} else {
			
			SQL += " ORDER BY ASC";
		}
		
		SQL += ";";

		ArrayList<Locacao> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Locacao locacao = new Locacao();

					locacao.setValorLocacao			(rs.getString("valorLocacao"));
					locacao.setDataLocacao			(rs.getString("dataLocacao"));
					locacao.setDataDevolucaoPrevista	(rs.getString("dataDevolucaoPrevista"));
					locacao.setDataDevolucao		(rs.getString("dataDevolucao"));
					locacao.setHorasUsadas			(rs.getString("horasUsadas"));
					locacao.setIdProjetor			(rs.getString("idProjetor"));
					locacao.setIdLocacao			(rs.getString("idLocacao"));
					locacao.setValorMulta			(rs.getString("valorMulta"));
					
					listaProjetor.add(locacao);
				}
			}

			return listaProjetor;

		} catch (SQLException e) { return null; }
	}
	
	/**
	* 
	* @param dataLocacao
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Locacao> listarLocacoesEspecificasDataLocacao(String dataLocacao, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Locacao WHERE dataLocacao LIKE '" +dataLocacao+ "'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY DESC";
		} else {
			
			SQL += " ORDER BY ASC";
		}
		
		SQL += ";";

		ArrayList<Locacao> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Locacao locacao = new Locacao();

					locacao.setValorLocacao			(rs.getString("valorLocacao"));
					locacao.setDataLocacao			(rs.getString("dataLocacao"));
					locacao.setDataDevolucaoPrevista	(rs.getString("dataDevolucaoPrevista"));
					locacao.setDataDevolucao		(rs.getString("dataDevolucao"));
					locacao.setHorasUsadas			(rs.getString("horasUsadas"));
					locacao.setIdProjetor			(rs.getString("idProjetor"));
					locacao.setIdLocacao			(rs.getString("idLocacao"));
					locacao.setValorMulta			(rs.getString("valorMulta"));
					
					listaProjetor.add(locacao);
				}
			}

			return listaProjetor;

		} catch (SQLException e) { return null; }
	}
	
	/**
	* 
	* @param dataDevolucaoPrevista
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Locacao> listarLocacoesEspecificasDataDevolucaoPrevista(String dataDevolucaoPrevista, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Locacao WHERE dataDevolucaoPrevista LIKE '" +dataDevolucaoPrevista+ "'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY DESC";
		} else {
			
			SQL += " ORDER BY ASC";
		}
		
		SQL += ";";

		ArrayList<Locacao> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Locacao locacao = new Locacao();

					locacao.setValorLocacao			(rs.getString("valorLocacao"));
					locacao.setDataLocacao			(rs.getString("dataLocacao"));
					locacao.setDataDevolucaoPrevista	(rs.getString("dataDevolucaoPrevista"));
					locacao.setDataDevolucao		(rs.getString("dataDevolucao"));
					locacao.setHorasUsadas			(rs.getString("horasUsadas"));
					locacao.setIdProjetor			(rs.getString("idProjetor"));
					locacao.setIdLocacao			(rs.getString("idLocacao"));
					locacao.setValorMulta			(rs.getString("valorMulta"));
					
					listaProjetor.add(locacao);
				}
			}

			return listaProjetor;

		} catch (SQLException e) { return null; }
	}
	
	/**
	* 
	* @param dataDevolucao
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Locacao> listarLocacoesEspecificasDataDevolucao(String dataDevolucao, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Locacao WHERE dataDevolucao LIKE '" +dataDevolucao+ "'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY DESC";
		} else {
			
			SQL += " ORDER BY ASC";
		}
		
		SQL += ";";

		ArrayList<Locacao> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Locacao locacao = new Locacao();

					locacao.setValorLocacao			(rs.getString("valorLocacao"));
					locacao.setDataLocacao			(rs.getString("dataLocacao"));
					locacao.setDataDevolucaoPrevista	(rs.getString("dataDevolucaoPrevista"));
					locacao.setDataDevolucao		(rs.getString("dataDevolucao"));
					locacao.setHorasUsadas			(rs.getString("horasUsadas"));
					locacao.setIdProjetor			(rs.getString("idProjetor"));
					locacao.setIdLocacao			(rs.getString("idLocacao"));
					locacao.setValorMulta			(rs.getString("valorMulta"));
					
					listaProjetor.add(locacao);
				}
			}

			return listaProjetor;

		} catch (SQLException e) { return null; }
	}
	
	/**
	* 
	* @param horasUsadas
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Locacao> listarLocacoesEspecificasHorasUsadas(String horasUsadas, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Locacao WHERE horasUsadas LIKE '" +horasUsadas+ "'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY DESC";
		} else {
			
			SQL += " ORDER BY ASC";
		}
		
		SQL += ";";

		ArrayList<Locacao> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Locacao locacao = new Locacao();

					locacao.setValorLocacao			(rs.getString("valorLocacao"));
					locacao.setDataLocacao			(rs.getString("dataLocacao"));
					locacao.setDataDevolucaoPrevista	(rs.getString("dataDevolucaoPrevista"));
					locacao.setDataDevolucao		(rs.getString("dataDevolucao"));
					locacao.setHorasUsadas			(rs.getString("horasUsadas"));
					locacao.setIdProjetor			(rs.getString("idProjetor"));
					locacao.setIdLocacao			(rs.getString("idLocacao"));
					locacao.setValorMulta			(rs.getString("valorMulta"));
					
					listaProjetor.add(locacao);
				}
			}

			return listaProjetor;

		} catch (SQLException e) { return null; }
	}
	
	/**
	* 
	* @param idProjetor
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Locacao> listarLocacoesEspecificasIdProjetor(String idProjetor, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Locacao WHERE idProjetor LIKE '" +idProjetor+ "'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY DESC";
		} else {
			
			SQL += " ORDER BY ASC";
		}
		
		SQL += ";";

		ArrayList<Locacao> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Locacao locacao = new Locacao();

					locacao.setValorLocacao			(rs.getString("valorLocacao"));
					locacao.setDataLocacao			(rs.getString("dataLocacao"));
					locacao.setDataDevolucaoPrevista	(rs.getString("dataDevolucaoPrevista"));
					locacao.setDataDevolucao		(rs.getString("dataDevolucao"));
					locacao.setHorasUsadas			(rs.getString("horasUsadas"));
					locacao.setIdProjetor			(rs.getString("idProjetor"));
					locacao.setIdLocacao			(rs.getString("idLocacao"));
					locacao.setValorMulta			(rs.getString("valorMulta"));
					
					listaProjetor.add(locacao);
				}
			}

			return listaProjetor;

		} catch (SQLException e) { return null; }
	}
	
	/**
	* 
	* @param idLocacao
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Locacao> listarLocacoesEspecificasIdLocacao(String idLocacao, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Locacao WHERE idLocacao LIKE '" +idLocacao+ "'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY DESC";
		} else {
			
			SQL += " ORDER BY ASC";
		}
		
		SQL += ";";

		ArrayList<Locacao> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Locacao locacao = new Locacao();

					locacao.setValorLocacao			(rs.getString("valorLocacao"));
					locacao.setDataLocacao			(rs.getString("dataLocacao"));
					locacao.setDataDevolucaoPrevista	(rs.getString("dataDevolucaoPrevista"));
					locacao.setDataDevolucao		(rs.getString("dataDevolucao"));
					locacao.setHorasUsadas			(rs.getString("horasUsadas"));
					locacao.setIdProjetor			(rs.getString("idProjetor"));
					locacao.setIdLocacao			(rs.getString("idLocacao"));
					locacao.setValorMulta			(rs.getString("valorMulta"));
					
					listaProjetor.add(locacao);
				}
			}

			return listaProjetor;

		} catch (SQLException e) { return null; }
	}
	
	/**
	* 
	* @param valorMulta
	* 
	* @param ordenarCrescenteDecrescente int - ATENÇÃO, para ordenar o resultado da busca em ordem crescente, atribui-se 0, e decrescente, atribui-se o valor 1. 
	* 
	* @return Retorna uma lista com os elementos ordenados;
	*/
	public ArrayList<Locacao> listarLocacoesEspecificasValorMulta(String valorMulta, int ordenarCrescenteDecrescente) {
		
		String SQL = "SELECT * FROM Locacao WHERE valorMulta LIKE = '" +valorMulta+ "'";
		
		if (ordenarCrescenteDecrescente == 1) {
			
			SQL += " ORDER BY DESC";
		} else {
			
			SQL += " ORDER BY ASC";
		}
		
		SQL += ";";

		ArrayList<Locacao> listaProjetor = new ArrayList();
		
		try {

			PreparedStatement stmt = conexao.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {

				while (rs.next()) {

					Locacao locacao = new Locacao();

					locacao.setValorLocacao			(rs.getString("valorLocacao"));
					locacao.setDataLocacao			(rs.getString("dataLocacao"));
					locacao.setDataDevolucaoPrevista	(rs.getString("dataDevolucaoPrevista"));
					locacao.setDataDevolucao		(rs.getString("dataDevolucao"));
					locacao.setHorasUsadas			(rs.getString("horasUsadas"));
					locacao.setIdProjetor			(rs.getString("idProjetor"));
					locacao.setIdLocacao			(rs.getString("idLocacao"));
					locacao.setValorMulta			(rs.getString("valorMulta"));
					
					listaProjetor.add(locacao);
				}
			}

			return listaProjetor;

		} catch (SQLException e) { return null; }
	}
}