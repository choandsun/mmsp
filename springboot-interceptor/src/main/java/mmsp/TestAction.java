package mmsp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mohaiqiu on 2017/8/17.
 */
@RestController
public class TestAction {


    @RequestMapping("/i1")
    public Object i1(){
        return "ok";
    }
}
