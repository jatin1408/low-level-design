package Controllers;

import Enums.City;
import Models.Movie;
import Models.Show;
import Models.Theatre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City, List<Theatre>> cityListMap;
    List<Theatre> allTheatres;

    public TheatreController() {
        cityListMap = new HashMap<>();
        allTheatres = new ArrayList<>();
    }

    void addTheatre(Theatre theatre, City city) {
        List<Theatre> list = cityListMap.getOrDefault(city, new ArrayList<>());
        list.add(theatre);
        cityListMap.put(city, list);
    }
    Map<Theatre,List<Show>> getAllShow(Movie movie, City city) {
        Map<Theatre, List<Show>> theatreListMap = new HashMap<>();
        for(Theatre theatre:cityListMap.getOrDefault(city, new ArrayList<>())) {

            List<Show> shows = theatre.getShows();

            List<Show> matchedShows = new ArrayList<>();
            for(Show show:shows){

                if (show.getMovie().getId() == movie.getId()) {
                    matchedShows.add(show);
                }
            }
            if(!matchedShows.isEmpty()) theatreListMap.put(theatre, matchedShows);
        }
        return theatreListMap;
    }
}
