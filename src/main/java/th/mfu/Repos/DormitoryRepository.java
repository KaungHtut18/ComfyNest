package th.mfu.Repos;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import th.mfu.domain.Dormitory;

public interface DormitoryRepository extends CrudRepository<Dormitory, Integer> {
   
    public ArrayList<Dormitory> findByProvinceIgnoreCaseContaining(String province);
    public ArrayList<Dormitory> findByNameIgnoreCaseContaining(String name);
    public ArrayList<Dormitory> findByCity(String City);
}
