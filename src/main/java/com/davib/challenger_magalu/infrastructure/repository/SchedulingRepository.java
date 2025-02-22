package com.davib.challenger_magalu.infrastructure.repository;

import com.davib.challenger_magalu.infrastructure.entities.Scheduling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedulingRepository extends JpaRepository<Scheduling, Long> {
}
