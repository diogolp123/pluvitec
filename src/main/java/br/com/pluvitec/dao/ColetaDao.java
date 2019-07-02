package br.com.pluvitec.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.pluvitec.dto.ColetaDto;
import br.com.pluvitec.mapper.ColetaMapper;
import br.com.pluvitec.repository.ColetaRepository;

@Component
public abstract class ColetaDao implements ColetaRepository {
	
	@Autowired
	private ColetaMapper mapper;
	
	public List<ColetaDto> findByMacAddress(String macAddress) {
		return this.findByMacAddress(macAddress);
	}
	
	public List<ColetaDto> findAllColetas() {
		return mapper.toListColetaDto(this.findAll());
	}

}
