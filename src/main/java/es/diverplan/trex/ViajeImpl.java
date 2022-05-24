package es.diverplan.trex;

import java.time.LocalDate;

import es.diverplan.trex.interfaces.Viaje;

public class ViajeImpl extends Entretenimiento implements Viaje {

	// CAMPOS O ATRIBUTOS
	private LocalDate fechaSalida;
	private int duracionViaje;
	private float precio;

	// GETTERS
	@Override
	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	@Override
	public int getDuracionViaje() {
		return duracionViaje;
	}

	@Override
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
	public ViajeImpl() {
		super();
	}

	public ViajeImpl(String titulo, String descripcion, LocalDate fechaSalida, int duracionViaje, float precio) {
		super(titulo, descripcion);
		this.fechaSalida = fechaSalida;
		this.duracionViaje = duracionViaje;
		this.precio = precio;
	}

}
