package th.mfu.Repos;

import org.springframework.data.repository.CrudRepository;

import th.mfu.domain.WishList;

public interface WishListRepository extends CrudRepository<WishList, String> {
    
}
