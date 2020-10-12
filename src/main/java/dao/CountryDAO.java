package dao;

import entities.Country;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CountryDAO {
    @PersistenceContext
    private EntityManager em;

    public List<Country> findAll() {
        return em.createQuery("select c from Country c", Country.class).getResultList();
    }
}
