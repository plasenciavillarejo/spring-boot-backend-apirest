package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.models.services.IClienteService;

/* 1.- Vampos a implementar crossOrigin para conectar el fron-end "Angular" con el back-end de spring-boot 
 * 2.- Esto nos permite que este dominio pueda acceder a nuestro @RestController para que pueda enviar y recibir datos.
 * 3.- Podemos indicar los métodos permitidos: methods = RequestMethod.DELETE, POST, GET. Por defecto coge todos */
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente>index() {
		return clienteService.findAll();
		
	}
	
	
}
