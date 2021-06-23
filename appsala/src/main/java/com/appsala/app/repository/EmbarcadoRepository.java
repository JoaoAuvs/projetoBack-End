package com.appsala.app.repository;

import java.util.List;
import java.util.Optional;
import com.appsala.app.entities.Embarcado;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmbarcadoRepository extends JpaRepository<Embarcado, Integer> {

	public	Optional<Embarcado> findById(Integer id);

	public	boolean existsById(Integer id);

	public	List<Embarcado> findAll();

	public	<S extends Embarcado> S save(S entity);

	public	void deleteById(Integer id);

}