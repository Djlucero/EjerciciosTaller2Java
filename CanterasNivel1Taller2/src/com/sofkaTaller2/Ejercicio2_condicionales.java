package com.sofkaTaller2;

import java.util.Scanner;

public class Ejercicio2_condicionales {
	
	 	private int edad;
	    private Scanner input;
	   
	    public void Ejercicio2() {

	        input = new Scanner(System.in);

	        solicitarEdad();
	        edad = capturarDatoInt();
	        
	        
	        if (edad>=18) {
		    	System.out.println("Usted es mayor de edad"); 
		    }
	        else {
	        	System.out.println("Usted todavia es un niño(a)");
	        }
	    }

	    private void solicitarEdad() {
	        System.out.println("Por favor digite su edad");
	        
	        
	    }

	    private int capturarDatoInt() {
	    	return input.nextInt();
	    }
	     
	
}
