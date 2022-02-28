package com.sofkaTaller10;

import java.util.Scanner;

import com.sofkaTaller4.Ejercicio4_condicionales;

		

public class Ejercicio10_condicionales {
	
	static int cuenta;
	static float monto;
	static float saldo;
	static float retiro;
	static String nombre;
	static int cuenta1;
	
	

	public static void DatosPersonales() {
		Scanner lector = new Scanner(System.in);
		System.out.println("-----------------------------------------------------");
	    System.out.println("*** BIENVENIDOS A SU BANCO FIEL ***");
	    System.out.println("Digite su Nombre y Apellido");
	    nombre = lector.nextLine();
	    System.out.println("Digite numero de documento del titular");
	    String cedula = lector.nextLine();
	    System.out.println("Bienvenid@"+nombre);
	    System.out.println("-----------------------------------------------------");
	    
		
	}
	
     public static void Ingreso() {
    	 	Scanner lector = new Scanner(System.in);
    	 	System.out.println("-----------------------------------------------------");
    	    System.out.println("Seleccione la opcion a realizar	");
    	    System.out.println("1. Consignaciones");
    	    System.out.println("2. Retiros");
    	    System.out.println("3. Consultas");
    	    System.out.println("4. SALIR");
    	    System.out.println("-----------------------------------------------------");
    	   	
     }
    
	public static void Consignar() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Usted a elegido consignar");
	    System.out.println("Digite el numero de su cuenta");
	    cuenta = lector.nextInt();
	    System.out.println("El valor minimo a consignar es de $10.000");
	    System.out.println("Digite valor a consignar");
	    monto = lector.nextFloat();
	    if (monto>=10000) {
	    	System.out.println("Transaccion exitosa");	
	    }else {
	    	System.out.println("El valor ingresado no coincide con los parametros establecidos");	
	    }
	    saldo=(saldo+monto);
	}
	
	public static void Retiros() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Digite el numero de su cuenta");
	    cuenta = lector.nextInt();
	    System.out.println("Digite el valor a retirar");
	    retiro = lector.nextFloat();
	    if (retiro<=saldo) {
	    	System.out.println("Transaccion realizada con exito");
	    	saldo=(saldo-retiro);
	    }else {
	    	System.out.println("No cuenta con fondos suficientes para realizar la transaccion");	
	    }
	    
	}
	
	
	public static void ConsultaSaldo() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Digite el numero de su cuenta");
	    cuenta = lector.nextInt();
	    System.out.println("su saldo es $"+saldo);
	   	System.out.println("Muchas gracias por utilizar nuestros servicios");	
	    
	}

	
	
	 public static void main(String[] args) {
		    
		    boolean verdadero = true;
		    Scanner lector = new Scanner(System.in);
		  
		    Ejercicio10_condicionales bo = new Ejercicio10_condicionales();

		    
		    bo.DatosPersonales();

		    while (true) {
		    	
		    	
		    
		    	
		    	bo.Ingreso();
		    	 int op = lector.nextInt();
		    	
		        if (op == 4) {
		            System.out.println("Hasta pronto");
		            break;
		            
		            
		        } else if (op == 1) {    
		        	
		        	bo.Consignar();
		                 
		        } else if (op == 2) {    
		        	bo.Retiros();
		        	
		        } else if (op ==3) {
		        	bo.ConsultaSaldo();
		        	
		        }
		        
		    	
		    }
		    }
	

	
	
}
