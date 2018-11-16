package com.example.userbase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PetsController {

    private PetsRepository petsRepository;

    @Autowired
    public PetsController(PetsRepository petsRepository) {
        this.petsRepository = petsRepository;
    }

    @GetMapping("/petslist")
    public String persList(Model model) {
        model.addAttribute("pets", petsRepository.getPets());
        return "pets";
    }

}

