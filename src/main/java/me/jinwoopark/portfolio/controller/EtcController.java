package me.jinwoopark.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EtcController {

    @GetMapping("/youtube")
    public String showYoutube() {
        return "youtube";
    }


    @GetMapping("/netflix")
    public String showNetflix() {
        return "netflix";
    }

    @GetMapping("/todo")
    public String showToDo() {
        return "todo";
    }

    @GetMapping("/githubfinder")
    public String showGithubFinder() {
        return "githubfinder";
    }

    @GetMapping("/spreadsheet")
    public String showSpreadSheet() {
        return "spreadsheet";
    }
}
