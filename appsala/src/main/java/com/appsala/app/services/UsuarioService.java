package com.appsala.app.services;

import java.util.List;
import java.util.Optional;
import com.appsala.app.entities.Usuario;
import org.springframework.stereotype.Service;
import com.appsala.app.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public UsuarioService() { }
	
	
	public <S extends Usuario> S create(S entity) {
		return usuarioRepository.save(entity);
	}

	public <S extends Usuario> S update(S entity) {
		return usuarioRepository.save(entity);
	}
	
	public void deleteById(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	public Usuario findById(Integer id) {
		Optional<Usuario> usuarioOpt = usuarioRepository.findById(id);
		return usuarioOpt.orElse(null);
	}
	
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
}