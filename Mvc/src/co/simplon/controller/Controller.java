package co.simplon.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/controller")
public class Controller extends HttpServlet{
	 private static final long serialVersionUID = 1L;
     
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        
	        String login = request.getParameter( "txtLogin" );
	        String password = request.getParameter( "txtPassword" );
	        if ( login == null ) login = "";
	        if ( password == null ) password = "";
	        
	        HttpSession session = request.getSession( true );
	        session.setAttribute( "login", login );
	        session.setAttribute( "password", password );
	        
	        request.getRequestDispatcher( "/vue.jsp" ).forward( request, response );
	    }


	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        String login = request.getParameter( "txtLogin" );
	        String password = request.getParameter( "txtPassword" );

	        HttpSession session = request.getSession( true );
	        session.setAttribute( "login", login );
	        session.setAttribute( "password", password );

	        System.out.println( "in the doPost" );
	        
	        if ( login.equals( "alex" ) && password.equals( "etienne" ) ) {
	            session.setAttribute( "isConnected", true );
	            request.getRequestDispatcher( "/Connected.jsp" ).forward( request, response );
	        } else {
	            session.setAttribute( "isConnected", false );
	            request.getRequestDispatcher( "/vue.jsp" ).forward( request, response );
	        }
	    }
}
