package controller;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Bulbasaur;
import model.Charizard;
import model.Dragonite;
import model.Mew;
import model.Pikachu;
import model.Pokemon;

/**
 * Servlet implementation class PokemonController
 */
@WebServlet(urlPatterns = {"/pokemon"})
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public PokemonController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String value1 = request.getParameter("card1");
		String value2 = request.getParameter("card2");
		String value3 = request.getParameter("card3");
		String value4 = request.getParameter("card4");
		String value5 = request.getParameter("card5");

		String msg = "";
		String charac = "";
		String typ = "";
		String evol = "";
		String base = "";
		String bulbasaur = "Bulbasaur";
		String charizard = "Charizard";
		String dragonite = "Dragonite";
		String mew = "Mew";
		String pikachu = "Pikachu";
		int pokemonNumber;
		String character;
		String type;
		String evolution;
		String baseExp;
		
		
		if(value1!=null) {
			pokemonNumber = 001;
			Bulbasaur p = new Bulbasaur(bulbasaur,pokemonNumber);
			character = p.characteristics();
			System.out.println(character);
			type = p.type();
			System.out.println(type);
			evolution = p.evolution();
			System.out.println(evolution);
			baseExp = p.baseExp();
			System.out.println(baseExp);
			msg = "<center>"+bulbasaur+"  #"+pokemonNumber;	
			charac = character;
			typ = type;
			evol = evolution;
			base = baseExp;
			request.setAttribute("message1" , msg);
			request.setAttribute("character1" , charac);
			request.setAttribute("type1" , typ);
			request.setAttribute("evolution1" , evol);
			request.setAttribute("baseExp1" , base);
		}
		if(value2!=null) {
			pokemonNumber = 006;
			Charizard c  = new Charizard(charizard,pokemonNumber);
			character = c.characteristics();
			System.out.println(character);
			type = c.type();
			System.out.println(type);
			evolution = c.evolution();
			System.out.println(evolution);
			baseExp = c.baseExp();
			System.out.println(baseExp);
			msg = "<center>"+charizard+"  #"+pokemonNumber;
			charac = character;
			typ = type;
			evol = evolution;
			base = baseExp;
			request.setAttribute("message2" , msg);
			request.setAttribute("character2" , charac);
			request.setAttribute("type2" , typ);
			request.setAttribute("evolution2" , evol);
			request.setAttribute("baseExp2" , base);
		}
		if(value3!=null) {
			pokemonNumber = 149;
			Dragonite d  = new Dragonite(dragonite,pokemonNumber);
			character = d.characteristics();
			System.out.println(character);
			type = d.type();
			System.out.println(type);
			evolution = d.evolution();
			System.out.println(evolution);
			baseExp = d.baseExp();
			msg = "<center>"+dragonite +"  #"+pokemonNumber;
			charac = character;
			typ = type;
			evol = evolution;
			base = baseExp;
			request.setAttribute("message3" , msg);
			request.setAttribute("character3" , charac);
			request.setAttribute("type3" , typ);
			request.setAttribute("evolution3" , evol);
			request.setAttribute("baseExp3" , base);
		}
		if(value4!=null) {
			pokemonNumber = 151;
			Mew m  = new Mew(mew,pokemonNumber);
			character = m.characteristics();
			System.out.println(character);
			type = m.type();
			System.out.println(type);
			evolution = m.evolution();
			System.out.println(evolution);
			baseExp = m.baseExp();
			msg = "<center>"+mew +"  #"+pokemonNumber;
			charac = character;
			typ = type;
			evol = evolution;
			base = baseExp;
			request.setAttribute("message4" , msg);
			request.setAttribute("character4" , charac);
			request.setAttribute("type4" , typ);
			request.setAttribute("evolution4" , evol);
			request.setAttribute("baseExp4" , base);			
		}
		if(value5!=null) {
			pokemonNumber = 25;
			Pikachu pi  = new Pikachu(pikachu,pokemonNumber);
			character = pi.characteristics();
			System.out.println(character);
			type = pi.type();
			System.out.println(type);
			evolution = pi.evolution();
			System.out.println(evolution);
			baseExp = pi.baseExp();
			msg = "<center>"+pikachu +"  #"+pokemonNumber;
			charac = character;
			typ = type;
			evol = evolution;
			base = baseExp;
			request.setAttribute("message5" , msg);
			request.setAttribute("character5" , charac);
			request.setAttribute("type5" , typ);
			request.setAttribute("evolution5" , evol);
			request.setAttribute("baseExp5" , base);	

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

}

