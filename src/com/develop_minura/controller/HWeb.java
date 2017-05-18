package com.develop_minura.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.develop_minura.service.SWeb;

/**
 * Servlet implementation class HWeb
 */
@WebServlet("/HWeb")
public class HWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SWeb servWeb;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HWeb() {
        super();
        this.servWeb = new SWeb();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		
		this.doGet(request, response);
	}

}
