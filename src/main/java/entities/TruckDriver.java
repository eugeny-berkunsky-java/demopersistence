package entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class TruckDriver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany
    private Collection<Truck> trucks;

    public Collection<Truck> getTrucks() {
        return trucks;
    }

    public void setTrucks(Collection<Truck> trucks) {
        this.trucks = trucks;
    }
}
