package com.appsala.app.repository;

import java.util.List;
import java.util.Optional;
import com.appsala.app.entities.Unidade;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UnidadeRepository extends JpaRepository<Unidade, Integer> {

    public Optional<Unidade> findById(Integer id);

    public boolean existsById(Integer id);

    public List<Unidade> findAll();

    public <S extends Unidade> S save(S entity);

    public void deleteById(Integer id);
}