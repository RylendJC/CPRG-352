package dataaccess;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import models.Role;

/**
 *
 * @author Rylend
 */
public class RoleDB {

    public List<Role> getAll() throws Exception {
        EntityManagerFactory emFactory = DBUtil.getEmFactory();
        
        EntityManager em = emFactory.createEntityManager();
        
        return em.createQuery("Role.findAll", Role.class).getResultList();
    }
}
