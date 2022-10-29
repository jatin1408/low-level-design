package Models;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    int id;
    String name;
    List<Seat> seats;

    public Screen(int id, String name) {
        this.id = id;
        this.name = name;
        this.seats = new ArrayList<>();
    }

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

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
