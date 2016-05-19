package io.easystack.catalog.repositories;

import io.easystack.catalog.domain.Genre;
import io.easystack.catalog.domain.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Long> {
    public Movie findByMlId(String mlId);

    @Query("from Movie movie where :genre member movie.genres")
    public List<Movie> findByGenre(@Param("genre") Genre genre);
}
