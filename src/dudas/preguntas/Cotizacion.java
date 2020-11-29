package dudas.preguntas;

public class Cotizacion {
	private String nombre;
	private String apellido;
	private double valorVehiculo;
	private double valorCaracteristicasAdicionales;
	

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public double getValorVehiculo() {
		return valorVehiculo;
	}

	public double getValorCaracteristicasAdicionales() {
		return valorCaracteristicasAdicionales;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setValorVehiculo(double valorVehiculo) {
		this.valorVehiculo = valorVehiculo;
	}

	public void setValorCaracteristicasAdicionales(double valorCaracteristicasAdicionales) {
		this.valorCaracteristicasAdicionales = valorCaracteristicasAdicionales;
	}

	@Override
	public String toString() {
		return "Cotizacion [nombre=" + nombre + ", apellido=" + apellido + ", valorVehiculo=" + valorVehiculo
				+ ", valorCaracteristicasAdicionales=" + valorCaracteristicasAdicionales + "]";
	}
	
	

}
