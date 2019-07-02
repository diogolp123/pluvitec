package br.com.pluvitec.configuration;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class DependencyFactory implements Serializable {
	
	private static final long serialVersionUID = 7315118732333359124L;
	
	@Value("${DATA.SOURCE.URL}")
	private String dataSourceUrl;
	
	@Value("${DATA.SOURCE.USERNAME}")
	private String dataSourceUsername;
	
	@Value("${DATA.SOURCE.PASSWORD}")
	private String dataSourcePassword;

}
