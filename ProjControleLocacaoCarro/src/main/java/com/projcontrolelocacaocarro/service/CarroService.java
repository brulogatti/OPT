package com.projcontrolelocacaocarro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projcontrolelocacaocarro.model.Carro;
import com.projcontrolelocacaocarro.repository.CarroRepository;

@Service
public class CarroService {
	
	@Autowired
	private CarroRepository repository;

	public List<Carro> findAll() {
		return repository.findAll();
	}

	public Carro findOne(int id) {
		return repository.findOne(id);
	}

	public Carro save(Carro post) {
		return repository.saveAndFlush(post);
	}

	public void delete(int id) {
		repository.delete(id);
	}

}
