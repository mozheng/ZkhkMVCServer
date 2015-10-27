package cn.zkserver.web.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.zkserver.web.formbean.LoginForm;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name="login", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private static String userfromxml;
	private static String passwordfromxml;
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String userfromjsp = request.getParameter("userName");
		String passwordfromjsp = request.getParameter("password");
		RequestDispatcher rd;
		HttpSession session = request.getSession(true);
		Map <String,String> itemMap = (Map<String,String>)session.getAttribute("sessionMap");
		LoginForm lForm  = new LoginForm();
		try {
			if(  lForm.Login(userfromjsp, passwordfromjsp, itemMap) )
			{
				itemMap=lForm.getItemMap();
				session.setAttribute("sessionMap",itemMap);
				rd = request.getRequestDispatcher("/home.jsp");
				rd.forward(request, response);
			}
			else {
				rd = request.getRequestDispatcher("/index.jsp");
				request.setAttribute("error", "1");
				rd.forward(request, response);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			rd = request.getRequestDispatcher("/index.jsp");
			request.setAttribute("error", "2");
			rd.forward(request, response);
			e.printStackTrace();
			}

	}
	 public void init(ServletConfig config) throws ServletException{
		// TODO Auto-generated method stub
		 super.init(config);
	} 
}
