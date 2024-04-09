package com.studi.library.service;

import com.studi.library.pojo.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findAllMovie();
    Movie findMovieById(Long id);

    void updateMovieById (Movie movie, Long id);

    void deleteMovieById (Long id);

    void createMovie(Movie movie);
}
