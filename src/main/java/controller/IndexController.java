package controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: yang
 * Date: 14-1-20 12:23
 */
@Controller
public class IndexController {

    private static final Logger logger = Logger.getLogger(IndexController.class.getName());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String showIndex() {
        logger.debug("...show index log4j...");
        return "Hello world";
    }

}
