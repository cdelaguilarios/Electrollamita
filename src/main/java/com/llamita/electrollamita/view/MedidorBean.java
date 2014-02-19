package com.llamita.electrollamita.view;

public class MedidorBean {

	private int id;
	private String numero;
	private String caracteristica;
	private String tipoMedidor;
	private String tipoConexion;
	private String tension;
	private String conexion;
	private char estado;
	private int idCliente;
	
	public MedidorBean(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	
	
	
}
