package mmsp.dome.action;

import mmsp.dome.entity.Cat;
import mmsp.dome.repository.CatDao;
import mmsp.dome.service.CatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by mohaiqiu on 2017/8/15.
 */
@RestController
public class CatAction {

    @Resource
    CatService catService;

    @Resource
    CatDao catDao;

    @RequestMapping(value = "c1")
    @ResponseBody
    public Object c1(){
        Cat cat = new Cat();
        cat.setName("sdfds");
        catService.save(cat);
        return cat;
    }

    @RequestMapping(value = "c2")
    @ResponseBody
    public Object c2(String name){
        return catService.findObj(name);
    }

    @RequestMapping(value = "c3")
    @ResponseBody
    public Object c3(String name){
        return catService.findObj(name);
    }
}
