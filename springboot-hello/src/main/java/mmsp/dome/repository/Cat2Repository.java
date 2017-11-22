package mmsp.dome.repository;

import mmsp.dome.entity.Cat;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mohaiqiu on 2017/8/15.
 */
@Repository
public interface Cat2Repository extends PagingAndSortingRepository<Cat,Integer> {


}
