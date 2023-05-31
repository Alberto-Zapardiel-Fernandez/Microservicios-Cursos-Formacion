package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Formacion;
import com.curso.service.FormacionService;

@RestController
public class FormacionController {

	@Autowired
	FormacionService service;
	
	@GetMapping(value = "cursos")
	public List<Formacion> verCursos(){
		return service.verCursos();
	}
	
	@PostMapping(value = "cursos/{nombre}/{asignaturas}/{precio}")
	public void altaCurso(
			@PathVariable("nombre")String nombre,
			@PathVariable("asignaturas")int asignaturas,
			@PathVariable("precio")Double precio
			) {
		Formacion formacion = new Formacion(nombre, asignaturas, precio);
		System.out.println("CONTROLLER "+formacion.toString());
		service.altaCurso(formacion);
	}
}
