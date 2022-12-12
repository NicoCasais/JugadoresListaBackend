package com.jugadores.jugadores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JugadorServiceImp implements JugadorService {
	
	@Autowired
	private JugadorRepositorio repositorio;

	@Override
	public List<Jugador> listar() {
		return repositorio.findAll();
	}

	@Override
	public Jugador listarId(Integer id) {
		return repositorio.findById(id);
	}

	@Override
	public Jugador add(Jugador j) {
		return repositorio.save(j);
	}

	@Override
	public Jugador editar(Jugador j) {
		return null;
	}

	@Override
	public void delete(Integer id) {
		repositorio.deleteById(id);
	}
}