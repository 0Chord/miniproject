package opensourceProject.miniproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/benford")
public class BenfordController {

    @GetMapping("fibonacci")
    public String fibo() {
        return "benford/fibonacci";
    }

    @GetMapping("power_two")
    public String power() {
        return "benford/power_two";
    }
}
