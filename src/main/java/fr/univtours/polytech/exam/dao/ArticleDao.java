package fr.univtours.polytech.exam.dao;

import java.util.List;

import fr.univtours.polytech.exam.model.ArticleBean;

public interface ArticleDao {
    public void removeArticle(int id_article);

    public void addArticle(int id_article);

    public List<ArticleBean> getArticle();
}
