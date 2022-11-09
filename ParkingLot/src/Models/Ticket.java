package Models;

import Enums.VehicleType;

public class Ticket {
    ParkingLot parkingLot;
    Floor floor;
    Slot slot;
    Vehicle vehicle;

    public Ticket(ParkingLot parkingLot,Floor floor, Slot slot,Vehicle vehicle) {
        this.parkingLot = parkingLot;
        this.floor = floor;
        this.slot = slot;
        this.vehicle = vehicle;
    }

    public String generateTicket() {
        return toString();
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "parkingLot=" + parkingLot +
                ", floor=" + floor +
                ", slot=" + slot +
                '}';
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
