package com.cotemig.springSecurity.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.springSecurity.model.Atleta;
import com.cotemig.springSecurity.model.Time;

public interface TimeService {
	Optional<Time> getTimeById(Integer id);
	List<Time> getAllTimes();
	void insertTime(Time time);
}
