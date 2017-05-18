package com.develop_minura.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Ficheiro de connexão à base de dados.
 * 
 * Criado por:
 * @author Minura Enterprise
 *
 */

public class DBConn {
	
	private static String JDBC_porta	= "3306";
	private static String JDBC_server	= "localhost";
	private static String JDBC_username = "root";
	private static String JDBC_password = "";
	private static String JDBC_database = "minura_stand";
	
	private static String JDBC_driver 	= "com.mysql.jdbc.Driver";
	private static String JDBC_url		= "jdbc:mysql://"+JDBC_server+":"+JDBC_porta+"/";
	
	
	/**
	 * Metodo que cria a função e devolve uma conexão à base de dados
	 * @return Connection
	 * @throws Exception
	 */
	public static Connection createConnection() throws Exception {
		Connection 	conn = null;
		Connection	con = null;
		String		checkData = null;
		
		try{
			
			Class.forName(JDBC_driver);
			
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(JDBC_url, JDBC_username, JDBC_password);
			
			//Verifica se a base de dados existe, se NÃO existir ele vai criar a base de dados.
			checkData = checkDatabase(conn, JDBC_database);
			conn.close();
			
			conn = null;
			con = DriverManager.getConnection(checkData, JDBC_username, JDBC_password);
			
		}catch (SQLException se) {
			// Erros do sql
			se.printStackTrace();
		}catch (Exception e) {
			// Erros do jdbc_driver
			e.printStackTrace();
		}finally {
			if(con != null){
				return con;
			}
			
		}
		return null;
	}
	
	/**
	 * Verifica se existe a base de dados.
	 * Caso a base de dados não exista, ele vai criar essa mesma base de dados.
	 * 
	 * Recebe como parametros, uma conexão e o nome da base de dados.
	 * Vai devolver uma string que na realidade é a conexão reformulada com a base de dados.
	 * 
	 * @param con
	 * @param db_name
	 * @return String
	 * @throws Exception
	 */
	public static String checkDatabase(Connection con, String db_name) throws Exception{
		
		boolean exists 	= false;
		String newUrl 	= null;
		
		try{
			
			System.out.println("Checking database...");
			ResultSet rs = con.getMetaData().getCatalogs();
			
			while(rs.next()){
				String namedb = rs.getString(1);
				if(namedb.equals(db_name)){
					exists = true;
					System.out.println("Database found. Collecting data...");
				}
			}
			
			if(exists != true){
				PreparedStatement createDB = con.prepareStatement("CREATE DATABASE IF NOT EXISTS " + db_name);
				createDB.executeUpdate();
				System.out.println("Database created with success...");
			}
			
			newUrl = JDBC_url+db_name;
			
		}catch (SQLException se) {
			// Erros do sql
			se.printStackTrace();
		}catch (Exception e) {
			// Erros do jdbc_driver
			e.printStackTrace();
		}finally {
			if(newUrl != null){
				return newUrl;
			}
		}
		
		return null;
	}
	
	/**
	 * Metodo que cria a tabela na base de dados.
	 * 
	 * Recebe como parametros, uma conexão e uma query(String).
	 * 
	 * @param con
	 * @param query
	 * @throws Exception
	 */
	public static void createTable(Connection con, String query) throws Exception{
		
		PreparedStatement stmt = null;
		
		try {
			
			System.out.println("Preparing statement...");
			stmt = con.prepareStatement(query);
			stmt.executeUpdate();
			System.out.println("Table created...");
			
			stmt.close();
			stmt = null;
			
		}catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(stmt != null){
				try {
					stmt.close();
				} catch (SQLException se2) {
					se2.printStackTrace();
				}
				
				stmt = null;
			}
		}
	}
	
	/**
	 * Metodo que insere numa tabela.
	 * 
	 * Recebe como parametros uma conexão e uma query(string).
	 * 
	 * @param con
	 * @param query
	 * @throws Exception
	 */
	public static void insertIntoTable(Connection con, String query) throws Exception {

		Statement stmt = null;
		
		try{
			System.out.println("Inserting into table...");
			stmt = con.createStatement();
			stmt.execute(query);
			System.out.println("Success inserting into table...");
			
			stmt.close();
			stmt=null;
			
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(stmt != null){
				try{
					stmt.close();
				}catch (SQLException se) {}
				
				stmt=null;
			}
		}
	}
}
