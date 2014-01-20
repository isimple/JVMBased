package controller

import groovy.util.logging.Log4j;
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

/**
 * User: yang
 * Date: 14-1-20 09:57
 */
@Controller
@RequestMapping("/g")
@Log4j
class HomeController {
    @RequestMapping("/")
    @ResponseBody
    String index(){
        log.debug("..index..")
        return "index"
    }
}
