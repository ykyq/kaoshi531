package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class ToController {
    @RequestMapping("/elecList")
    public String elecList() {
        return "elecList";
    }

    @RequestMapping("/elecInsert")
    public String elecInsert(String elecId, Model model) {
        if (elecId != null) {
            model.addAttribute("elecId", elecId);
        }
        return "elecInsert";
    }
}
