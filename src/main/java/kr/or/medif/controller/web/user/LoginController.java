package kr.or.medif.controller.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(Model model) {
        String redirect = "/";
        return "redirect:" + redirect;
    }
}
