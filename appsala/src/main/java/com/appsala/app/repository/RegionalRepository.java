package com.appsala.app.repository;

import java.util.List;
import java.util.Optional;
import com.appsala.app.entities.Regional;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RegionalRepository extends JpaRepository<Regional, Integer> {

	public	Optional<Regional> findById(Integer id);

	public	boolean existsById(Integer id);

	public	List<Regional> findAll();

	public	<S extends Regional> S save(S entity);

	public	void deleteById(Integer id);

}