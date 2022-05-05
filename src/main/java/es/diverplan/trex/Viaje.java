package es.diverplan.trex;

import java.time.LocalDate;

public class Viaje extends Entretenimiento {

	// CAMPOS O ATRIBUTOS
	private LocalDate fechaSalida;
	private int duracionViaje;
	private float precio;

	// GETTERS	
	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public int getDuracionViaje() {
		return duracionViaje;
	}

	public float getPrecio() {
		return precio;
	}

	// SETTERS
	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public void setDuracionViaje(int duracionViaje) {
		this.duracionViaje = duracionViaje;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	// CONSTRUCTORES
	public Viaje() {
		super();
	}

	public Viaje(String titulo, String descripcion, LocalDate fechaSalida, int duracionViaje, float precio) {
		super(titulo, descripcion);
		this.fechaSalida = fechaSalida;
		this.duracionViaje = duracionViaje;
		this.precio = precio;
	}

	// METODOS
	@Override
	public boolean addValoracion(Valoracion valoracion) {
		return getValoraciones().add(valoracion);
	}

}
