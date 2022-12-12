package com.jugadores.jugadores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:8080",maxAge=3600)
@RestController
@RequestMapping({"/jugadores"})

public class Controlador {

	@Autowired
	private JugadorService service;
	
	@GetMapping({"/traerLista"})
	public List<Jugador>listar() {
		return service.listar();
	}
	
	@GetMapping({"/traerJugador/{id}"})
	public Jugador traerJugador(@PathVariable Integer id) {
		return service.listarId(id);
	}
	
	@PostMapping({"/borrarJugador/{id}"})
	public void borrarJugador(@PathVariable Integer id) {
		service.delete(id);
	}
	
	@PostMapping({"/altaJugador"})
	public Jugador altaJugador(@RequestBody Jugador j) {
		 return service.add(j);
	}
	
	//@PostMapping({"/modificarJugador"})
	//public Jugador modificarJugador(@RequestBody Jugador j) {
		//return repositorio.update(j);
	//}
}