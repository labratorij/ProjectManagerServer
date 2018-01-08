package com.labratorij.PM.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "peson", schema = "tasks")
public class Person {
    private int id;
    private String name;

    public Person(String name, Set<Team> teams){
        this.name = name;
        this.teams = teams;
    }
    public Person(){

    }

    @Id
    @GenericGenerator(name = "inc", strategy = "increment")
    @GeneratedValue(generator = "inc")
    @Column(name = "id", nullable = false)
    public int getId(){return id;}

    public void setId(int id) {this.id = id;}

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "peson_has_team", joinColumns = @JoinColumn(name = "Peson_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "Team_id", referencedColumnName = "id"))
    private Set<Team> teams;

    public Set<Team> getTeams(){
        return teams;
    }

    public void setTeams(Set<Team> teams){
        this.teams = teams;
    }



}
