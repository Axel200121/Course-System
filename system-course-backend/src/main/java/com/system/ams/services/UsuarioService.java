package com.system.ams.services;

import java.util.Set;

import com.system.ams.entities.Usuario;
import com.system.ams.entities.UsuarioRol;

public interface UsuarioService {
	
	public Usuario saveUser(Usuario user, Set<UsuarioRol> userRol) throws Exception;

}
