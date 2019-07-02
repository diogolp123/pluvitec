package br.com.pluvitec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication(scanBasePackages="br.com.pluvitec")
public class PluvitecApplication extends WebMvcConfigurerAdapter implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(PluvitecApplication.class, args);
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedMethods("GET", "PUT", "POST", "DELETE");
	}
}
