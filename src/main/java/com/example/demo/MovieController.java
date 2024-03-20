package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {
  private List<Movie> movies = new ArrayList<>();

  public MovieController() {
    movies.add(new Movie(1, "Harry potter y la píedra filosofal", "1999", "Chris Colombus", "Fantasia", "Lorem ipsum"));
    movies.add(new Movie(2, "Harry Potter y la cámara de los secretos", "2001", "Chris Colombus", "Fantasia", "Lorem ipsum"));
    movies.add(new Movie(3, "Harry potter y el prisionero de azkaban", "2004", "Chris Colombus", "Fantasia", "Lorem ipsum"));
    movies.add(new Movie(4, "Harry potter y el caliz de fuego", "2007", "Chris Colombus", "Fantasia", "Lorem ipsum"));
    movies.add(new Movie(5, "Harry potter y el misterio del principe", "2010", "Chris Colombus", "Fantasia", "Lorem ipsum"));
  }

  @GetMapping("/movies")
  public List<Movie> getMovies() {
    return movies;
  }

  @GetMapping("/movies/{id}")
  public Movie getMovieById(@PathVariable int id) {
    for (Movie movie : movies) {
      if (movie.getId() == id) {
        return movie;
      }
    }
    return null;
  }
  
}
