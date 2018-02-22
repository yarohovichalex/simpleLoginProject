package by.htp.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlit
 */
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private String pageSecond = "/second.jsp";
	private String pageError = "/error.jsp";

	private List<String> values = new ArrayList<String>();
	
	{
		values.add("one");
		values.add("two");
		values.add("three");
		values.add("four");
		values.add("five");
	}
	
	
    public MainServlet() {
        super();
        
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
	}

	
	public void destroy() {
		System.out.println("destroy");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("doGet");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("doPost");
		String param= request.getParameter("action");
		if(param.equals("test")) {
			
			request.setAttribute("user_name", "Alex");
			request.setAttribute("list", values);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(pageSecond);
			dispatcher.forward(request, response);
			System.out.println("Test sucsesful");
			
		}else if(param.equals("test4")) {
			PrintWriter out = response.getWriter();
			final HttpServletRequest req = (HttpServletRequest) request;
			String username =  req.getParameter("qqqq");
			System.out.println("vvedeno: " + username);
			out.println(req.getParameter("qqqq"));
		}
		
		else {
			String errorStr = "произ аш";
			
			request.setAttribute("user_name", "Zakhar");
			request.setAttribute("errStr", errorStr);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(pageError);
			dispatcher.forward(request, response);
			
			
		}
		
		
	}

}
