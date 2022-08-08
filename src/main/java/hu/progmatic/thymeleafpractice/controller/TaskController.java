package hu.progmatic.thymeleafpractice.controller;

import hu.progmatic.thymeleafpractice.model.BlogEntry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

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
        // FELTÉTELES

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

    @GetMapping("/task4")
    public String task4(Model model) {
        // KIFEJEZÉSEK

        // https://www.baeldung.com/dates-in-thymeleaf

        BlogEntry blogEntry = new BlogEntry(
                "Title1", "Content1", "Python",
                6, true, LocalDate.now()
        );
        model.addAttribute("entry", blogEntry);

        List<String> names = List.of("Pista", "Józsi");
        model.addAttribute("names", names);

        return "task4";
    }

    @GetMapping("/task5")
    public String task5() {
        return "task5";
    }

    // TASK6: Legyen több bejegyzés (pl. List.of)
    // Táblázatban jelenítsük meg valamennyi bejegyzés adatát.
    // A publikált bejegyzések legyenek félkövér betűvel (style="font-weight: bold;").
    // data-th-each / data-th-if + data-th-unless

    // TASK7: Legyen egy űrlapunk, ahol meg tudjuk adni egy bejegyzés adatait.
    // Hozzunk létre egy endpointot, ahova elküldjük az új bejegyzés adatát.
    // A második endpointnál hozzunk létre egy task7_tostring.html-t,
    // ahol egyszerűen megjelenítjük egy <span> elemen belül a létrehozott bejegyzést.
    // @GetMapping + @PostMapping

    // 2 endpoint + 2 view
    // 1. endpoint megjeleníti az űrlapot
    // 2. endpoint megjeleníti a toStringet

}
