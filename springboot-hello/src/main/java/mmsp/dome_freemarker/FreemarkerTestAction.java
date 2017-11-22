package mmsp.dome_freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mohaiqiu on 2017/8/16.
 */
@Controller
public class FreemarkerTestAction {


    @RequestMapping(value = "h1")
    public String h1(){
        System.out.println("h1----");
        return "/h1";
    }
}
