package de.almaphil.insights.repository;

import de.almaphil.insights.domain.Bloodpressure;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Bloodpressure entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BloodpressureRepository extends JpaRepository<Bloodpressure, Long> {}
