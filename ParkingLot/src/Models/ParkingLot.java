package Models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<Floor> floors;
    Long id;

    public ParkingLot(Long id) {
        this.id = id;
        this.floors = new ArrayList<>();
    }

    void addFloor(Floor floor) {
        this.floors.add(floor);
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "id=" + id +
                '}';
    }
}
