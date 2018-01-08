package com.labratorij.PM.Repository;

import com.labratorij.PM.Entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
}
