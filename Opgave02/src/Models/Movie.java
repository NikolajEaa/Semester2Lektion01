package Models;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie extends Medier{
    private int productionYear;
    private Director director;
    private double rating;


    public Movie(String title, int productionYear, Director director, Genre[] genres,
                 double rating, ArrayList<Actor> cast) {
        super(title, genres, cast);

        this.productionYear = productionYear;
        this.director = director;
        this.rating = rating;

    }

    public Director getDirector() {
        return director;
    }
}
