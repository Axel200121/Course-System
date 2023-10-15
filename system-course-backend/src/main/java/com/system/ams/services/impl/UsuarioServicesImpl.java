package com.system.ams.services.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.ams.entities.Usuario;
import com.system.ams.entities.UsuarioRol;
import com.system.ams.repositories.RolRespository;
import com.system.ams.repositories.UsuarioRepository;
import com.system.ams.services.UsuarioService;

@Service
public class UsuarioServicesImpl implements UsuarioService {
	
	//este sirve para inyección de dependencia
	@Autowired
	private UsuarioRepository userRepository;
	
	@Autowired
	private RolRespository rolRespository;

	@Override
	public Usuario saveUser(Usuario user, Set<UsuarioRol> userRol) throws Exception {
		
		Usuario userLocal = userRepository.findByUsername(user.getUsername());
		if(userLocal != null) {
			System.out.println("El usuario ya existe");
			throw new Exception("El usuario ya esta presente");
		}else {
			
			for(UsuarioRol userItem: userRol) {
				rolRespository.save(userItem.getRol());
			}
			user.getUserRol().addAll(userRol);
			userLocal = userRepository.save(user);
		}
		return userLocal;
	}

	@Override
	public Usuario getUser(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public void deleteUser(Long idUser) {
		userRepository.deleteById(idUser);
	}
	

}
