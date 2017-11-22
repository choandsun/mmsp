package mmsp.dome;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by mohaiqiu on 2017/8/16.
 */
@Service
public class DomeService {

    @Resource
    DomeMapper domeMapper;

    public List<DomeEntity> likeName(String name){
        return domeMapper.likeName(name);
    }


    @Transactional
    public void save (DomeEntity domeEntity) {
        domeMapper.save(domeEntity);
    }
}
