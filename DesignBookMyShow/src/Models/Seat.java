package Models;

import Enums.SeatCategory;

public class Seat {
    int id;
    Enum<SeatCategory> category;
    User bookedBy;
    boolean isBooked;

    public Seat(int id, Enum<SeatCategory> category, User bookedBy, boolean isBooked) {
        this.id = id;
        this.category = category;
        this.bookedBy = bookedBy;
        this.isBooked = isBooked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Enum<SeatCategory> getCategory() {
        return category;
    }

    public void setCategory(Enum<SeatCategory> category) {
        this.category = category;
    }

    public User getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(User bookedBy) {
        this.bookedBy = bookedBy;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
