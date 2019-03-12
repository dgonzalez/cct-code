package ie.cct.controllers;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/test")
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @GetMapping("json")
    public Test test() {
        return new Test(3, "test");
    }

    @GetMapping("/clock")
    public String clock() {
        return Calendar.getInstance().getTime().toString();
    }

    @PostMapping("/form")
    public void formSubmit(@RequestBody Test test) {
        System.out.println(test.getTest());
    }

    @GetMapping("/a/b")
    public Test name() {
        return new Test(2, "I am the text of the object");
    }
}
