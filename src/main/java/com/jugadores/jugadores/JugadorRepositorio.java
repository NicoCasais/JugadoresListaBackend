package com.jugadores.jugadores;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface JugadorRepositorio extends Repository<Jugador,Integer> {
	List<Jugador>findAll();
	Jugador findById(Integer id);
	Jugador save(Jugador j);
	void deleteById(Integer id);
}
