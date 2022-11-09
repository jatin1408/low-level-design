package Models;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    List<Slot> slotList;
    Long id;

    public Floor(Long id) {
        this.slotList = new ArrayList<>();
        this.id = id;
    }

    public List<Slot> getSlotList() {
        return slotList;
    }

    public void setSlotList(List<Slot> slotList) {
        this.slotList = slotList;
    }

    public Long getId() {
        return id;
    }

    void addSlot(Slot slot) {
        this.slotList.add(slot);
    }

    @Override
    public String toString() {
        return "Floor{" +
                ", id=" + id +
                '}';
    }
}
