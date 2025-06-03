package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {
	// Propriedades da classe
	private Connection objConexao = null;
	
	//  Método de classe
	Connection getObjConexao() {
		return objConexao;
	}
	
	void conectar() throws Exception {
		objConexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/Aula_12?" +
			"user=root&password=mmso2006&" +
			"serverTimezone=UTC&useSSL=false");
	}
	
	void desconectar() throws Exception {
		objConexao.close();
	}
}
