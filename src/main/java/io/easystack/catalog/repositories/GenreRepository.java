package io.easystack.catalog.repositories;

import io.easystack.catalog.domain.Genre;
import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Genre, Long> {
    Genre findByMlId(String mlId);
}
