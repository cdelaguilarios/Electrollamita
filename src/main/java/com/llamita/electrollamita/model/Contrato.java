package com.llamita.electrollamita.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTRATO")
public class Contrato implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 464090922279794323L;
	
	@Id
	@GeneratedValue
	@Column(name="IN_IDCONTRATO")
	private Integer id;
	
	@Column(name="VC_POTMAXCONTRATO")
	private String potMaxContrato;
	
	@Column(name="VC_MODALIDAD")
	private String modalidad;
	
	@Column(name="VC_VIGOPCTARIFARIA")
	private String vigOpcTarifaria;
	
	@Column(name="VC_CODALIMENTADOR")
	private String codAlimentador;
	
	@Column(name="VC_CUENTA")
	private String cuenta;
	
	@Column(name="VC_SISTELECTRICA")
	private String sistElectrico;
	
	@Column(name="CH_ESTADO")
	private Character estado;
	
	@Column(name="IN_IDMEDIDOR")
	private Integer idMedidor;
	
	public Contrato(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPotMaxContrato() {
		return potMaxContrato;
	}

	public void setPotMaxContrato(String potMaxContrato) {
		this.potMaxContrato = potMaxContrato;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public String getVigOpcTarifaria() {
		return vigOpcTarifaria;
	}

	public void setVigOpcTarifaria(String vigOpcTarifaria) {
		this.vigOpcTarifaria = vigOpcTarifaria;
	}

	public String getCodAlimentador() {
		return codAlimentador;
	}

	public void setCodAlimentador(String codAlimentador) {
		this.codAlimentador = codAlimentador;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getSistElectrico() {
		return sistElectrico;
	}

	public void setSistElectrico(String sistElectrico) {
		this.sistElectrico = sistElectrico;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	public Integer getIdMedidor() {
		return idMedidor;
	}

	public void setIdMedidor(Integer idMedidor) {
		this.idMedidor = idMedidor;
	}
	
	
}
