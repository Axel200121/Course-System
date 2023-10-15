package com.system.ams.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.ams.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);

}
