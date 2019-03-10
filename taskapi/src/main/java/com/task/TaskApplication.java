package com.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class TaskApplication {

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/books")
    public Map home() {
        Map model = new HashMap();
        model.put("content", getListOfBooks());
        return model;
    }

    private Task[] getListOfBooks() {
        Task firstTask = new Task();
        firstTask.setTaskName("TImesheet");        firstTask.setTaskPriority("high");
        firstTask.setTaskStatus("Not Started");


        return new Task[]{firstTask};
    }
    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }
}
