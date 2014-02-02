package com.llamita.electrollamita.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPRESA")
public class Empresa {

	@Id
	@GeneratedValue
	@Column(name="IN_ID")
	private Integer id;
	
	@Column(name="VC_USUARIO")
	private String usuario;
	
	@Column(name="VC_CONTRASENA")
	private String contrasena;
	
	@Column(name="VC_RAZONSOCIAL")
	private String razonSocial;
	
	@Column(name="VC_RUC")
	private String ruc;
	
	public Empresa(){
		
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

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	
}
