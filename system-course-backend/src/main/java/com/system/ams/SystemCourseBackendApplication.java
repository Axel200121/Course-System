package com.system.ams;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.system.ams.entities.Rol;
import com.system.ams.entities.Usuario;
import com.system.ams.entities.UsuarioRol;
import com.system.ams.services.UsuarioService;

@SpringBootApplication
public class SystemCourseBackendApplication {

	//@Autowired
	//private UsuarioService userService;
	
	public static void main(String[] args) {
		
		SpringApplication.run(SystemCourseBackendApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Usuario user = new Usuario();
		user.setName("Axel");
		user.setLastname("Martinez Sanjuan");
		user.setUsername("ams21");
		user.setPassword("12345");
		user.setEmail("axel@gmail.com");
		user.setPhone("123456789");
		user.setPerfil("mas.png");
		
		Rol rol = new Rol();
		rol.setIdRol(1L);
		rol.setName("ADMIN");
		
		
		Set<UsuarioRol> usuarioRols = new HashSet<>();
		UsuarioRol userRol = new UsuarioRol();
		userRol.setRol(rol);
		userRol.setUser(user);
		usuarioRols.add(userRol);
		
		Usuario userSave = userService.saveUser(user, usuarioRols);
		System.out.println(userSave.getUsername());
		
	}*/

}
