package es.diverplan.trex;

import java.time.LocalDateTime;

public class Valoracion {

	// CAMPOS O ATRIBUTOS
	private String titulo;
	private String comentario;
	private int puntuacion;
	private LocalDateTime fechaPublicacion;

	// GETTERS
	public String getTitulo() {
		return titulo;
	}

	public String getComentario() {
		return comentario;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public LocalDateTime getFechaPublicacion() {
		return fechaPublicacion;
	}

	// SETTERS
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	// CONSTRUCTORES
	public Valoracion() {
		this.fechaPublicacion = LocalDateTime.now();
	}
	
	public Valoracion(String comentario, int puntuacion) {
		this.comentario = comentario;
		this.puntuacion = puntuacion;
		this.fechaPublicacion = LocalDateTime.now();
	}

}
