package hello.hellospring.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") // 웹 어플리케이션에서 Hello로 들어오면 이 메소드를 호출!
    public String hello(Model model) {
        model.addAttribute("data", "spring!!");
        return "hello";
    }
}
