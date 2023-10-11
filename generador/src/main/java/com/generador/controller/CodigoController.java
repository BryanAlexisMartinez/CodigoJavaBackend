package com.generador.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generador.model.Codigo;
import com.generador.service.CodigoService;

@RestController
@RequestMapping("/api/codigo/")
public class CodigoController {
	
	private final CodigoService varCodigoService;

	public CodigoController(CodigoService varCodigoService) {
		super();
		this.varCodigoService = varCodigoService;
	}
	
	
	// GET PREGUNTAS ENSAYO
		@GetMapping
		public List<Codigo> getAllCodigos() {
			return varCodigoService.getAllCodigos();
		}

		// GET PREGUNTA ENSAYO POR SU ID
		@GetMapping(path = "{codigoId}")
		public Codigo getCodigos(@PathVariable("codigoId") Long id) {
			return varCodigoService.getCodigo(id);
		}

		// GET PREGUNTA ENSAYO POR SU ID
		@DeleteMapping(path = "{codigoId}")
		public Codigo deleteCodigos(@PathVariable("codigoId") Long id) {
			return varCodigoService.deleteCodigo(id);
		}
		
		@PostMapping
		public Codigo addCodigos(@RequestBody Codigo codigo) {
		return varCodigoService.addCodigo(codigo);	
		}
	
	

}
