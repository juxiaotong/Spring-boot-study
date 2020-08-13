package com.jxt.controller;


import com.jxt.pojo.User;
import com.jxt.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


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
                model.addAttribute("msg","ok");
                return "redirect:/main.html";
            }else {
                model.addAttribute("msg","密码错误");
                return "index";
            }
        }else {

            model.addAttribute("msg","用户名不存在");
            return "index";
        }
    }

    @RequestMapping("/ajax")
    @ResponseBody
    public String ajax(@RequestParam("username") String username){
        User user = userService.getUserByName(username);
        String msg = "";
        if (username == null || "".equals(username)){
            msg = "用户名不能为空";
        } else {
            if (user != null){
                msg = "ok";
            }else{
                msg = "用户名不存在";
            }
        }


        return msg;
    }


}
