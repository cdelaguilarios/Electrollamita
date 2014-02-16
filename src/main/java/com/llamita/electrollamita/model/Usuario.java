package com.llamita.electrollamita.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USUARIO")
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3510062441640046009L;
	
	@Id
	@GeneratedValue
	@Column(name="IN_IDUSUARIO")
	private Integer id;
	
	@Column(name="VC_USUARIO")
	private String usuario;
	
	@Column(name="VC_CONTRASENA")
	private String contraseña;
	
	@Column(name="CH_ESTADO")
	private Character estado;
	
	@Column(name="IN_IDTIPO_USUARIO")
	private Integer idTipoUsuario;
	
	@Column(name="IN_IDEMPRESA") 
	private Integer idEmpresa;
	
	public Usuario(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	public Integer getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public void setIdTipoUsuario(Integer idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	
	
	
}
