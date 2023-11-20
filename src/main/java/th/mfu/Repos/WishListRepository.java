package th.mfu.Repos;

import org.springframework.data.repository.CrudRepository;

import th.mfu.domain.Dormitory;
import th.mfu.domain.Tenant;
import th.mfu.domain.WishList;
import java.util.List;


public interface WishListRepository extends CrudRepository<WishList, String> {
    List<WishList> findByTenant(Tenant tenant);
    void deleteByDormitory(Dormitory dormitory);
    List<WishList> findByDormitoryAndTenant(Dormitory dormitory, Tenant tenant);
}
