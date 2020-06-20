package com.cotemig.springSecurity.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cotemig.springSecurity.model.Atleta;
import com.cotemig.springSecurity.model.Time;
import com.cotemig.springSecurity.service.AtletaService;

@RestController
public class AtletaRestController {

	@Autowired
	private AtletaService atletaService;
	
	@RequestMapping(value = "atleta/rest/get/{id}", method = RequestMethod.GET)
	public Optional<Atleta> getAtleta(@PathVariable("id") Integer id) {
		return atletaService.getAtletaById(id);
	}
	
	@RequestMapping(value = "atleta/rest/getByAge/{age}", method = RequestMethod.GET)
	public List<Atleta> getAllAtletasByAge(@PathVariable("age") Integer age) {
		return atletaService.getAllAtletasByAge(age);
	}
	
	@RequestMapping(value = "atleta/rest/getAll", method = RequestMethod.GET)
	public List<Atleta> getAtletas() {
		return atletaService.getAllAtletas();
	}
	
	@RequestMapping(value = "atleta/rest/insert", method = RequestMethod.POST)
	public void insertAtleta(@RequestBody Atleta atleta) {
		atletaService.insertAtleta(atleta);
	}
}
