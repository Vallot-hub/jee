package fr.unvitours.polytech.examjee.dao;

import java.util.List;

import fr.unvitours.polytech.examjee.model.ArticleBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class ArticleDaoImpl implements ArticleDao {
    
    @PersistenceContext(unitName = "examjee")
    private EntityManager em;

    @SuppressWarnings("unchecked")
    public void removeArticle(int id_article) {  // point de vue de la db
        em.createNativeQuery("UPDATE ARTICLE SET NBRESTANT = NBRESTANT - 1 WHERE ID_ARTICLE = '"+id_article+"'"); 
    }

    public void addArticle(int id_article) {
        em.createNativeQuery("UPDATE ARTICLE SET NBRESTANT = NBRESTANT + 1 WHERE ID_ARTICLE = '"+id_article+"'");
    }

    public List<ArticleBean> getArticle() {
        Query requete = em.createNativeQuery("select * from ARTICLE", ArticleBean.class);
        return requete.getResultList();
    }
}
