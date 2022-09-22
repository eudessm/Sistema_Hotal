package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
  public String db = "bancoreserva";
	public String url = "jdbc:mysql://27.0.0.1/" + db;
	public String user = "root";
	public String pass = "";

	// Contrutor padrão
	public Conexao() {
	}

	// Metodo de conexão com o banco informando usuário e senha e qual o banco
    	public Connection conectar(){
		Connection link = null;

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			link = DriverManager.getConnection(this.url, this.user, this.pass);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			JOptionPane.showConfirmDialog(null, "Erro de Conexão:" + e);
		}

		return link;

	}  
}
