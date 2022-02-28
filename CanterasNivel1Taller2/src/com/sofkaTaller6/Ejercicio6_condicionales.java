package com.sofkaTaller6;



public class Ejercicio6_condicionales {

	private String nombre;
    private String documento;
    private String placa;
    private String observacion;
    private String modelo;
    
  
    
    public Ejercicio6_condicionales() {
		
	}

    public Ejercicio6_condicionales(String nombre, String documento, String placa, String modelo,String observacion) {
		this.nombre = nombre;
		this.documento = documento;
		this.placa = placa;
		this.modelo = modelo;
		this.observacion=observacion;
		
		
   	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}