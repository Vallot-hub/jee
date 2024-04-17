package fr.univtours.polytech.exam.dao;

import java.util.List;

import fr.univtours.polytech.exam.model.ArticleBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless 
public class ArticleDaoImpl implements ArticleDao{
    
    @PersistenceContext(unitName = "mysqlexam")
    private EntityManager em;

    @Override
    public void removeArticle(int id_article) {
        em.createNativeQuery("UPDATE ARTICLE SET NBRESTANT = NBRESTANT - 1 WHERE ID_ARTICLE = '"+id_article+"'"); 
        //em.executeUpdate();
    }
    @Override
    public void addArticle(int id_article) {

    }

    @Override
    public List<ArticleBean> getArticle() {
        Query requete = em.createNativeQuery("select * from ARTICLE", ArticleBean.class);
        return requete.getResultList();
    }
}
