package lift.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Create by fy on 2020/3/25
 */

@Controller
public class IndexController {
    @GetMapping("index")
    public String hello(){
        return "index";
    }
}
