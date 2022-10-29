package Controllers;

import Enums.City;
import Models.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MovieController {


    Map<City, List<Movie>> cityMovieMap;
    List<Movie> allMovies;
    public MovieController() {
        this.cityMovieMap = new HashMap<>();
        allMovies = new ArrayList<>();
    }
    public void addMovie(Movie movie, List<City> cities) {
        for(City city:cities) {
            List<Movie> list = cityMovieMap.getOrDefault(city, new ArrayList<>());
            list.add(movie);
            cityMovieMap.put(city, list);
        }
        allMovies.add(movie);
    }
    public List<Movie> getAllMovieByCity(City city){
        return cityMovieMap.getOrDefault(city, new ArrayList<>());
    }
    public Movie getMovieByName(String name) {
        for(Movie movie:allMovies) {
            if(movie.getMovieName().equals(name)) return movie;
        }
        return null;
    }
}
