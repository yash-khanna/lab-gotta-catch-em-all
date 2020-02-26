package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class PokemonController
 */
@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/* Do not modify the lines 41 to 45 */
		String value1 = request.getParameter("card1"); // refers to bulbasaur
		String value2 = request.getParameter("card2"); // refers to charizard
		String value3 = request.getParameter("card3"); // refers to dragonite
		String value4 = request.getParameter("card4"); // refers to Mew
		String value5 = request.getParameter("card5"); // refers to pikachu

		String msg = "";

		if (value1 != null) {
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
		/*	  
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message2",//getter);
			request.setAttribute("character2", //getter);
			request.setAttribute("type2",//getter;
			request.setAttribute("evolution2", //getter);
			request.setAttribute("baseExp2", //getter);*/
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			
			/*	  
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message2",//getter);
			request.setAttribute("character2", //getter);
			request.setAttribute("type2",//getter;
			request.setAttribute("evolution2", //getter);
			request.setAttribute("baseExp2", //getter);*/
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	

			/*	  
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message2",//getter);
			request.setAttribute("character2", //getter);
			request.setAttribute("type2",//getter;
			request.setAttribute("evolution2", //getter);
			request.setAttribute("baseExp2", //getter);*/
		}
		if (value4 != null) {

			// Create the object for Mew class and use getters to retrieve the values	
			/*	  
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message2",//getter);
			request.setAttribute("character2", //getter);
			request.setAttribute("type2",//getter;
			request.setAttribute("evolution2", //getter);
			request.setAttribute("baseExp2", //getter);*/
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values	
/*getter*/
			/*	  
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message2",//getter);
			request.setAttribute("character2", //getter);
			request.setAttribute("type2",//getter;
			request.setAttribute("evolution2", //getter);
			request.setAttribute("baseExp2", //getter);*/

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
