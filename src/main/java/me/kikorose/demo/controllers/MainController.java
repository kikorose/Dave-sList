package me.kikorose.demo.controllers;


import com.sun.org.apache.xpath.internal.operations.String;
import me.kikorose.demo.models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController {

    @GetMapping("/room")
    public String room(Model model) {
        model.addAttribute("rentedRoom", new Room());
        return "room";
    }


    @PostMapping("/room")
    public String room(@Valid Room room, BindingResult result) {
        if (result.hasErrors()) {
            return "room";
        }

        return "room";
    }
}

