package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import dao.DestinoDao;
import model.Cliente;
import model.Destino;


@WebServlet("/CreateAndFindDestino")
public class DestinoCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DestinoCreateAndFind() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pesquisa = request.getParameter("pesquisa");
		
		if(pesquisa == null) {
			pesquisa="";
		}
		
		List<Destino> destinos = DestinoDao.find(pesquisa);
		
		request.setAttribute("destinos", destinos);
		RequestDispatcher resquesDispatcher = request.getRequestDispatcher("listadestinos.jsp");
		resquesDispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Destino destino = new Destino();
		
		destino.setLugar(request.getParameter("lugar"));
		destino.setValor(request.getParameter("valor"));
		
		
		DestinoDao.create(destino);
		
		doGet(request, response);
	}

}
