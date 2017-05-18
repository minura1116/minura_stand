package com.develop_minura.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.develop_minura.model.MySQL;

public class DBConnection {
	
	private static MySQL conn = new MySQL();
	
	public DBConnection(){
	}
	
	public static Connection createConnection() throws Exception {

		conn.setDriver("com.mysql.jdbc.Driver");
		conn.setDatabase("minura_stand");
		conn.setUrl("jdbc:mysql://localhost:3306/");
		conn.setUsername("root");
		conn.setPassword("");
		try {
			
			Connection con = createTable(conn.getDriver(), conn.getDatabase(), conn.getUrl(), conn.getUsername(), conn.getPassword());
						
			return con;
			
		} catch (Exception e) { System.out.println(e); }
		
		return null;
	}
	
	private static Connection createTable(String driver, String database, String url, String username, String password) throws Exception {
		
		boolean exists 	= false;
		
		try {
			
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pre_tbl_name = null;
			
			ResultSet rs = con.getMetaData().getCatalogs();
			
			while(rs.next()){
				String db_name = rs.getString(1);
				if(db_name.equals(database)){
					exists = true;
				}
			}
			
			if(exists == false){
				PreparedStatement createDB = con.prepareStatement("CREATE DATABASE IF NOT EXISTS "+ database);
				createDB.executeUpdate();
				
				System.out.println("Base de dados criada com sucesso!");
			}
			
			String newUrl = url;
			conn.setUrl(newUrl+database);

			con = DriverManager.getConnection(conn.getUrl(), conn.getUsername(), conn.getPassword());

			if(exists == false){
				pre_tbl_name = con.prepareStatement("CREATE TABLE IF NOT EXISTS utilizadores (ID int NOT NULL AUTO_INCREMENT, username varchar(40), tipo int DEFAULT '1', nome varchar(40), sobrenome varchar(40), nacionalidade varchar(50), morada varchar(200), localidade varchar(60), codigoPostal varchar(11), contacto varchar(10), email varchar(200), password varchar(40), isOnline bit DEFAULT 0, isDeleted bit DEFAULT 0, PRIMARY KEY(ID));");
				pre_tbl_name.executeUpdate();
	
				pre_tbl_name = con.prepareStatement("CREATE TABLE IF NOT EXISTS tipos (ID int NOT NULL AUTO_INCREMENT, nome varchar(40), PRIMARY KEY(ID));");
				pre_tbl_name.executeUpdate();
				
				DBConnection.installation();
				System.out.println("Instalacao finalizada com sucesso!");
			}
			
			return con;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
	}
	
	private static void installation() throws Exception {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {

			conn = createConnection();
			stmt = conn.createStatement();
			
			stmt.execute("INSERT INTO tipos (ID, nome) VALUES (NULL, 'user'), (NULL, 'vendedor'), (NULL, 'responsavel'), (NULL, 'administrador');");
			
			stmt.close();
			stmt = null;
			
			conn.close();
			conn=null;
			
		} catch (Exception e) {
		} finally {
			if(stmt != null){
				try{
					stmt.close();
				}catch (SQLException e) {}
				
				stmt=null;
			}
			
			if(conn != null){
				try{
					conn.close();
				}catch (SQLException e) {}
				
				conn = null;
			}
		}
	}
}
