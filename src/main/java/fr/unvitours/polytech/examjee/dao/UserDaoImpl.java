package fr.unvitours.polytech.examjee.dao;

import fr.unvitours.polytech.examjee.model.UserBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class UserDaoImpl implements UserDao {

    @PersistenceContext(unitName = "examjee")
    private EntityManager em;


    @SuppressWarnings("unchecked")
	@Override
	public boolean verifyPassword(String login, String password) {

        
        String passworddb = "";
        try {
            passworddb = em.createQuery("select u from " + "UserBean"+" u WHERE u.login = :login", UserBean.class).
            setParameter("login", login).getSingleResult().getPassword();
            System.out.println("password db "+passworddb);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        
      

    
		if ( passworddb.equals(password) ) {
            return true;
        }
        else {
            return false;
        }
	}


	@Override
	public void addUsers() {
        /* */
        UserBean uba = new UserBean();
        uba.setLogin("a");
        uba.setName("A");
        uba.setPassword("a");
		em.merge(uba);
        UserBean ubb = new UserBean();
        uba.setLogin("b");
        uba.setName("B");
        uba.setPassword("b");
        em.merge(ubb);
		//throw new UnsupportedOperationException("Unimplemented method 'addUsers'");
	}
}
