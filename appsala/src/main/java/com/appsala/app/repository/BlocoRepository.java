package com.appsala.app.repository;

import java.util.List;
import java.util.Optional;
import com.appsala.app.entities.Bloco;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BlocoRepository extends JpaRepository<Bloco, Integer>{
	Optional<Bloco> findById(Integer id);
	
	boolean existsById(Integer id);
	
	List<Bloco> findAll();
	
	<S extends Bloco> S save(S entity);
	
	void deleteById(Integer id);
}