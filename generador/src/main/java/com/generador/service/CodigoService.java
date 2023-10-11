package com.generador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generador.model.Codigo;
import com.generador.repository.CodigoRepository;

@Service
public class CodigoService {
	private final CodigoRepository varCodigoRepository;

	@Autowired
	public CodigoService(CodigoRepository varCodigoRepository) {
		super();
		this.varCodigoRepository = varCodigoRepository;
	}//constructor
	
	public List<Codigo> getAllCodigos(){
		return varCodigoRepository.findAll();
	}
	
	public Codigo getCodigo(Long id){
		return varCodigoRepository.findById(id).orElseThrow(
				() -> new IllegalArgumentException("El codigo con el id " + id + " no existe")
				);
	}      
	
	public Codigo deleteCodigo(Long id) {
		Codigo tmp = null;
		if (varCodigoRepository.existsById(id)) {
			tmp = varCodigoRepository.findById(id).get();
			varCodigoRepository.deleteById(id);
		}
		return tmp;
	}

	//ADD NEW QUESTION 
	public Codigo addCodigo(Codigo codigo) {
		return varCodigoRepository.save(codigo);
	}



}
