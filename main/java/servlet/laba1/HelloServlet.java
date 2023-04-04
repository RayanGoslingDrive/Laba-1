package servlet.laba1;

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
        out.println("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n" +
                "    <title>JSP - Hello World</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"container\">\n" +
                "    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n" +
                "        <div class=\"colLapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
                "            <ul class=\"navbar-nav mr-auto\">\n" +
                "                <li class=\"nav-item activate\">\n" +
                "                    <form action =\"lab\">\n" +
                "                        <button value=\"1\" name=\"button\" class=\"btn btn-success\">Услуги(Главная)</button>\n" +
                "                    </form>\n" +
                "                </li>\n" +
                "                <li class=\"nav-item\">\n" +
                "                    <form action =\"lab\">\n" +
                "                        <button value=\"2\" name=\"button\" class=\"btn btn-success\">Контакты</button>\n" +
                "                    </form>\n" +
                "                </li>\n" +
                "                <li class=\"nav-item\">\n" +
                "                    <form action =\"lab\">\n" +
                "                        <button value=\"3\" name=\"button\" class=\"btn btn-success\">О нас</button>\n" +
                "                    </form>\n" +
                "                </li>\n" +
                "                <li class=\"nav-item\">\n" +
                "                    <form action =\"lab\">\n" +
                "                        <button value=\"4\" name=\"button\" class=\"btn btn-success\">Обратная связь</button>\n" +
                "                    </form>\n" +
                "                </li>\n" +
                "            </ul>\n" +
                "        </div>\n" +
                "    </nav>\n" +
                "</div>\n");

        switch (str) {
            case  ("1"):
                out.println( "<p>Скупаем всб колбасу в мире</p>\n");
                break;
            case ("2"):
                out.println( "<p>31651256</p>\n");
                break;
            case ("3"):
                out.println( "<p>Silent</p>\n");
                break;
            case ("4"):
                out.println( "<p>no cap cool thing fr fr on god</p>\n");
                break;
        }


        out.println( " <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n" +
                "<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n" +
                "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n" +
                "</body>\n" +
                "</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}