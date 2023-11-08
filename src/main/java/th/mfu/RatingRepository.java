package th.mfu;

import org.springframework.data.repository.CrudRepository;

import th.mfu.domain.Rating;

public interface RatingRepository extends CrudRepository<Rating, String> {
    
}
