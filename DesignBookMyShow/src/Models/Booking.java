package Models;

import java.util.List;

public class Booking {
    User user;
    List<Seat> seatsBooking;
    Show show;

    public Booking(User user, Show show, List<Seat> seatsBooking) {
        this.user = user;
        this.show = show;
        this.seatsBooking = seatsBooking;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Seat> getSeatsBooking() {
        return seatsBooking;
    }

    public void setSeatsBooking(List<Seat> seatsBooking, User user) {
       for(Seat seat:seatsBooking) {
           seat.isBooked = true;
           seat.bookedBy = user;
       }
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

}
