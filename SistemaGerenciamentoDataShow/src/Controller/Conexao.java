
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LucasMarcon
 *
 * DESCRIÇÃO: oi sor
 */

public class Conexao {

	public Connection AbrirConexao() {

		Connection con = null;

		try {

			Class.forName("org.postgresql.Driver").newInstance();

			String url		= "jdbc:postgresql://localhost:5432/dataShow";
			String usuario	= "postgres";
			String senha	= "helio";

			con = DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
			
			System.out.println("Erro " + e.getMessage());
		}

		return con;
	}
}