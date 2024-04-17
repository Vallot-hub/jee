package fr.unvitours.polytech.examjee.servlet;

import java.io.IOException;

import fr.unvitours.polytech.examjee.business.CommerceBusiness;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class UserServlet extends HttpServlet {
    
    @Inject
    private CommerceBusiness commerceBusiness;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username").toString();
        String password = request.getParameter("password").toString();
        //System.out.println(username);
        if (!username.isBlank() || !password.isBlank())
        {
            if (commerceBusiness.connexion(username, password)) {
                request.getRequestDispatcher("ArticlesList.jsp").forward(request, response);
            }
            else {
                request.getSession().setAttribute("FAILED", true);
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }
        }
        else {
            request.getRequestDispatcher("oui").forward(request, response);
        }
       
    }
}
