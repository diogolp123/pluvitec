package br.com.pluvitec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pluvitec.dto.ColetaDto;
import br.com.pluvitec.model.Coleta;

@Repository
public interface ColetaRepository extends JpaRepository<Coleta, Integer> {
	
	List<ColetaDto> findByMacAddress(String macAddress);
}
