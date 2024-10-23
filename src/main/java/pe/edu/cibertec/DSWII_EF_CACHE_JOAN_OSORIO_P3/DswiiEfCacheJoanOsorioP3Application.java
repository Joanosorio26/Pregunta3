package pe.edu.cibertec.DSWII_EF_CACHE_JOAN_OSORIO_P3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DswiiEfCacheJoanOsorioP3Application {

	public static void main(String[] args) {
		SpringApplication.run(DswiiEfCacheJoanOsorioP3Application.class, args);
	}

}
