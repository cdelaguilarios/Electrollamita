package com.llamita.electrollamita.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1229225428007289045L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IN_IDCLIENTE")
	private Integer id;
	
	@Column(name="VC_RAZONSOCIAL")
	private String razonSocial;
	
	@Column(name="VC_RUC")
	private String ruc;
	
	@Column(name="VC_DIRECCION")
	private String direccion;
	
	@Column(name="VC_TELEFONO")
	private String telefono;
	
	@Column(name="CH_ESTADO")
	private Character estado;
	
	@Column(name="IN_IDEMPRESA")
	private Integer idEmpresa;
	
	
	public Cliente(){
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public Character getEstado() {
		return estado;
	}


	public void setEstado(Character estado) {
		this.estado = estado;
	}


	public Integer getIdEmpresa() {
		return idEmpresa;
	}


	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	
}
