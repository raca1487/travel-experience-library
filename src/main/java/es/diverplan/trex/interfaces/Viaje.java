package es.diverplan.trex.interfaces;

import java.time.LocalDate;

public interface Viaje {
	
	LocalDate getFechaSalida();
	
	int getDuracionViaje();
	
	float getPrecio();

}
