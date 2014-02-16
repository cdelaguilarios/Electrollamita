package com.llamita.electrollamita.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MEDIDOR")
public class Medidor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6854965803356363741L;
	
	@Id
	@GeneratedValue
	@Column(name="IN_IDMEDIDOR")
	private Integer id;
	
	@Column(name="VC_NUMERO")
	private String numero;
	
	@Column(name="VC_CARACTERISTICA")
	private String caracteristica;
	
	@Column(name="VC_TIPOMEDIDOR")
	private String tipoMedidor;
	
	@Column(name="VC_TIPOCONEXION")
	private String tipoConexion;
	
	@Column(name="VC_TENSION")
	private String tension;
	
	@Column(name="VC_CONEXION")
	private String conexion;
	
	@Column(name="CH_ESTADO")
	private Character estado;
	
	@Column(name="IN_IDCLIENTE")
	private Integer idCliente;
	
	public Medidor(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String getTipoMedidor() {
		return tipoMedidor;
	}

	public void setTipoMedidor(String tipoMedidor) {
		this.tipoMedidor = tipoMedidor;
	}

	public String getTipoConexion() {
		return tipoConexion;
	}

	public void setTipoConexion(String tipoConexion) {
		this.tipoConexion = tipoConexion;
	}

	public String getTension() {
		return tension;
	}

	public void setTension(String tension) {
		this.tension = tension;
	}

	public String getConexion() {
		return conexion;
	}

	public void setConexion(String conexion) {
		this.conexion = conexion;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
	
}
