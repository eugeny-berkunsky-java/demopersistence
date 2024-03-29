package entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@NamedQueries({
       @NamedQuery(name = "Country.FindAll", query = "select c from Country c")
})
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String shortName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @OneToMany(mappedBy = "country")
    private Collection<Vendor> vendors;

    public Collection<Vendor> getVendors() {
        return vendors;
    }

    public void setVendors(Collection<Vendor> vendors) {
        this.vendors = vendors;
    }
}
