package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kata.spring.boot_security.demo.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
public class AdminController {

    private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/admin")
    public String printUsers(Model model, Principal principal) {
        model.addAttribute("info",userService.showUserByName(principal.getName()));
        return "admin";
    }

    @GetMapping(value = "/user")
    public String showUserPage(Model model, Principal principal) {
        model.addAttribute("info",userService.showUserByName(principal.getName()));
        return "user";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            request.getSession().invalidate();
        }
        return "redirect:/login";
    }
}
