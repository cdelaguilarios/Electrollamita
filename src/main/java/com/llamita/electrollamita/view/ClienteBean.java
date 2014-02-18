package com.llamita.electrollamita.view;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ClienteBean {

	@NotNull
	@Size(min=1,max=50)
	private String razonSocial;
	
	@NotNull
	@Size(min=10,max=11)
	@Pattern(regexp="^[0-9]+$")
	private String ruc;
	
	@NotNull
	@Size(min=1,max=80)
	private String direccion;
	
	@NotNull
	private String telefono;
	
	private int id;
	
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
