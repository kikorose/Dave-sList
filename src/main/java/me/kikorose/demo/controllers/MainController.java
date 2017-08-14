package me.kikorose.demo.controllers;


import me.kikorose.demo.models.Room;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("rentedRoom", new Room());
        return "index";
    }
    @GetMapping("/student")
    public String loadStudents(Model model){
        model.addAttribute("students", new StudentsRepo());
        return "students";
    }


    @GetMapping("/description")
    public String description(Model model){
        model.addAttribute("description", new Description());
        return "description";
    }

}
