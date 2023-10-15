package com.system.ams.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

//TODO: Un rol le puede pertenecer a muchos usuarios
@Entity
@Table(name = "roles")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRol;
	private String name;
	
	//cascade es cuando se elminica o se un cambio afecta a los tablas que tiene relacionados
	// fecth(busqueda) -> eager(ansioso)-> trae info de los registros relacionados / lazy(peresos) -> no trae info de los registros relacionados de las entidades relacionadas
	// mappedBy -> Apunta a la entidad propietaria de la realcion, en este caso es el rol
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rol")
	private Set<UsuarioRol> userRol = new HashSet<>();

	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<UsuarioRol> getUserRol() {
		return userRol;
	}

	public void setUserRol(Set<UsuarioRol> userRol) {
		this.userRol = userRol;
	}
	
	public Rol() {
		
	}
}
