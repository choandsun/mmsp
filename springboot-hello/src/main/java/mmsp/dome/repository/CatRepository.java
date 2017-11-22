package mmsp.dome.repository;

import mmsp.dome.entity.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by mohaiqiu on 2017/8/15.
 */
@Repository
public interface CatRepository extends CrudRepository<Cat,Integer>{

    @Query("select t from Cat t where t.name=:catname")
    public Cat findCatByName(@Param("catname") String name);

}
