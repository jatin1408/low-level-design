package Controllers;

import Enums.City;
import Enums.SeatCategory;
import Models.*;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

public class BookingApp {
    MovieController movieController;
    TheatreController theatreController;
    BookingApp () {
        this.theatreController = new TheatreController();
        this.movieController = new MovieController();
    }
    private void init() {
        addMovies();
        addTheatre();
    }
    private void addMovies() {
        Movie movie1 = new Movie(1, "Avengers" , 2.5);
        List<City> citesForMovie1 = new ArrayList<>();
        citesForMovie1.add(City.AGRA);
        citesForMovie1.add(City.MUMBAI);
        Movie movie2 = new Movie(2, "Forest Gump" , 3.2);
        List<City> citesForMovie2 = new ArrayList<>();
        citesForMovie2.add(City.DELHI);
        citesForMovie2.add(City.MUMBAI);
        movieController.addMovie(movie1, citesForMovie1);
        movieController.addMovie(movie2, citesForMovie2);
    }
    private void addTheatre() {
        Theatre theatre1 = new Theatre(City.AGRA);
        Theatre theatre2 = new Theatre(City.DELHI);
        theatre1.setScreens(addScreen());
        Movie movie1 = movieController.getMovieByName("Avengers");
        Movie movie2 = movieController.getMovieByName("Forest Gump");
        List<Show> shows = new ArrayList<>();
        shows.add(createShow(movie1, theatre1.getScreens().get(0)));
        theatre1.setShows(shows);
        shows.clear();
        theatre2.setScreens(addScreen());
        shows.add(createShow(movie2, theatre2.getScreens().get(0)));
        theatre2.setShows(shows);
        theatreController.addTheatre(theatre1, City.AGRA);
        theatreController.addTheatre(theatre2, City.DELHI);
    }
    private Show createShow(Movie movie, Screen screen) {
        Show show = new Show(1, movie, screen, 2.5);
        return show;
    }

    private List<Screen> addScreen() {
        List<Screen> screens = new ArrayList<>();
        Screen s1 = new Screen(1, "A1");
        s1.setSeats(createSeats());
        screens.add(s1);
        return screens;
    }

    private List<Seat> createSeats() {
        List<Seat> seats = new ArrayList<>();
        int i=1;
        for(;i<=50;i++) seats.add(new Seat(i, SeatCategory.SILVER, null, false));
        for(;i<=80;i++) seats.add(new Seat(i, SeatCategory.GOLD, null, false));
        for(;i<=100;i++) seats.add(new Seat(i, SeatCategory.PLATINUM, null, false));
        return seats;
    }
    private void createBooking(City city, String movieName, User user) throws Exception {
        List<Movie> movies = movieController.getAllMovieByCity(city);
        Movie selectedMovie = null;
        for(Movie movie:movies)
            if(movie.getMovieName().equals(movieName)) selectedMovie = movie;

        if(selectedMovie == null) throw new Exception("Movie not found in database");
        Map<Theatre, List<Show>> theatreListMap = theatreController.getAllShow(selectedMovie, city);
       //Choose any show
        Show selectedShow = theatreListMap.get(new ArrayList<>(theatreListMap.keySet()).get(0)).get(0);

       List<Integer> seatChosen =  new ArrayList<>();
       seatChosen.add(23);
        List<Seat> seats = selectedShow.getScreen().getSeats();
        List<Seat> seatsBooking = new ArrayList<>();
        for(Seat seat:seats) {
            if(seatChosen.contains(seat.getId())) {
                if(seat.isBooked()) throw new Exception("Seat already booked");
                seatsBooking.add(seat);
            }
        }
        Booking booking = new Booking(user, selectedShow, seatsBooking);
        booking.setSeatsBooking(seatsBooking, user);
        System.out.println("Booked");
    }

    public static void main(String[] args) throws Exception {
        BookingApp bookingApp = new BookingApp();
        bookingApp.init();
        User user1 = new User(1, "Alex", "Brown");
        User user2 = new User(2, "David", "White");
//        bookingApp.createBooking(City.DELHI, "Forest Gump", user1);
        bookingApp.createBooking(City.AGRA, "Avengers", user2);

    }
}
