package com.labratorij.PM.Repository;

import com.labratorij.PM.Entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<Tasks, Integer> {
}
