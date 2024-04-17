package fr.univtours.polytech.exam.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/articles")
public class ArticleServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("YourPersistenceUnitName"); 
        //EntityManager em = emf.createEntityManager();
        
        //try {
            //TypedQuery<ArticleBean> query = em.createQuery("SELECT a FROM ARTICLE a", ArticleBean.class);
            //List<ArticleBean> articles = query.getResultList();
            //request.setAttribute("articles", articles);
        //} finally {
        //    em.close();
        //    emf.close();
        //}
        request.getRequestDispatcher("ArticlesList.jsp").forward(request, response);
    }
}
