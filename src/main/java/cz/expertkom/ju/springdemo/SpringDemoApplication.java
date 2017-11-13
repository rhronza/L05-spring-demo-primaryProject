package cz.expertkom.ju.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
	"cz.expertkom.ju.springdemo","cz.expertkom.ju.springdemo.entity",
	"cz.expertkom.ju.springdemo.interfaces",/*"cz.expertkom.ju.springdemo.repository",*/
	"cz.expertkom.ju.springdemo.service", 
	/*"com.example.springdemorhr",*/ 
	"com.example.springdemorhr.repository"
})

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);

	}
}
