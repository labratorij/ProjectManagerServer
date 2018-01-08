package com.labratorij.PM.Services;

import com.labratorij.PM.Entity.Person;
import com.labratorij.PM.Entity.Team;
import com.labratorij.PM.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TeamServicesImpl implements TeamServices{
    @Autowired
    private TeamRepository teamRepository;

    @Override
    public void add(Team team) {
        teamRepository.save(team);
    }

    @Override
    public void delete(int id) {
        teamRepository.deleteById(id);
    }

    @Override
    public List<Team> getAll() {
        return teamRepository.findAll();
    }

    @Override
    public Set<Person> getPerson(int id) {
        List<Team> teams = teamRepository.findAll();
        Set<Person> people = new HashSet<Person>();
        for(Team team: teams){
            if(team.getId() == id)
                people = team.getPeoples();

        }
        return people;
    }
}
