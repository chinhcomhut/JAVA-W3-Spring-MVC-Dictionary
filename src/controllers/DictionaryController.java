package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @GetMapping("/chinh")
    public String chinh() {
        return "index";
    }
    @PostMapping("/dictionary")
 public String translate(@RequestParam String english,ModelMap modelMap){

        modelMap.put("hello","xin chào");
        modelMap.put("goodbye","tạm biệt");
        modelMap.put("love and be love","Yêu và được yêu");
        modelMap.put("love is the sea of trouble","yêu là bể khổ");
      english = english.toLowerCase();
        String vietnamese = (String)modelMap.get(english);
        if(vietnamese==null){
            vietnamese = "not found";
            modelMap.addAttribute("english",english);
            modelMap.addAttribute("vietnamese",vietnamese);
        }else {
            modelMap.addAttribute("english",english);
            modelMap.addAttribute("vietnamese",vietnamese);
        }return "translate";
    }

}