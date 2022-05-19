package es.diverplan.trex;

public class Coordinador {
	
	// CAMPOS O ATRIBUTOS
	private String nombre;
	private String apellidos;
	private String telefono;
	private String email;
	
	// GETTERS
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public String getEmail() {
		return email;
	}
	
	// SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// CONSTRUCTORES
	public Coordinador() {}
	
	public Coordinador(String nombre, String apellidos, String telefono, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
	}

}
