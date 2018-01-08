package com.labratorij.PM.Controller;


import com.labratorij.PM.Entity.Tasks;
import com.labratorij.PM.Services.TaskServices;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
@ComponentScan("com.labratorij.PM")
public class TaskController {


    private final TaskServices taskServices;


    public TaskController(TaskServices taskServices) {
        this.taskServices = taskServices;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("tasks", taskServices.getAll());
        return "index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createTask(@RequestParam("nameTask") String name, @RequestParam("task") String task, ModelMap model){
        taskServices.add(new Tasks(name, task) );
        return "redirect:/";
    }

    @RequestMapping(value = "/edit_id", method = RequestMethod.GET)
    public String editIdTask(@RequestParam("id") int id, ModelMap model){
        taskServices.delete(id);
        return "EditTask";
    }

    @RequestMapping(value = "/edit" , method = RequestMethod.POST)
    public String editTask(@RequestParam("nameTask") String name, @RequestParam("task") String task, ModelMap model){
        taskServices.add(new Tasks(name, task));
        return "redirect:/";
    }


    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@RequestParam("id") int id, ModelMap model){
        taskServices.delete(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(@RequestParam("nameTask") String name, ModelMap model){
        model.addAttribute("tasks",taskServices.getTasks(name));
        return "index";
    }



}
