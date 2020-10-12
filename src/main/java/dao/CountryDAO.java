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
//        return em.createQuery("select c from Country c", Country.class).getResultList();
        return em.createNamedQuery("Country.FindAll", Country.class).getResultList();
    }

    public Country find(int id) {
        return em.find(Country.class, id);
    }
}
