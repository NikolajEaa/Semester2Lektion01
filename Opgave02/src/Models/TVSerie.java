package Models;

import java.util.ArrayList;
import java.util.Arrays;

public class TVSerie extends Medier{

    private int numberOfSeasons;

    public TVSerie(String title, int numberOfSeasons, Genre[] genres, ArrayList<Actor> cast) {
        super(title, genres, cast);
        this.numberOfSeasons = numberOfSeasons;

    }

}
