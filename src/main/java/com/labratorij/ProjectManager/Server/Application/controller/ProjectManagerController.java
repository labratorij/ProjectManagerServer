package com.labratorij.ProjectManager.Server.Application.controller;

import com.labratorij.ProjectManager.Server.Application.entity.Tasks;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

@RestController
@RequestMapping("/test")
public class ProjectManagerController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Tasks getRequset(ModelMap modelMap){
        return createMockRemind();
    }

    private Tasks createMockRemind() {
        Tasks tasks = new Tasks();
        tasks.setId(1);
        tasks.setTitle("Try");
        tasks.setDate(new Date(2015,12,10));
        return tasks;
    }


}
