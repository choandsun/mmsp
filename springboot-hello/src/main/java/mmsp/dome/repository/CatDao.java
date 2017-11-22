package mmsp.dome.repository;

import mmsp.dome.entity.Cat;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by mohaiqiu on 2017/8/15.
 */
@Repository
public class CatDao {

    @Resource
    JdbcTemplate jdbcTemplate;

    public Cat selectByName(String name){
        String sql = "select * from cat where name='"+name+"'";
        RowMapper<Cat> catRowMapper = new BeanPropertyRowMapper<>(Cat.class);
        Cat cat = jdbcTemplate.queryForObject(sql,catRowMapper);
//        List<Cat> catList = jdbcTemplate.query(sql,catRowMapper);
        return cat;
    }

}
