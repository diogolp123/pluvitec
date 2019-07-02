package br.com.pluvitec.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.pluvitec.dto.ColetaDto;
import br.com.pluvitec.mapper.ColetaMapper;
import br.com.pluvitec.model.Coleta;
import br.com.pluvitec.repository.ColetaRepository;

@Component
public class ColetaDao {
	
	@Autowired
	private ColetaRepository repository;
	
	@Autowired
	private ColetaMapper mapper;
	
	public List<ColetaDto> findByMacAddress(String macAddress) {
		return repository.findByMacAddress(macAddress);
	}
	
	public List<ColetaDto> findAllColetas() {
		return mapper.toListColetaDto(repository.findAll());
	}
	
	public void save(Coleta coleta) {
		 repository.save(coleta);
	}

}
