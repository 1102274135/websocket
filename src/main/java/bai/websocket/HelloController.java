package bai.websocket;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <功能介绍>
 * <>
 *
 * @version v1
 * @Author laobai
 * @data 2019年8月1日
 */

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String index(Model model) {
        return "hello";
    }

    @RequestMapping("/sock")
    public String getSocket(Model model) {
        return "socket";
    }


}
