package edu.curso.java;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		//ArrayList<Persona> personasList = new ArrayList<Persona>();
		List<Persona> personasList = new ArrayList<Persona>(); //new LinkedList<Persona>(); 
		
		personasList.add(new Persona(1L, "Juan"));
		personasList.add(new Persona(1L, "Juan"));
		personasList.add(new Persona(2L, "Maria"));
		
		for (Persona p : personasList) {
			System.out.println(p.getId() + " - " + p.getNombre());
		}
		
		System.out.println("******************************************");
		
		//HashSet<Persona> personasSet = new HashSet<Persona>();
		Set<Persona> personasSet = new HashSet<Persona>();

		Persona persona2 = new Persona(2L, "Maria");
		personasSet.add(new Persona(1L, "Juan"));
		personasSet.add(new Persona(1L, "Juan"));
		personasSet.add(persona2);
		
		for (Persona p : personasSet) {
			System.out.println(p.getId() + " - " + p.getNombre());
		}
		
		
		System.out.println(personasSet.contains(persona2));
				
		System.out.println("******************************************");

		//HashMap<Long, Persona> personasMap = new HashMap<Long, Persona>();
		Map<Long, Persona> personasMap = new HashMap<Long, Persona>();

		personasMap.put(1L, new Persona(1L, "Juan"));
		personasMap.put(2L, new Persona(2L, "Maria"));
		
		Persona personaRecuperada = personasMap.get(2L);
		
		System.out.println(personaRecuperada.getNombre());
		
	}

}
