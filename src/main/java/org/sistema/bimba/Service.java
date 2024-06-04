package org.sistema.bimba;

import jakarta.persistence.EntityManager;
import org.sistema.bimba.model.Category;
import org.sistema.bimba.model.Product;

public class Service {
    public void saveEntity(Product product, Category category , EntityManager em) {

        try {
            em.getTransaction().begin();
            em.persist(category);
            em.persist(product);
            em.getTransaction().commit();
            em.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
