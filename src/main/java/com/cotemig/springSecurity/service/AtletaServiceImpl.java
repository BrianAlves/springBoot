package com.cotemig.springSecurity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.springSecurity.model.Atleta;
import com.cotemig.springSecurity.repository.AtletaRepository;

@Service("atletaService")
public class AtletaServiceImpl implements AtletaService {
	
	@Autowired
	AtletaRepository atletaRepository;

	@Override
	public List<Atleta> getAllAtletasByTime(Integer idTime) {
		return atletaRepository.getAllAtletasByTime(idTime);
	}

	@Override
	public Optional<Atleta> getAtletaById(Integer id) {
		return atletaRepository.findById(id);
	}

	@Override
	public List<Atleta> getAllAtletas() {
		return atletaRepository.findAll();
	}

	@Override
	public List<Atleta> getAllAtletasByAge(Integer age) {
		return atletaRepository.getAllAtletasByAge(age);
	}

	@Override
	public void insertAtleta(Atleta atleta) {
		atletaRepository.save(atleta);
	} 
}
