package opensourceProject.miniproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/benford")
public class BenfordController {

    @GetMapping("/fibonacci")
    public String fibo() {
        return "benford/fibonacci";
    }

    @GetMapping("/powerTwo")
    public String power() {
        return "benford/power_two";
    }

    @GetMapping("/koreaStock")
    public String stock(){
        return "benford/korea_stock";
    }

    @GetMapping("/americaStock")
    public String america(){
        return "benford/america_stock";
    }

    @GetMapping("/koreanPerson")
    public String person(){
        return "benford/person";
    }

    @GetMapping("/worldGdp")
    public String gdp(){
        return "benford/world_gdp";
    }

}
