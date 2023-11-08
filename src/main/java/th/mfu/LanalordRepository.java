package th.mfu;

import org.springframework.data.repository.CrudRepository;

import th.mfu.domain.Landlord;

public interface LanalordRepository extends CrudRepository<Landlord, String> {
    
}
