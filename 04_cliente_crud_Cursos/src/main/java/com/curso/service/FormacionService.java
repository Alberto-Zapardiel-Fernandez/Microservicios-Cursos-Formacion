package com.curso.service;

import java.util.List;

import com.curso.model.Formacion;

public interface FormacionService {

	public List<Formacion> verCursos();
	public void altaCurso(Formacion formacion);
}
