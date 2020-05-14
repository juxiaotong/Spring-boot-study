package com.jxt.controller;


import com.jxt.pojo.User;
import com.jxt.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpSession;



@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model,
                        HttpSession session){
        User user = userService.getUserByName(username);
        if (user != null){
            if (password.equals(user.getPassWord())){
                session.setAttribute("loginUser",username);
                return "redirect:/main.html";
            }else {
                model.addAttribute("msg","密码错误");
                return "index";
            }
        }else {
            model.addAttribute("msg","密码为空");
            return "index";
        }




    }

}
