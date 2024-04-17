package fr.unvitours.polytech.examjee.business;

import java.util.List;

import fr.unvitours.polytech.examjee.model.ArticleBean;

public interface CommerceBusiness {
    public boolean connexion(String login, String password);

    public List <ArticleBean> getArticles();
    
    public void addArticle(int id_article);

    public void removeArticle(int id_article);
}
