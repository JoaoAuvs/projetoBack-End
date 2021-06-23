package com.appsala.app.controllers;

import java.util.List;
import com.appsala.app.entities.Unidade;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.appsala.app.services.UnidadeService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/unidade")
public class UnidadeController {

	@Autowired
	private UnidadeService unidadeService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer id) {
		Unidade unidade= unidadeService.findById(id);
		return new ResponseEntity<>(unidade, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Unidade>> findAll() {
		List<Unidade> unidadeList = unidadeService.findAll();
		return new ResponseEntity<>(unidadeList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody Unidade unidade) {
		unidade = unidadeService.update(unidade);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> create(@RequestBody Unidade unidade) {
		unidade = unidadeService.create(unidade);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
		unidadeService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}