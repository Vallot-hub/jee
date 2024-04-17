package fr.univtours.polytech.exam.metier;

import java.util.List;

import fr.univtours.polytech.exam.model.ArticleBean;

public interface CommerceMetier {
    public boolean connexion(String login, String password);

    public List <ArticleBean> getArticles();
    
    public void addArticle(int id_article);

    public void removeArticle(int id_article);
}
