package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert" })
public class Controller extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	DAO dao = new DAO();
	
	JavaBeans usuario = new JavaBeans();

	public Controller() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		if (action.equals("/main")) {
			usuarios(request, response);
		} else if(action.equals("/insert")) {
			novoUsuario(request,response);
		}else {
			response.sendRedirect("index.html");
		}
	}

	protected void usuarios(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ArrayList<JavaBeans> lista = dao.listarUsuarios();
		request.setAttribute("usuarios", lista);
		RequestDispatcher rd = request.getRequestDispatcher("/cadastro.jsp");
		rd.forward(request, response);
		
	
	}
	
	protected void novoUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		usuario.setNome(request.getParameter("nome"));
		usuario.setEmail(request.getParameter("email"));		
		usuario.setFone_ddd(Integer.parseInt(request.getParameter("fone_ddd")));
		usuario.setFone_numero(request.getParameter("fone_numero"));
		usuario.setFone_tipo(request.getParameter("fone_tipo"));
		usuario.setSenha(request.getParameter("senha"));
		
		dao.inserirUsuario(usuario);
		response.sendRedirect("main");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
