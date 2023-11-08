package th.mfu;

import org.springframework.data.repository.CrudRepository;

import th.mfu.domain.Dormitory;

public interface DormitoryRepository extends CrudRepository<Dormitory, String> {
    
}
