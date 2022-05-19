package es.diverplan.trex;

public class Actividad extends Entretenimiento {

	// CAMPOS O ATRIBUTOS
	private String ciudad;
	private Coordinador coordinador;

	// GETTERS	
	public String getCiudad() {
		return ciudad;
	}
	
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
	public Actividad() {
		super();
	}
	
	public Actividad(String titulo, String descripcion, String ciudad, Coordinador coordinador) {
		super(titulo, descripcion);
		this.ciudad = ciudad;
		this.coordinador = coordinador;
	}

}
