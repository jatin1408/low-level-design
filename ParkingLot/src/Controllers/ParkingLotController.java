package Controllers;

import Enums.VehicleType;
import Models.*;

import java.util.List;

public class ParkingLotController {
    ParkingLot parkingLot;


    public ParkingLotController(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void addFloor(Floor floor) {
        this.parkingLot.getFloors().add(floor);
    }

    public Ticket parkVehicle(VehicleType vehicleType, String regNo, String color) {
        Vehicle vehicle = new Vehicle(vehicleType, regNo, color);
        return findAndBookEmptySlot(vehicle);

    }
    Ticket findAndBookEmptySlot(Vehicle vehicle) {
        List<Floor> floors = this.parkingLot.getFloors();

        for(Floor floor:floors) {
            List<Slot> slots = floor.getSlotList();
            for(Slot slot:slots) {
                SlotController slotController = new SlotController(slot);
                if(slotController.bookSlot(vehicle)) {
                   Ticket ticket = new Ticket(parkingLot, floor, slot, vehicle);
                   return ticket;
                }
            }
        }
        return null;
    }
    /*
    Pass true if you want to find occupied slots, else pass false
     */
    public void display(VehicleType vehicleType, boolean typeOfSlot) {
        List<Floor> floors = this.parkingLot.getFloors();
        for(Floor floor:floors) {
            List<Slot> slots = floor.getSlotList();
            for(Slot slot:slots) {
                if(slot.getVehicleType() == vehicleType && slot.getOccupied() == typeOfSlot) {
                    System.out.println(slot);
                }
            }
        }
    }

    public void displayCount(VehicleType vehicleType, boolean typeOfSlot) {
        List<Floor> floors = this.parkingLot.getFloors();
        int count =0;
        for(Floor floor:floors) {
            List<Slot> slots = floor.getSlotList();
            for(Slot slot:slots) {
                if(slot.getVehicleType() == vehicleType && slot.getOccupied() == typeOfSlot) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public boolean unPark(Ticket ticket) {

        SlotController slotController = new SlotController(ticket.getSlot());
        return slotController.freeSlot(ticket);
    }


}
