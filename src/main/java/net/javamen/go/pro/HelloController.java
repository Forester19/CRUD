package net.javamen.go.pro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Владислав on 12.05.2017.
 */
@Controller

public class HelloController {

    @RequestMapping("/") public
    @ResponseBody
    String hello() {
        return "hello from spring";
    }

}

