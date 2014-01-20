package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: yang
 * Date: 14-1-20 11:31
 */
@Controller
public class ShowController {
    @RequestMapping("/show")
    @ResponseBody
    public String show(){
        return "show page";
    }
}
