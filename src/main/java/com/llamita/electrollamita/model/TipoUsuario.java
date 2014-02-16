package com.llamita.electrollamita.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TIPO_USUARIO")
public class TipoUsuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2271812790122861741L;

	@Id
	@GeneratedValue
	@Column(name="IN_IDTIPO_USUARIO")
	private Integer id;
	
	@Column(name="VC_PERFIL")
	private String perfil;
	
	@Column(name="VC_ABREV")
	private String abrev;
	
	public TipoUsuario(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getAbrev() {
		return abrev;
	}

	public void setAbrev(String abrev) {
		this.abrev = abrev;
	}
	
	
	
}
