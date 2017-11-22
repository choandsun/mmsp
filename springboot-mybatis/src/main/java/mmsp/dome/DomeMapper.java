package mmsp.dome;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by mohaiqiu on 2017/8/16.
 */
public interface DomeMapper {


    @Select("select * from dome where name = #{name}")
    public List<DomeEntity> likeName(String name);

    @Select("select name from dome where id = #{id}")
    public String getNameById(String id);

    @Select("select * from dome where id = #{id}")
    public DomeEntity getById(String id);

    @Insert("insert into dome(name)values(#{name})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    //@Options 开启主键自增，数据库列名，返回列名
    public void save(DomeEntity domeEntity);
}
