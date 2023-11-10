package th.mfu.Repos;

import org.springframework.data.repository.CrudRepository;

import th.mfu.domain.Dormitory;

public interface DormitoryRepository extends CrudRepository<Dormitory, Integer> {
    
}
