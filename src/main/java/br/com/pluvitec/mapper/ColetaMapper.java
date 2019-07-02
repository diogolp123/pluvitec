package br.com.pluvitec.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import br.com.pluvitec.dto.ColetaDto;
import br.com.pluvitec.model.Coleta;

@Mapper(componentModel="spring")
public interface ColetaMapper {

	ColetaDto toColetaDto (Coleta coleta);
	
	List<ColetaDto> toListColetaDto (List<Coleta> coleta);
}
