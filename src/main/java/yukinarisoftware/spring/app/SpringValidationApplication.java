package yukinarisoftware.spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import yukinarisoftware.spring.app.properties.DatabaseProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		DatabaseProperties.class
})
public class SpringValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringValidationApplication.class, args);
	}

}
