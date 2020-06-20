package com.cotemig.springSecurity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.springSecurity.model.Time;
import com.cotemig.springSecurity.repository.TimeRepository;

@Service("timeService")
public class TimeServiceImpl implements TimeService {

	@Autowired
	TimeRepository timeRepository;
	
	@Override
	public Optional<Time> getTimeById(Integer id) {
		return timeRepository.findById(id);
	}

	@Override
	public List<Time> getAllTimes() {
		return timeRepository.findAll();
	}

	@Override
	public void insertTime(Time time) {
		timeRepository.save(time);
	} 
}