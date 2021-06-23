package com.appsala.app.services;

import java.util.List;
import java.util.Optional;
import com.appsala.app.entities.Embarcado;
import org.springframework.stereotype.Service;
import com.appsala.app.repository.EmbarcadoRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class EmbarcadoService {

	@Autowired
	private EmbarcadoRepository embarcadoRepository;

	public EmbarcadoService() { }
	
	public <S extends Embarcado> S create(S entity) {
		return embarcadoRepository.save(entity);
	}

	public <S extends Embarcado> S update(S entity) {
		return embarcadoRepository.save(entity);
	}
	
	public void deleteById(Integer id) {
		embarcadoRepository.deleteById(id);
	}
	
	public Embarcado findById(Integer id) {
		Optional<Embarcado> embarcadoOpt = embarcadoRepository.findById(id);
		return embarcadoOpt.orElse(null);
	}
	
	public List<Embarcado> findAll() {
		return embarcadoRepository.findAll();
	}
}