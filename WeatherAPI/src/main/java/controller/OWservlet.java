package controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GetWeather;
import model.weatherBean;

/**
 * Servlet implementation class OWservlet
 */
@WebServlet("/OWservlet")
public class OWservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OWservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at:").append(request.getContextPath());
	
		PrintWriter out = response.getWriter();
		
		String cityStr = request.getParameter("city");
		String countryStr = request.getParameter("country");
		weatherBean wBean = new weatherBean(cityStr, countryStr);

		GetWeather.getWeather(wBean);
		
		String cloud = wBean.getCloudsStr();

		//Name, time and value to Cookies
		
		Cookie ckclouds = new Cookie("Clouds", URLEncoder.encode( wBean.getCloudsStr(), "UTF-8" ));
		response.addCookie(ckclouds);
		
		Cookie ckdate = new Cookie("Date", String.valueOf(wBean.getDateStr()));
		response.addCookie(ckdate);
		
		Cookie cktemperature = new Cookie("Temperature", String.valueOf(wBean.getTemperatureCelsius() +"C"));
		response.addCookie(cktemperature);
		
		
		String n = request.getParameter("cookieName");
		Cookie ck = new Cookie("cname", n);
		response.addCookie(ck);
				
		request.setAttribute("wBean", wBean);


		RequestDispatcher rd = request.getRequestDispatcher("showWeather.jsp");
		rd.forward(request, response);
				
		
	}

}