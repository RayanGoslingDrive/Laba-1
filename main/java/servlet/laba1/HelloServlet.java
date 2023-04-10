package servlet.laba1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = request.getParameter("button");
        PrintWriter out = response.getWriter();
        System.out.println(str);
        response.setContentType("text/html");
        switch (str) {
            case  ("1"):
                RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("index.jsp");
                requestDispatcher1.forward(request, response);
                break;
            case ("2"):
                RequestDispatcher requestDispatcher2 = request.getRequestDispatcher("Contacts.jsp");
                requestDispatcher2.forward(request, response);

                break;
            case ("3"):
                RequestDispatcher requestDispatcher3 = request.getRequestDispatcher("About.jsp");
                requestDispatcher3.forward(request, response);
                break;
            case ("4"):
                RequestDispatcher requestDispatcher4 = request.getRequestDispatcher("Feedback.jsp");
                requestDispatcher4.forward(request, response);
                break;

        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}