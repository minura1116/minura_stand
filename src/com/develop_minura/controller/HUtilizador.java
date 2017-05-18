package com.develop_minura.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.develop_minura.model.Utilizador;
import com.develop_minura.service.SUtilizador;
import com.develop_minura.util.DBUtilizador;

@WebServlet("/HUtilizador")
public class HUtilizador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private SUtilizador servUtilizador;
	
    public HUtilizador() {
        super();
        
        this.servUtilizador = new SUtilizador();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameterMap().containsKey("add_ut")){

			String nome				=null;
			String sobrenome		=null;
			String nacionalidade	=null;
			String morada			=null;
			String localidade		=null;
			String cp				=null;
			String contacto			=null;
			String email			= request.getParameter("email");
			String username			= request.getParameter("username");
			String password			= request.getParameter("password");
			String passwordCheck	= request.getParameter("passwordCheck");
			boolean	isOnline		=false;
			boolean isDeleted		=false;
			
			if(!email.equals("")){
				if(!username.equals("")){
					if(!password.equals("") && password.equals(passwordCheck)){
						
						Utilizador u = new Utilizador(nome, sobrenome, nacionalidade, morada, localidade, cp, contacto, email, username, password, isOnline, isDeleted);
						this.servUtilizador.addUtilizador(u);
						
						//Adiciona o utilizador à base de dados
						if(DBUtilizador.addUtDB(u) == true){
							response.sendRedirect("register.jsp?Success");
						}else{
							response.sendRedirect("register.jsp?FailToAdd");
						}
						
					}else{
						response.sendRedirect("register.jsp?Error=password&code=matchOrEmpty");
					}
				}else{
					response.sendRedirect("register.jsp?Error=username&code=empty");
				}
			}else{
				response.sendRedirect("register.jsp?Error=email&code=empty");
			}
			
		
		}//fim do if do add_ut
		else if (request.getParameterMap().containsKey("log_ut")){
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			if(!username.equals("")){
				if(!password.equals("")){
					if(DBUtilizador.authenticateUser(username, password).equals("SUCCESS")){
						if(DBUtilizador.obterUtilizador(username, password) != null){
							HttpSession session = request.getSession();
							session.setAttribute("utilizador", DBUtilizador.authenticateUser(username, password));
							response.sendRedirect("index.jsp");
						}else{
							response.sendRedirect("login.jsp?Error=authentication&code=notFound");
						}
					}else{
						response.sendRedirect("login.jsp?Error=authentication&code=wrongDetails");
					}
				}else{
					response.sendRedirect("login.jsp?Error=password&code=empty");
				}
			}else{
				response.sendRedirect("login.jsp?Error=username&code=empty");
			}
		}
		
		this.doGet(request, response);
	}

}
