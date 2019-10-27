package top.fotg;




import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("top.fotg.dao")
@EnableScheduling
@EnableCaching//开启注解
public class ShoppingMallApplication {

	public static void main(String[] args) {

		SpringApplication.run(ShoppingMallApplication.class, args);
	}

}
