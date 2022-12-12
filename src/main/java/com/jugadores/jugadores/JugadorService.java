package com.jugadores.jugadores;

import java.util.List;

public interface JugadorService {
	List<Jugador>listar();
	Jugador listarId(Integer id);
	Jugador add(Jugador j);
	Jugador editar(Jugador j);
	void delete(Integer id);
}
