package es.diverplan.trex;

import java.time.LocalDateTime;

public class Valoracion {

	// CAMPOS O ATRIBUTOS
	private String comentario;
	private int puntuacion;
	private LocalDateTime fechaPublicacion;

	// GETTERS
	public String getComentario() {
		return comentario;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public LocalDateTime getFechaPublicacion() {
		return fechaPublicacion;
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
