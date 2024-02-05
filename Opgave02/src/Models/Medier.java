package Models;

import java.util.ArrayList;
import java.util.Arrays;

public class Medier {

    private String title;
    private Genre[] genres;
    private ArrayList<Actor> cast;

    public Medier(String title, Genre[] genres, ArrayList<Actor> cast) {
        this.title = title;
        this.genres = genres;
        this.cast = cast;
    }

    @Override
    public String toString() {
        return title;
    }
}
