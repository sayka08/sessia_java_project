package org.example.sayatbek_sessia.controller;

import org.example.sayatbek_sessia.model.Task;
import org.example.sayatbek_sessia.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TaskViewController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public String getTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
}
