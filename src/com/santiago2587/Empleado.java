package com.santiago2587;

public abstract class Empleado {
	
	private String nombre;
	private String apellido;
	private double salarioHora;
	private double horasTrabajadas;
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public double getSalarioHora() {
		return salarioHora;
	}
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public  double calcularSalario() {
		double resultado = 0;
		if(0 != getHorasTrabajadas() && 0 != getSalarioHora()) {
			resultado = getHorasTrabajadas()*getSalarioHora();
		}
		return resultado;
	}

}
