package com.labratorij.PM.Services;

import com.labratorij.PM.Entity.Tasks;
import com.sun.javafx.tk.Toolkit;

import java.util.List;

public interface TaskServices {
    void add(Tasks tasks);
    void delete(int id);
    List<Tasks> getAll();
    List<Tasks> getTasks(String name);
    void edit(int id, String nameTask, String task);
}
