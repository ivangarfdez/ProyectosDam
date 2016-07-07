package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionMySql {
	private Connection conexion;
	private String CONTROLADOR_MYSQL = "com.mysql.jdbc.Driver";
	//-----------------------------------------------------------------------------
	private String host = "localhost";
	private String bbdd = "gamesdb";
	private String user = "root";
	private String password = "tonphp";
	//-----------------------------------------------------------------------------
	private static ConexionMySql instance=null;
	

	public ConexionMySql(){
		try{
			Class.forName(CONTROLADOR_MYSQL).newInstance();
			System.out.println("CONTROLADOR CARGADO CON EXITO");
		}
		catch(Exception errorCargaControlador){
			errorCargaControlador.printStackTrace();
			System.out.println("ERROR CARGA CONTROLADOR");
		}
		
		try{
			conexion = DriverManager.getConnection("jdbc:mysql://"+host+"/"+bbdd+"?"+"user="+user+"&password="+password);
			System.out.println("CONEXION REALIZADA CON EXITO");
		}
		catch(SQLException errorConexion){
			errorConexion.printStackTrace();
			System.out.println("ERROR DE CONEXION");
		}
	}
	
	public static ConexionMySql getInstance() {
		if(instance==null){
			//CREAR INSTANCIA DE CONEXION
			instance = new ConexionMySql();
		}
		return instance;
	}

	//METODO PARA PODER REALIZAR SELECTS EN LA BBDD
	public ResultSet query(String query){
		
		Statement st;
		ResultSet rs = null;

		try{
			st = conexion.createStatement();
			try{
				rs = st.executeQuery(query);
			}
			catch(SQLException errorConsulta){
				errorConsulta.printStackTrace();
			}
		}
		catch(SQLException e1) {
			e1.printStackTrace();
		}	
		return rs;										
	}
	
	//METODO PARA REALIZAR INSERTS, UPDATES Y DELETES EN LA BBDD
	public int modifyQuery(String update){
		
		Statement stmt;
		int rs = 0;
		try{
		stmt = conexion.createStatement();		
			try{
				rs = stmt.executeUpdate(update);
			}
			catch(SQLException e){
				
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return rs;
	}
}
