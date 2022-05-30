package es.diverplan.trex;

import java.util.ArrayList;
import java.util.List;

public abstract class Entretenimiento {

	// CAMPOS O ATRIBUTOS
	private String titulo;
	private String descripcion;
	private List<Valoracion> valoraciones;

	// GETTERS
	public String getTitulo() {
		return titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public List<Valoracion> getValoraciones() {
		return valoraciones;
	}

	// SETTERS
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// CONSTRUCTORES
	public Entretenimiento() {
		this.valoraciones = new ArrayList<Valoracion>();
	}

	public Entretenimiento(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
	}

	// METODOS
	public boolean addValoracion(Valoracion valoracion) {
		return getValoraciones().add(valoracion);
	}
	
	public int valoracionAverage() {
		int acumulador = 0;
		int average = acumulador / getValoraciones().size();
		
		for (Valoracion valoracion : getValoraciones()) {
			acumulador += valoracion.getPuntuacion();
		}
		
		return average;
	}

}
