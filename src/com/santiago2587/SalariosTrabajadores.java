package com.santiago2587;

import java.util.ArrayList;

public class SalariosTrabajadores {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		SubGerente subGerente = new SubGerente();
		AyudanteGeneral ayudanteGeneral = new AyudanteGeneral();
		
		gerente.setNombre("Pepito");
		gerente.setApellido("Perez");
		gerente.setHorasTrabajadas(140);
		gerente.setSalarioHora(50);
		
		subGerente.setNombre("Juanito");
		subGerente.setApellido("Gomez");
		subGerente.setHorasTrabajadas(160);
		subGerente.setSalarioHora(30);
		
		ayudanteGeneral.setNombre("Juan");
		ayudanteGeneral.setApellido("Gonzalez");
		ayudanteGeneral.setHorasTrabajadas(180);
		ayudanteGeneral.setSalarioHora(10);
		
		Empleado[] empleados = new Empleado[3];
		empleados[0] = gerente;
		empleados[1] = subGerente;
		empleados[2] = ayudanteGeneral;
		
		ArrayList<Double> salarios = new ArrayList<>();
		for(int i = 0; i < empleados.length; i++) {
			salarios.add(empleados[i].calcularSalario());
		}
		
		for(int j = 0; j < salarios.size(); j++) {
			System.out.println(salarios.get(j));
		}
	}

}
