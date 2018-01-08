package com.labratorij.PM.Services;

import com.labratorij.PM.Entity.Person;
import com.labratorij.PM.Entity.Team;

import java.util.List;
import java.util.Set;

public interface TeamServices {
    void add(Team team);
    void delete(int id);
    List<Team> getAll();
    Set<Person> getPerson(int id);
}
