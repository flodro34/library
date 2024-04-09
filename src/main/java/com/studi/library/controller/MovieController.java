package com.studi.library.controller;

import com.studi.library.pojo.Movie;
import com.studi.library.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // REST ( consommation et production de JSON
/*
* @controller -> renvoie du HTML "MVC"
*  */
@RequestMapping("api/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    List<Movie> findAllMovie(){
        return movieService.findAllMovie();
    }

    @PostMapping
    void createMovie(@RequestBody Movie movie){
        movieService.createMovie(movie);
    }

    @DeleteMapping("/{id}")
    void deleteMovieById(@PathVariable("id") Long id){
        movieService.deleteMovieById(id);
    }
}
