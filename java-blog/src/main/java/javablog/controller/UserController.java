package javablog.controller;

import javablog.repository.RoleRepository;
import javablog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserRepository userRepository;

    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("view", "user/register");
        return "base-layout";
    }

}
