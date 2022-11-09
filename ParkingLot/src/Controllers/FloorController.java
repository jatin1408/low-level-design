package Controllers;

import Models.Floor;
import Models.Slot;

public class FloorController {
    Floor floor;

    public FloorController(Floor floor) {
        this.floor = floor;
    }
    void addSlot(Slot slot) {
        this.floor.getSlotList().add(slot);
    }
}
