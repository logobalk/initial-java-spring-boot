package com.siampharm.repository;

import com.siampharm.sampling.model.MaterialGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialGroupRepository extends JpaRepository<MaterialGroup, Integer> {
}
