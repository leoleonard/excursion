package com.example.userbase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

@Controller
 class HomeController {

    private VisitCounter counter;

    public HomeController(VisitCounter counter) {
        this.counter = counter;
    }

    @GetMapping("/")
    public String home(Model model, HttpServletResponse response) {
        Cookie cookie = new Cookie("last visit", LocalDateTime.now().toString());
        cookie.setMaxAge(60*60*24);
        response.addCookie(cookie);
        int visits = counter.incrementAndGet();
        model.addAttribute("visits", visits);
        return "home";
    }
}
