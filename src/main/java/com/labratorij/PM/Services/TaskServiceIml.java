package com.labratorij.PM.Services;

import com.labratorij.PM.Entity.Tasks;
import com.labratorij.PM.Repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceIml implements TaskServices{

    @Autowired
    private TasksRepository tasksRepository;

    public void add(Tasks tasks) {
        tasksRepository.save(tasks);
    }
    @Override
    public void delete(int id) {
        tasksRepository.deleteById(id);
    }

    @Override
    public List<Tasks> getAll() {
        return tasksRepository.findAll();
    }
    @Override
    public List<Tasks> getTasks(String name) {
        List<Tasks> list = tasksRepository.findAll();
        List<Tasks> result = new ArrayList<Tasks>();
        for(Tasks tasks : list){
            if(tasks.getNameTask().equals(name)){
                result.add(tasks);
            }
        }
        return result;
    }
    @Override
    public void edit(int id, String nameTask, String task) {
        tasksRepository.deleteById(id);
        tasksRepository.save(new Tasks(nameTask,task));
    }
}
