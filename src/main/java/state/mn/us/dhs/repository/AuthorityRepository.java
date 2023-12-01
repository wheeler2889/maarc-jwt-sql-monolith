package state.mn.us.dhs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import state.mn.us.dhs.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
