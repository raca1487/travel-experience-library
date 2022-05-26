package es.diverplan.trex;

import java.time.LocalDate;

public class Coordinador {
	
	// CAMPOS O ATRIBUTOS
	private String nombre;
	private String apellidos;
	private String telefono;
	private String email;
	private String residencia;
	private LocalDate fechaNac; 
	
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
	
	public String getResidencia() {
		return residencia;
	}
	
	public LocalDate getFechaNac() {
		return fechaNac;
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
	
	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}
	
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	// CONSTRUCTORES
	public Coordinador() {}
	
	public Coordinador(String nombre, String apellidos, String telefono, String email, String residencia, LocalDate fechaNac) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
		this.residencia = residencia;
		this.fechaNac = fechaNac;
	}

}
