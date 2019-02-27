package ru.artem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class WelcomeController {
    String param = "";
    String name_param = "";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", "Java!");
        return "welcome";
    }


    @RequestMapping("/about")
    public String about(Map<String, Object> model) {
        model.put("test_param", param);
        return "about";
    }

    @RequestMapping("/login")
    public String login(Map<String, Object> model) {
        model.put("usr_name", name_param);
        return "login";
    }

    @RequestMapping("/info")
    public String info(Map<String, Object> model) {
//        model.put("test_param", param);
        return "info";
    }

    @RequestMapping(value = "/printme/{data}", method = RequestMethod.GET)
    public String printme(Map<String, Object> model, @PathVariable("data") String data) {
        model.put("data", data);
        return "printme";
    }

    @RequestMapping(value = "/about/test_param", method = RequestMethod.POST)
    @ResponseBody
    public void addNewCustomer(@RequestParam("name_param") String nameParam) {
        param = nameParam;
        System.out.println(nameParam);
    }

    @RequestMapping(value = "/login/usr_name", method = RequestMethod.POST)
    @ResponseBody
    public void enterUserData(@RequestParam("user_login") String nameParam, @RequestParam("user_pass") String passParam) {
        name_param = nameParam;
        System.out.println(nameParam + " " + passParam);
    }

    @RequestMapping(value = "/printme")
    public void printmePut(Map<String, Object> model, String data) {
        model.put("test_param", data);
    }

}
