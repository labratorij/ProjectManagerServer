package com.labratorij.ProjectManager.Server.Application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class ProjectManagerController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getRequset(ModelMap modelMap){
        return "My request";
    }
}
