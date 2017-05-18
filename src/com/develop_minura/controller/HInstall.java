package com.develop_minura.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.develop_minura.model.Utilizador;
import com.develop_minura.util.DBConn;

/**
 * Servlet implementation class HInstall
 */
@WebServlet("/HInstall")
public class HInstall extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HInstall() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*try {
			Connection con = DBConn.createConnection();
			DBConn.createTable(con,"CREATE TABLE IF NOT EXISTS utilizadores (ID int NOT NULL AUTO_INCREMENT, username varchar(40), tipo int DEFAULT '1', nome varchar(40), sobrenome varchar(40), nacionalidade varchar(50), morada varchar(200), localidade varchar(60), codigoPostal varchar(11), contacto varchar(10), email varchar(200), password varchar(40), isOnline bit DEFAULT 0, isDeleted bit DEFAULT 0, PRIMARY KEY(ID), UNIQUE (username, email));");
			DBConn.createTable(con,"CREATE TABLE IF NOT EXISTS tipos (ID int NOT NULL AUTO_INCREMENT, nome varchar(40), PRIMARY KEY(ID), UNIQUE(nome));");
			DBConn.insertIntoTable(con, "INSERT INTO tipos (ID, nome) VALUES (NULL, 'user'), (NULL, 'vendedor'), (NULL, 'responsavel'), (NULL, 'administrador');");
			Utilizador u = new Utilizador("Minura", "Enterprise", "Portuguesa", "ATEC", "Palmela", "2830-264", "912345678", "minura@admin", "admin", "admin", false, false);
			u.setTipo(7);
			DBConn.insertIntoTable(con, "INSERT INTO utilizadores (username, tipo, nome, sobrenome, nacionalidade, morada, localidade, codigoPostal, contacto, email, password) VALUES ('"+u.getUsername()+"','"+u.getTipo()+"','"+u.getNome()+"','"+u.getSobrenome()+"','"+u.getNacionalidade()+"','"+u.getMorada()+"','"+u.getLocalidade()+"','"+u.getCp()+"','"+u.getContacto()+"','"+u.getEmail()+"','"+u.getPassword()+"')");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
