package entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Truck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String mark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @ManyToMany(mappedBy = "trucks")
    private Collection<TruckDriver> drivers;

    public Collection<TruckDriver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Collection<TruckDriver> drivers) {
        this.drivers = drivers;
    }
}
