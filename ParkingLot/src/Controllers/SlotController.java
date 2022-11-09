package Controllers;

import Models.Slot;
import Models.Ticket;
import Models.Vehicle;

public class SlotController {
    Slot slot;

    public SlotController(Slot slot) {
        this.slot = slot;
    }

    boolean bookSlot(Vehicle vehicle) {
        if(slot.getOccupied() || vehicle.getVehicleType() != slot.getVehicleType()) return false;
        this.slot.setOccupied(true);
        this.slot.setParkedVehicle(vehicle);
        return true;
    }
    boolean freeSlot(Ticket ticket) {
        if(!this.slot.getOccupied() || this.slot.getParkedVehicle()!=ticket.getVehicle()) return false;
        slot.setOccupied(false);
        slot.setParkedVehicle(null);
        return true;
    }
}
