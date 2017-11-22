package mmsp.dome.service;

import mmsp.dome.entity.Cat;
import mmsp.dome.repository.Cat2Repository;
import mmsp.dome.repository.CatRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by mohaiqiu on 2017/8/15.
 */
@Service
public class CatService{

    @Resource
    CatRepository catRepository;

    @Resource
    Cat2Repository cat2Repository;

    public void save(Cat cat){
        catRepository.save(cat);
    }

    public Cat findObj(String name){
        return catRepository.findCatByName(name);
    }

}
