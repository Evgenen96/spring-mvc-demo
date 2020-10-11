package ru.evgenen96.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showHomePage() {
        return "home-page";
    }

    @RequestMapping("/showForm")
    public String showForm() {
        return "show-form";
    }
    @RequestMapping("/processForm")
    public String processForm() {
        return "process-form";
    }

    //using model now
    @RequestMapping("/processFormV2")
    public String modelDemo(HttpServletRequest request, Model model) {
        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = "Yo!!!! " + theName;
        model.addAttribute("message", result);
        return "hellodude";
    }

    //using RequestParam now
    @RequestMapping("/processFormV3")
    public String requestParamDemo(@RequestParam("studentName") String theName, Model model) {
        theName = theName.toUpperCase();
        String result = "Yo!!!! " + theName;
        model.addAttribute("message", result);
        return "hellodude";
    }
}
