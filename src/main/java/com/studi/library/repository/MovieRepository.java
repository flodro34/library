package com.studi.library.repository;

import com.studi.library.pojo.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {

    Movie findMoviesByTitle (String title);

}
