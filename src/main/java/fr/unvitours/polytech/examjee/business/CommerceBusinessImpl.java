package fr.unvitours.polytech.examjee.business;

import java.util.List;

import fr.unvitours.polytech.examjee.dao.ArticleDao;
import fr.unvitours.polytech.examjee.dao.UserDao;
import fr.unvitours.polytech.examjee.model.ArticleBean;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class CommerceBusinessImpl implements CommerceBusiness {
    @Inject
    private ArticleDao articleDao;
    @Inject
    private UserDao userDao;
    
    public boolean connexion(String login, String password) {
        this.userDao.addUsers();
        return this.userDao.verifyPassword(login, password);
    }

    public List <ArticleBean> getArticles() {
        return null;
    }

    public void addArticle(int id_article) {

    }

    public void removeArticle(int id_article) {
        
    }
}
