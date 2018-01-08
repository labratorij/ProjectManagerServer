package com.labratorij.PM.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "team", schema = "tasks")
public class Team {

    private int id;
    private String name;

    @ManyToMany(mappedBy = "teams")
    private Set<Person> peoples;

    @Id
    @GenericGenerator(name = "inc", strategy = "increment")
    @GeneratedValue(generator = "inc")
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Person> getPeoples() {
        return peoples;
    }

    public void setPeoples(Set<Person> peoples) {
        this.peoples = peoples;
    }

    public Team() {

    }

    public Team(String name, Set<Person> peoples) {
        this.name = name;
        this.peoples = peoples;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        if (id != team.id) return false;
        if (!name.equals(team.name)) return false;
        return peoples != null ? peoples.equals(team.peoples) : team.peoples == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + (peoples != null ? peoples.hashCode() : 0);
        return result;
    }


}
