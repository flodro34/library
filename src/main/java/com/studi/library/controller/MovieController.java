package com.studi.library.controller;

import com.studi.library.pojo.Movie;
import com.studi.library.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
 * @controller -> renvoie du HTML "MVC"
 *  */
@RestController // REST ( consommation et production de JSON
@RequestMapping(ApiRegistration.API_REST + ApiRegistration.API_MOVIE)
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    List<Movie> findAllMovie(){
        return movieService.findAllMovie();
    }

    @GetMapping("{id}")
    Movie findMovieById(Long id){
        return movieService.findMovieById(id);
    }
    @PostMapping
    void createMovie(@RequestBody Movie movie){
        movieService.createMovie(movie);
    }

    @DeleteMapping("/{id}")
    void deleteMovieById(@PathVariable("id") Long id){
        movieService.deleteMovieById(id);
    }

    @PutMapping("/{id}")
    void updateMovieById(@RequestBody Movie newMovie, @PathVariable("id") Long id){
        movieService.updateMovieById(newMovie,id);
    }

    @PostMapping(ApiRegistration.API_API_MOVIE_LIST)
    void createAllMovie(@RequestBody List<Movie>movies){
        movieService.createAllMovies(movies);
    }
}
