package com.develop_minura.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.develop_minura.model.Utilizador;

public class DBUtilizador {
	
	public DBUtilizador(){}
	
	public static String authenticateUser(String username, String password){
		Connection 	conn = null;
		Statement 	stmt = null;
		ResultSet	rs	 = null;
		
		String usernameDB = "";
		String passwordDB = "";
		
		try{
			
			try {
				conn = DBConnection.createConnection();
			} catch (Exception e) { e.printStackTrace(); }
			
			stmt = conn.createStatement();
			rs	 = stmt.executeQuery("SELECT username, password FROM utilizadores WHERE tipo >= 1 AND isDeleted='0'");
			
			while(rs.next()){
				usernameDB = rs.getString("username");
				passwordDB = rs.getString("password");
				
				if(username.equals(usernameDB) && password.equals(passwordDB)){
					return "SUCCESS";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Dados invalidos!";
	}
	
	public static boolean addUtDB(Utilizador u){
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			conn = DBConnection.createConnection();
			stmt = conn.createStatement();
			
			if(checkUtilizador(u.getUsername(), u.getEmail()) == false){
				
				stmt.execute("INSERT INTO utilizadores (username, email, password) VALUES ('"+u.getUsername()+"', '"+u.getEmail()+"', '"+u.getPassword()+"')");
				
				stmt.close();
				stmt = null;
				conn.close();
				conn = null;
				
				return true;
			}
			
			return false;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	private static boolean checkUtilizador(String username, String email){
		
		try {
			Connection con 	= null;
			ResultSet rs 	= null;
			Statement stmt 	= null;
			
			try {
				con = DBConnection.createConnection();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT username, email FROM utilizadores WHERE isDeleted='0'");
			
			while(rs.next()){
				String db_username 	= rs.getString("username");
				String db_email		= rs.getString("email");
				if(db_username.equals(username) || db_email.equals(email)){
					return true;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static Utilizador obterUtilizador(String username, String password){

		try {
			Connection con 	= null;
			ResultSet rs 	= null;
			Statement stmt 	= null;
			
			try {
				con = DBConnection.createConnection();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT ID,username,tipo,nome,sobrenome,nacionalidade,morada,localidade,codigoPostal,contacto,email,password,isOnline,isDeleted FROM utilizadores WHERE username='"+username+"' AND password='"+password+"'");
			
			while(rs.next()){
				String db_username 	= rs.getString("username");
				String db_password	= rs.getString("password");
				if(db_username.equals(username) || db_password.equals(password)){
					
					String nome 		= rs.getString("nome");
					String sobrenome	= rs.getString("sobrenome");
					String nacionalidade = rs.getString("nacionalidade");
					String morada		= rs.getString("morada");
					String localidade	= rs.getString("localidade");
					String cp			= rs.getString("codigoPostal");
					String contacto		= rs.getString("contacto");
					String email		= rs.getString("email");
					boolean isOnline	= Boolean.valueOf(rs.getString("isOnline"));
					boolean isDeleted	= Boolean.valueOf(rs.getString("isDeleted"));
					
					Utilizador u = new Utilizador(nome, sobrenome, nacionalidade, morada, localidade, cp, contacto, email, db_username, db_password, isOnline, isDeleted);
					return u;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
