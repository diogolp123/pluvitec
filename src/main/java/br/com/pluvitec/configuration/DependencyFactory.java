package br.com.pluvitec.configuration;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class DependencyFactory implements Serializable {
	
	private static final long serialVersionUID = 7315118732333359124L;
	
	@Value("${DATABASE_URL}")
	private String dataBaseUrl;

}
