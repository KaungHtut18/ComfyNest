package th.mfu.Repos;

import org.springframework.data.repository.CrudRepository;

import th.mfu.domain.Tenant;

public interface TenantRepository extends CrudRepository<Tenant, String> {
    
}