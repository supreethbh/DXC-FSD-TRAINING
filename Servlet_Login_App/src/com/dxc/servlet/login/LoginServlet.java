package com.dxc.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dxc.servlet.dao.LoginDAO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    LoginDAO loginDAO = null;

    public LoginServlet() {
	super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	PrintWriter out = response.getWriter();

	String userName = request.getParameter("userName");
	String password = request.getParameter("password");

	loginDAO = new LoginDAO();

	if (loginDAO.check(userName, password)) {

	    HttpSession session = request.getSession();
	    session.setAttribute("userName", userName);

	    response.sendRedirect("welcome.jsp");

	} else {

	    out.print("Please enter valid /'UserName/' or /'Password/'\n");

	    response.sendRedirect("login.jsp");
	}
    }
}
