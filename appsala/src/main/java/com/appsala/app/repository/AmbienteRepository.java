package com.appsala.app.repository;

import java.util.List;
import java.util.Optional;
import com.appsala.app.entities.Ambiente;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AmbienteRepository extends JpaRepository<Ambiente, Integer> {

	public	Optional<Ambiente> findById(Integer id);

	public	boolean existsById(Integer id);

	public	List<Ambiente> findAll();

	public	<S extends Ambiente> S save(S entity);

	public	void deleteById(Integer id);

}