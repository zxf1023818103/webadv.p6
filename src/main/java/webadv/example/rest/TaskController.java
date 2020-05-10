package webadv.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    final String CONTENT = "jQuery 天下第一";

    @GetMapping("/task/{id}")
    Task task(@PathVariable("id") String title) {
        return new Task(title, CONTENT);
    }
}
