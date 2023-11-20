package th.mfu.Repos;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import th.mfu.domain.Rating;

public interface RatingRepository extends CrudRepository<Rating, Integer> {
    @Modifying
    @Query("UPDATE Rating r SET r.OneCount = r.OneCount + 1 WHERE r.id = :ratingId")
    void increaseOneCountById(int ratingId);

    @Modifying
    @Query("UPDATE Rating r SET r.twoCount = r.twoCount + 1 WHERE r.id = :ratingId")
    void increaseTwoCountById(int ratingId);

    @Modifying
    @Query("UPDATE Rating r SET r.threeCount = r.threeCount + 1 WHERE r.id = :ratingId")
    void increaseThreeCountById(int ratingId);

    @Modifying
    @Query("UPDATE Rating r SET r.fourCount = r.fourCount + 1 WHERE r.id = :ratingId")
    void increaseFourCountById(int ratingId);

    @Modifying
    @Query("UPDATE Rating r SET r.fiveCount = r.fiveCount + 1 WHERE r.id = :ratingId")
    void increaseFiveCountById(int ratingId);
}
