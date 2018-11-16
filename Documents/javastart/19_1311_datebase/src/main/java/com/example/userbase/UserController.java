package com.example.userbase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/user")
    public String jan(Model model) {
//        model pozwala transeforwac dane miedzy kontrolerem a szablonem
//        umozliwa zapisywanie danych
//        List<User> userList = new ArrayList<>();
//       // User userJan = new User("Jan", "Kowalski");
//        userList.add(new User("Jan", "Kowalski"));
        User userJan = new User("Jan", "Kowalski");
        model.addAttribute("user", userJan);
        return "user";
    }

    @GetMapping("/list")
    public String userList(Model model) {
        model.addAttribute("userList", userRepository.getUsers());
        return "userList";
    }

    @GetMapping("/dodaj")
    public String showForm(Model model) {
        model.addAttribute("user", new User("Jan", "Kowalski"));
        return "userForm";
    }

    @PostMapping("saveUser")
    public String save(User user) {
        userRepository.add(user);
        return "redirect:list";
    }

    @PostMapping("/find")
    public String find(@RequestParam String lastName, Model model) {
        User userByLastname = userRepository.findByLastName(lastName);
        if (userByLastname != null) {
            model.addAttribute("user", userByLastname);
            return ("user");
        } else {
            return "notFound";
        }
    }
}
