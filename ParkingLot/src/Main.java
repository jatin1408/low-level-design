import Controllers.ParkingLotController;
import Enums.VehicleType;
import Models.Floor;
import Models.ParkingLot;
import Models.Slot;
import Models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Floor> createFloors() {
        List<Floor> floors = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            Floor floor = new Floor((long) i);
            List<Slot> slots = createSlots();
            floor.setSlotList(slots);
            floors.add(floor);
        }
        return floors;
    }

    public static List<Slot> createSlots() {
        List<Slot> slots = new ArrayList<>();
        slots.add(new Slot(VehicleType.TRUCK, 1L));
        for (int i = 2; i < 4; i++) slots.add(new Slot(VehicleType.CAR, (long) i));
        for (int i = 4; i < 6; i++) slots.add(new Slot(VehicleType.BIKE, (long) i));
        return slots;
    }

    public static void helper(Ticket ticket) {
        if (ticket != null) System.out.println(ticket.generateTicket());
        else System.out.println("Ticket not booked");
    }

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(1L);
        ParkingLotController parkingLotController = new ParkingLotController(parkingLot);
        List<Floor> floors = createFloors();
        for (Floor floor : floors) parkingLotController.addFloor(floor);
        Ticket t1 = parkingLotController.parkVehicle(VehicleType.TRUCK, "1001", "BLACK");
        helper(t1);
        Ticket t2 = parkingLotController.parkVehicle(VehicleType.TRUCK, "1002", "BLUE");
        helper(t2);
        Ticket t3 = parkingLotController.parkVehicle(VehicleType.TRUCK, "1003", "BLUE");
        helper(t3);
        Ticket t4 = parkingLotController.parkVehicle(VehicleType.CAR, "9854", "BLUE");
        helper(t4);
        parkingLotController.display(VehicleType.TRUCK, false);
        parkingLotController.displayCount(VehicleType.TRUCK, true);
        parkingLotController.unPark(t2);
        Ticket t5 = parkingLotController.parkVehicle(VehicleType.TRUCK, "1003", "BLUE");
        helper(t5);
    }

}
