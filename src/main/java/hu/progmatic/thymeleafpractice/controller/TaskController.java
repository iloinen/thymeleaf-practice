package hu.progmatic.thymeleafpractice.controller;

import hu.progmatic.thymeleafpractice.model.BlogEntry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class TaskController {

    @GetMapping("/task1")
    public String task1(Model model) {
        BlogEntry blogEntry = new BlogEntry(
                "Title1", "Content1", "Java",
                5, true, LocalDate.now()
        );
        model.addAttribute("entry", blogEntry);

        return "task1";
    }

    @GetMapping("/task3")
    public String task3(Model model) {
        // https://www.baeldung.com/spring-thymeleaf-conditionals
        // https://www.baeldung.com/thymeleaf-boolean

        // Ha helyettesítjük az értékeket, akkor a Thymeleaf sablont
        // közvetlenül a böngészőben megnyítva is érvényes HTML5 oldalt kapunk.
        // Natural templates.
        // >        &gt;
        // <        &lt;
        BlogEntry blogEntry = new BlogEntry(
                "Title1", "Content1", "Python",
                6, true, LocalDate.now()
        );
        model.addAttribute("entry", blogEntry);

        return "task3";
    }

}
