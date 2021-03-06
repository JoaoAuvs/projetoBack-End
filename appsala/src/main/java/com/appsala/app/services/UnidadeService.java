package com.appsala.app.services;

import java.util.List;
import java.util.Optional;
import com.appsala.app.entities.Unidade;
import org.springframework.stereotype.Service;
import com.appsala.app.repository.UnidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UnidadeService {

	@Autowired
	private UnidadeRepository unidadeRepository;

	public UnidadeService() { }
	
	public <S extends Unidade> S create(S entity) {
		return unidadeRepository.save(entity);
	}

	public <S extends Unidade> S update(S entity) {
		return unidadeRepository.save(entity);
	}
	
	public void deleteById(Integer id) {
		unidadeRepository.deleteById(id);
	}
	
	public Unidade findById(Integer id) {
		Optional<Unidade> unidadeOpt = unidadeRepository.findById(id);
		return unidadeOpt.orElse(null);
	}
	
	public List<Unidade> findAll() {
		return unidadeRepository.findAll();
	}
}