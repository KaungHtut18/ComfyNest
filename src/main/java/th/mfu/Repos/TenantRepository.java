package th.mfu.Repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import th.mfu.domain.Tenant;

public interface TenantRepository extends CrudRepository<Tenant, String> {
    Optional<Tenant> findByEmail(String email);
    
}