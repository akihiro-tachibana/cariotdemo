package cariot.jp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/travelMap")
    public String travelMap() {
        return "travelMap";
    }
}
