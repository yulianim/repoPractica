package com.milysoft.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.milysoft.model.Persona;
import com.milysoft.model.Producto;
import com.milysoft.service.IProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	@Autowired
	private IProductoService service;
	
	@GetMapping(value="/listar", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity <List<Producto>> listar() {
		List<Producto> productos=new ArrayList<>();
		try {
		productos=service.listar();
		}
		catch(Exception e) {
		return new ResponseEntity<List<Producto>>(productos, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<Producto>>(productos, HttpStatus.OK);
	}
	
	@PostMapping(value="/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> registrar(@Valid @RequestBody Producto producto) {
		Producto p = new Producto();
		p = service.registrar(producto);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(p.getIdProducto()).toUri();

		return ResponseEntity.created(location).build();
	}

}
