package com.sofkaTaller6;

import java.util.ArrayList;


public class Parqueadero {
	
	
	ArrayList<Ejercicio6_condicionales> lista_cliente = new ArrayList<>();
	
	public void crearCliente(String nombre, String documento, String placa, String modelo,String observacion) {
        lista_cliente.add(new Ejercicio6_condicionales(nombre, documento, placa,modelo,observacion));
    }
	
	  
    public boolean eliminarCliente(int pos) {
        try {
            lista_cliente.remove(pos);
        } catch (Exception posicion_no_valida) {
            return false;
        }
        return true;
    }
}
	
