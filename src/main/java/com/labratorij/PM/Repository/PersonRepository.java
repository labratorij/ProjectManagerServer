package com.labratorij.PM.Repository;

import com.labratorij.PM.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
