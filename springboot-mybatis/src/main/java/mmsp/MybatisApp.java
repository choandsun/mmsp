package mmsp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("mmsp.*")
public class MybatisApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(MybatisApp.class, args);
    }
}
