package com.system.ams.controllers;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.ams.entities.Rol;
import com.system.ams.entities.Usuario;
import com.system.ams.entities.UsuarioRol;
import com.system.ams.services.UsuarioService;

@RestController
@RequestMapping("/users")
public class UsuarioController {
	//declaramos los metodos para las rutas
	
	@Autowired
	private  UsuarioService usuarioService;
	
	@PostMapping("/save")
	public Usuario saveUser(@RequestBody Usuario user) throws Exception {
		Set<UsuarioRol> roles = new HashSet<>();
		Rol rol = new Rol();
		rol.setIdRol(2L);
		rol.setName("NORMAL");
		
		UsuarioRol userRol = new UsuarioRol();
		userRol.setRol(rol);
		
		return usuarioService.saveUser(user, roles);
	}
	
	@GetMapping("/get/{username}")
	public Usuario getUser(@PathVariable("username") String username) {
		return usuarioService.getUser(username);
	}
	
	@DeleteMapping("/delete/{idUser}")
	public void deleteUser(@PathVariable("idUser") Long idUser) {
		usuarioService.deleteUser(idUser);
	}
	

}
