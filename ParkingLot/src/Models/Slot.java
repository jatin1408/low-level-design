package Models;

import Enums.VehicleType;

public class Slot {
    VehicleType vehicleType;
    Vehicle parkedVehicle;
    Boolean isOccupied;
    Long id;

    public Slot(VehicleType vehicleType,Long id) {
        this.vehicleType = vehicleType;
        this.parkedVehicle = null;
        this.isOccupied = false;
        this.id = id;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }

    public Boolean getOccupied() {
        return isOccupied;
    }

    public void setOccupied(Boolean occupied) {
        isOccupied = occupied;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "vehicleType=" + vehicleType +
                ", parkedVehicle=" + parkedVehicle +
                ", id=" + id +
                '}';
    }
}
