package es.diverplan.trex;

import es.diverplan.trex.interfaces.Actividad;

public class ActividadImpl extends Entretenimiento implements Actividad {

	// CAMPOS O ATRIBUTOS
	private String ciudad;
	private Coordinador coordinador;

	// GETTERS	
	@Override
	public String getCiudad() {
		return ciudad;
	}
	
	@Override
	public Coordinador getCoordinador() {
		return coordinador;
	}

	// SETTERS
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public void setCoordinador(Coordinador coordinador) {
		this.coordinador = coordinador;
	}

	// CONSTRUCTORES
	public ActividadImpl() {
		super();
	}
	
	public ActividadImpl(String titulo, String descripcion, String ciudad, Coordinador coordinador) {
		super(titulo, descripcion);
		this.ciudad = ciudad;
		this.coordinador = coordinador;
	}

}
