package fr.univtours.polytech.exam.metier;

import java.util.List;

import fr.univtours.polytech.exam.model.ArticleBean;
import jakarta.ejb.Stateless;

@Stateless
public class CommerceMetierImpl implements CommerceMetier{
    //private UserDao userDao;
    //private ArticleDao articleDAO;
    
    public CommerceMetierImpl() {
        //this.userDao = new userDao();
    }
    
    public boolean connexion(String login, String password) {
        
        return true;
    }

    public List <ArticleBean> getArticles() {
        return null;
    }

    public void addArticle(int id_article) {

    }

    public void removeArticle(int id_article) {
        
    }
}
