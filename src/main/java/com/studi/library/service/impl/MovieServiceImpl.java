package com.studi.library.service.impl;

import com.studi.library.pojo.Movie;
import com.studi.library.repository.MovieRepository;
import com.studi.library.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> findAllMovie() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findMovieById(Long id) {
        //programmation fonctionnelle
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public void updateMovieById(Movie movie, Long id) {
        //1. Récup du Movie en base
        Movie oldMovie = this.findMovieById(id);

        //2. Vérif si movie n'est pas vide
        if(oldMovie != null){
            //3. MAJ des champs
            oldMovie.setDescription(movie.getDescription());
            oldMovie.setTitle(movie.getTitle());
            //4. on remet le odlMovie en base
            movieRepository.save(oldMovie);
        }
    }

    @Override
    public void deleteMovieById(Long id) {
        movieRepository.deleteById(id);
    }

    @Override
    public void createMovie(Movie movie) {
        movieRepository.save(movie);
    }
}
