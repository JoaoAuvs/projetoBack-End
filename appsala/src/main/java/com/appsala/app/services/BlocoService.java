package com.appsala.app.services;

import java.util.List;
import java.util.Optional;
import com.appsala.app.entities.Bloco;
import org.springframework.stereotype.Service;
import com.appsala.app.repository.BlocoRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BlocoService {

	@Autowired
	private BlocoRepository blocoRepository;

	public BlocoService() { }
	
	
	public <S extends Bloco> S create(S entity) {
		return blocoRepository.save(entity);
	}

	public <S extends Bloco> S update(S entity) {
		return blocoRepository.save(entity);
	}
	
	public void deleteById(Integer id) {
		blocoRepository.deleteById(id);
	}
	
	public Bloco findById(Integer id) {
		Optional<Bloco> blocoOpt = blocoRepository.findById(id);
		return blocoOpt.orElse(null);
	}
	
	public List<Bloco> findAll() {
		return blocoRepository.findAll();
	}
}