package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Usuario {
	
	private int id;
	private String usuario;
	private String password;
	private String nombre;
	private ArrayList<String> nombresUsuario;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	
	public ArrayList<String> load(){
		ConexionMySql conexion = ConexionMySql.getInstance();
		ResultSet resultado = conexion.query("select * FROM usuario");
		
		nombresUsuario = new ArrayList<String>();
		try{
			while(resultado.next()){
				nombresUsuario.add(resultado.getString("usuario"));
			}
			return nombresUsuario;
		}
		catch(SQLException errorCargaDatos){
			errorCargaDatos.printStackTrace();
			return nombresUsuario;
		}
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
