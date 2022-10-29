package Models;

import Enums.City;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    List<Screen> screens;
    List<Show> shows;
    City city;

    public Theatre(City city) {
        this.city = city;
        this.screens = new ArrayList<>();
        this.shows = new ArrayList<>();
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
