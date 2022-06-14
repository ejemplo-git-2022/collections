package edu.curso.java;

import java.util.Objects;

public class Persona {

	private Long id;
	private String nombre;
	
	public Persona() {
		
	}
	
	@Override
	public int hashCode() {
		System.out.println("Ejecutando el hashCode para persona: " + id);
		return Objects.hash(id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Ejecutando el hashCode para persona: " + id);

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre);
	}

	public Persona(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
