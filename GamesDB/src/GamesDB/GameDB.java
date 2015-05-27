package GamesDB;

import modelo.ConexionMySql;
import vista.VistaApp;

public class GameDB {
	
//Lanzador
	
	private static VistaApp v;

	public static void main(String[] args) {
		ConexionMySql connect = new ConexionMySql();
	
		v = new VistaApp();
		v.setVisible(true);
	}

}
