package fr.unvitours.polytech.examjee.dao;

import java.util.List;

import fr.unvitours.polytech.examjee.model.ArticleBean;

public interface ArticleDao {
    public void removeArticle(int id_article);

    public void addArticle(int id_article);

    public List<ArticleBean> getArticle();
}
