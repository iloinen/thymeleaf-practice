package hu.progmatic.thymeleafpractice.controller;

import hu.progmatic.thymeleafpractice.model.BlogEntry;
import hu.progmatic.thymeleafpractice.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class DatabaseController {

    private TaskService taskService;

    @Autowired
    public DatabaseController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/test")
    public String saveEntity() {
        BlogEntry blogEntry =  new BlogEntry("Without milk", "Content...", "Java", 5, true,
                LocalDate.of(1995, 5, 23));

        taskService.saveBlogEntry(blogEntry);

        return "redirect:/task1";
    }

}
