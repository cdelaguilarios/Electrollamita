package com.llamita.electrollamita.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPRESA")
public class Empresa implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8252432995328275946L;

	@Id
	@GeneratedValue
	@Column(name="IN_IDEMPRESA")
	private Integer id;
	
	@Column(name="VC_RAZONSOCIAL")
	private String razonSocial;
	
	@Column(name="VC_RUC")
	private String ruc;
	
	@Column(name="CH_ESTADO")
	private boolean estado;
	
	public Empresa(){
		
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

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
}
