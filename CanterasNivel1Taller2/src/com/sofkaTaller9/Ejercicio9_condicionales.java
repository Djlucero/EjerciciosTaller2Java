package com.sofkaTaller9;

import java.util.Scanner;



public class Ejercicio9_condicionales {

	public static void Rectangulo() {
		Scanner lector =new Scanner(System.in);
		System.out.println("RECTANGULO:");
		System.out.println("Digite base en cm:");
		float num1 = lector.nextFloat();
		System.out.println("Digite altura en cm:");
		float num2 = lector.nextFloat();
		float area =(num1*num2);
		System.out.println("Area del rectángulo = "+area+" cm^2");
				
	}
	
	public static void Triangulo() {
		Scanner lector =new Scanner(System.in);
		System.out.println("TRIANGULO:");
		System.out.println("Digite base mayor en cm:");
		float num1 = lector.nextFloat();
		System.out.println("Digite base menor en cm:");
		float num2 = lector.nextFloat();
		float area =(num1*num2)/2;
		System.out.println("Area del rectángulo = "+area+" cm^2");
				
	}
	
	
	public static void Trapecio() {
		Scanner lector =new Scanner(System.in);
		System.out.println("TRAPECIO:");
		System.out.println("Digite base mayor en cm:");
		float num1 = lector.nextFloat();
		System.out.println("Digite base menor en cm:");
		float num2 = lector.nextFloat();
		System.out.println("Digite altura en cm:");
		float num3 = lector.nextFloat();
		float area =(num3*(num1*num2))/2;
		System.out.println("Area del rectángulo = "+area+" cm^2");
				
	}
		
	
	
	
	
	public static void main(String[] args) {
	    
	    boolean verdadero = true;
	    Scanner lector = new Scanner(System.in);
	  
	    Ejercicio9_condicionales bo = new Ejercicio9_condicionales();


	    while (true) {
	    	
	    	
	    
	    	System.out.println("-----------------------------------------------------");
	        System.out.println("*** BIENVENIDOS A SU CLASE DE GEOMETRIA ***");
	        System.out.println("SELECCIONE LA OPCION DE LA FIGURA A CALCULAR");
	        System.out.println("1. Rectangulo");
	        System.out.println("2. Triangulo");
	        System.out.println("3. Trapecio");
	        System.out.println("4. SALIR");
	        System.out.println("-----------------------------------------------------");
	        
	        int op = lector.nextInt();	
	    	
	        if (op == 4) {
	            System.out.println("Hasta pronto");
	            break;
	            
	            
	        } else if (op == 1) {    
	        	bo.Rectangulo();
	        	
	                 
	        } else if (op == 2) {    
	        	bo.Triangulo();
	        	
	        } else if (op ==3) {
	        	bo.Trapecio();
	        }
	        
	    	
	    }
	    }



}
