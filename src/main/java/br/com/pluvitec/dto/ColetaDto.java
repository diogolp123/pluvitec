package br.com.pluvitec.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ColetaDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String macAddress;

	private double volume;

	private double temperatura;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
	private Date dataColeta;
	
	private boolean vibracaoDetectada;
}
