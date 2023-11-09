package th.mfu.Repos;

import org.springframework.data.repository.CrudRepository;

import th.mfu.domain.Rating;

public interface RatingRepository extends CrudRepository<Rating, Integer> {
    
}
