package com.appsala.app.services;

import java.util.List;
import java.util.Optional;
import com.appsala.app.entities.Ambiente;
import org.springframework.stereotype.Service;
import com.appsala.app.repository.AmbienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AmbienteService {

	@Autowired
	private AmbienteRepository ambienteRepository;

	public AmbienteService() { }
	
	public <S extends Ambiente> S create(S entity) {
		return ambienteRepository.save(entity);
	}

	public <S extends Ambiente> S update(S entity) {
		return ambienteRepository.save(entity);
	}
	
	public void deleteById(Integer id) {
		ambienteRepository.deleteById(id);
	}
	
	public Ambiente findById(Integer id) {
		Optional<Ambiente> ambienteOpt = ambienteRepository.findById(id);
		return ambienteOpt.orElse(null);
	}
	
	public List<Ambiente> findAll() {
		return ambienteRepository.findAll();
	}
}