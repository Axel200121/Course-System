package com.system.ams.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

//TODO: Relacion: Muchos roles van a poder pertenecer a un usuario 
@Entity
public class UsuarioRol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUserRol;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Usuario user;
	
	@ManyToOne
	private Rol rol;

	public Long getIdUserRol() {
		return idUserRol;
	}

	public void setIdUserRol(Long idUserRol) {
		this.idUserRol = idUserRol;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	public UsuarioRol() {
		
	}

}
