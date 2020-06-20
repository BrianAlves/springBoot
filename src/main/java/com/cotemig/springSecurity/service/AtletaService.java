package com.cotemig.springSecurity.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.springSecurity.model.Atleta;

public interface AtletaService {
	Optional<Atleta> getAtletaById(Integer id);
	List<Atleta> getAllAtletas();
	List<Atleta> getAllAtletasByTime(Integer idTime);
	List<Atleta> getAllAtletasByAge(Integer age);
	void insertAtleta(Atleta atleta);
}
