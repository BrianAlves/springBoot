package com.cotemig.springSecurity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cotemig.springSecurity.model.Atleta;

@Repository("atletaRepository")
public interface AtletaRepository extends JpaRepository<Atleta, Integer> {
	
	@Query(value = "SELECT * FROM ATLETA WHERE time_id = ?1", nativeQuery = true)
	List<Atleta> getAllAtletasByTime(Integer idTime);
	
	@Query(value = "SELECT * FROM ATLETA WHERE idade = ?1", nativeQuery = true)
	List<Atleta> getAllAtletasByAge(Integer age);
}
