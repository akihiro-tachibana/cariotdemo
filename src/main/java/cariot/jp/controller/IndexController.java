package cariot.jp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by akihiro.tachibana on 2016/09/09.
 */
@Controller
public class IndexController {

    @RequestMapping("")
    public String index() {
        return "index";
    }

    @RequestMapping("/map")
    public String map() {
        return "map";
    }
}
