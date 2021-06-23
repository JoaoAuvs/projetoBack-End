package com.appsala.app.repository;

import java.util.List;
import java.util.Optional;
import com.appsala.app.entities.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	public Optional<Usuario> findById(Integer id);
	
	public boolean existsById(Integer id);
	
	public List<Usuario> findAll();
	
	public <S extends Usuario> S save(S entity);
	
	public void deleteById(Integer id);

}