package com.system.ams.entities;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

//TODO: Relacion un usuario va poder tener muchos roles
@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser;
	
	private String username;
	private String password;
	private String name;
	private String lastname;
	private String email;
	private String phone;
	private boolean enabled = true;
	private String perfil;
	
	//cascade es cuando se elminica o se un cambio afecta a los tablas que tiene relacionados
	// fecth(busqueda) -> eager(ansioso)-> trae info de los registros relacionados / lazy(peresos) -> no trae info de los registros relacionados de las entidades relacionadas
	// mappedBy -> Apunta a la entidad propietaria de la realcion, en este caso es el usuario
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
	@JsonIgnore
	private Set<UsuarioRol> userRol = new HashSet<>();

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public Set<UsuarioRol> getUserRol() {
		return userRol;
	}

	public void setUserRol(Set<UsuarioRol> userRol) {
		this.userRol = userRol;
	}
	
	public Usuario() {
		
	}
	
	
	
	

}
