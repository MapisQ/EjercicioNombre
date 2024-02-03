package org.adaschool.ejercicioapirest.domain.repository;

import org.adaschool.ejercicioapirest.domain.entity.NameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends JpaRepository<NameEntity,Integer> {
}
