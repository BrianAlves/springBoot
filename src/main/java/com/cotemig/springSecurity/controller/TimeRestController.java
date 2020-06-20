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
import com.cotemig.springSecurity.service.TimeService;

@RestController
public class TimeRestController {
	
	@Autowired
	private AtletaService atletaService;
	
	@Autowired
	private TimeService timeService;
	
	@RequestMapping(value = "time/rest/getAllAtletas/{idTime}", method = RequestMethod.GET)
	public List<Atleta> getAllAtletasByTime(@PathVariable("idTime") Integer idTime) {
		return atletaService.getAllAtletasByTime(idTime);
	}
	
	@RequestMapping(value = "time/rest/get/{id}", method = RequestMethod.GET)
	public Optional<Time> getTime(@PathVariable("id") Integer id) {
		return timeService.getTimeById(id);
	}
	
	@RequestMapping(value = "time/rest/getAll", method = RequestMethod.GET)
	public List<Time> getTimes() {
		return timeService.getAllTimes();
	}
	
	@RequestMapping(value = "time/rest/insert", method = RequestMethod.POST)
	public void insertTime(@RequestBody Time time) {
		timeService.insertTime(time);
	}
}
