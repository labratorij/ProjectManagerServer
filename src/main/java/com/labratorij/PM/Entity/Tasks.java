package com.labratorij.PM.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "tasktable", schema = "tasks")
public class Tasks {
    private int id;
    private String nameTask;
    private String task;

    public Tasks(String nameTask, String task) {
        this.nameTask = nameTask;
        this.task = task;
    }

    public Tasks() {
    }

    @Id
    @GenericGenerator(name="inc" , strategy="increment")
    @GeneratedValue(generator="inc")
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NameTask", nullable = false, length = 45)
    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    @Basic
    @Column(name = "task", nullable = false, length = 45)
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tasks tasks = (Tasks) o;

        if (id != tasks.id) return false;
        if (nameTask != null ? !nameTask.equals(tasks.nameTask) : tasks.nameTask != null) return false;
        if (task != null ? !task.equals(tasks.task) : tasks.task != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nameTask != null ? nameTask.hashCode() : 0);
        result = 31 * result + (task != null ? task.hashCode() : 0);
        return result;
    }
}
