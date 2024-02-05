package Storage;

import Models.Actor;
import Models.Director;
import Models.Movie;
import Models.TVSerie;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Movie> movies = new ArrayList<Movie>();
    private ArrayList<TVSerie> series = new ArrayList<>();
    private ArrayList<Actor> actors = new ArrayList<Actor>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public void addTVSerie(TVSerie serie) {
        series.add(serie);
    }
    public void printMedier () {
        System.out.println("Film:");
        System.out.println();
        for (Movie movie : movies) {
            System.out.print(movie + " ");
        }
        System.out.println();
        for (TVSerie tvSerie : series) {
            System.out.println(series + " ");

        }
    }
    public ArrayList<Movie> filmAfDirector (Director director){
        ArrayList arrayList = new ArrayList<Movie>();
        for (Movie movie : movies) {
            if (movie.getDirector().equals(director)) {
                arrayList.add(movie);
            }
        }
        return arrayList;
    }
}
