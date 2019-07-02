package br.com.pluvitec.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.pluvitec.dao.ColetaDao;
import br.com.pluvitec.dto.ColetaDto;
import br.com.pluvitec.model.Coleta;

@RestController
@RequestMapping("/api")
public class PluvitecApiController {
	
	@Autowired
	private ColetaDao coletaDao;

	@GetMapping("/coletas")
	public @ResponseBody List<ColetaDto> findAll() {
		return this.coletaDao.findAllColetas();
	}
	
	@GetMapping("/coletas/{macAddress}")
	public List<ColetaDto> findByMacAddress(@Valid @PathVariable String macAddress) {
		return this.coletaDao.findByMacAddress(macAddress);
	}
	
	@PostMapping("/coletas")
	public ResponseEntity<Void>  save(@Valid @RequestBody Coleta coleta) {
		this.coletaDao.save(coleta);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
