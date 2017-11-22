package mmsp.dome;

import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by mohaiqiu on 2017/8/16.
 */
@RestController
public class DomeAction {

    @Resource
    DomeService domeService;


    @RequestMapping("/likename")
    public Object likename(String name){
        PageHelper.startPage(1, 2);
        return domeService.likeName(name);
    }

    @RequestMapping("/save")
    public Object save(String name){
        DomeEntity domeEntity = new DomeEntity();
        domeEntity.setName(name);
        domeService.save(domeEntity);
        return domeEntity;
    }
}
