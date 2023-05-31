package com.curso.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.model.Formacion;

@Service
public class FormacionServiceImmpl implements FormacionService {

	@Autowired
	RestTemplate template;

	private String url = "http://localhost:8080/";

	@Override
	public List<Formacion> verCursos() {
		List<Formacion> formaciones = Arrays.asList(template.getForObject(url + "cursos", Formacion[].class));
		for (Formacion formacion : formaciones) {

			formacion.setAsignaturas((formacion.getDuracion() >= 50) ? 10 : 5);

		}
		return formaciones;
	}

	@Override
	public void altaCurso(Formacion formacion) {
		boolean existe = false;
		List<Formacion> formaciones = Arrays.asList(template.getForObject(url + "cursos", Formacion[].class));
		for (Formacion f : formaciones) {
			if (f.getNombre().equals(formacion.getNombre())) {
				existe=true;
				System.out.println("NADA QUE HACER");
			}
		}
		if (!existe) {
			formacion.setAsignaturas((formacion.getDuracion() >= 50) ? 10 : 5);
			formacion.setDuracion(formacion.getAsignaturas()*10);
			template.postForLocation(url + "curso", formacion);
		}

	}

}
