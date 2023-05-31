package com.curso.model;

public class Formacion {
	private String nombre;
	private int duracion;
	private int asignaturas;
	private double precio;

	public Formacion(String nombre, int duracion, double precio) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.precio = precio;
	}

	public Formacion() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public int getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(int asignaturas) {
		this.asignaturas = asignaturas;
	}

	@Override
	public String toString() {
		return "Formacion [nombre=" + nombre + ", duracion=" + duracion + ", asignaturas=" + asignaturas + ", precio="
				+ precio + "]";
	}

	

}
