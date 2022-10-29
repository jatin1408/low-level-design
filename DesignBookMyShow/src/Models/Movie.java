package Models;

public class Movie {
    int id;
    String movieName;
    double duration;

    public Movie(int id, String movieName, double duration) {
        this.id = id;
        this.movieName = movieName;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
