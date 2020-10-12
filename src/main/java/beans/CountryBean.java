package beans;

import dao.CountryDAO;
import entities.Country;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@SessionScoped
@Named
public class CountryBean implements Serializable {

    @EJB
    private CountryDAO countryDAO;

    private Country country = new Country();

    public Country getCountry() {
        return country;
    }

    public List<Country> getCountries() {
        return countryDAO.findAll();
    }
}
