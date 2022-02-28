package com.sofkaTaller4;

import java.util.Scanner;

public class Ejercicio4_condicionales {
	
	private String nombre;
	private String pelicula;
	private String comentario;
	private String novedad;
	
	
	  
	  
	public static void Peliculas() {
		System.out.println("Peliculas Disponibles:");
				System.out.println("1.la Vida es Bella");
				System.out.println("2.Encanto");
				System.out.println("3.Sing 2");
				System.out.println("4.Spaider-Man");
				System.out.println("5.Scream");
				System.out.println("6.Amenaza bajo el agua");
		 
		}
	  
	
	public static void AlquilerPelicula() {
		System.out.println("Ingrese nombre de la pelicula");
		Scanner lector =new Scanner(System.in);
    	String pelicula = lector.next();
    	System.out.println("La pelicula "+pelicula+"  ha sido alquilada con exito.");
    	
	}
	
	private static boolean CapturarBoolean() {
	    Scanner lector =new Scanner(System.in);
		return lector.nextBoolean();
		
	}
	
	
	public static void EntregarPelicula() {
		System.out.println("Digite nombre pelicula a devolver");
		Scanner lector =new Scanner(System.in);
    	String pelicula = lector.next();
    	System.out.println("La pelicula "+pelicula+"  ha sido devuelta con exito.");
    	System.out.println("Desea añadir un comentario?(digite true o false)");
    	boolean v = CapturarBoolean();
    		if (v) {
    	System.out.println("Escriba el estado de devolucion de la pelicula si presenta alguna novedad");
    	String comentario=lector.next();
    	System.out.println("Novedad ha sido ingresada con exito.");
    	
	}
	

	}	
	
	 public static void main(String[] args) {
		    
		    boolean verdadero = true;
		    Scanner lector = new Scanner(System.in);
		  
		    Ejercicio4_condicionales bo = new Ejercicio4_condicionales();


		    while (true) {
		    	
		    	
		    
		    	System.out.println("-----------------------------------------------------");
		        System.out.println("*** VIDEOTIENDA EL PORVENIR ***");
		        System.out.println("1.Digite su Nombre y Apellido");
	            String nombre = lector.nextLine();
		         
		        System.out.println("ESCOJA UNA DE LAS SIGUIENTES OPCIONES");
		        System.out.println("1. Consultar peliculas disponibles");
		        System.out.println("2. Alquilar Pelicula");
		        System.out.println("3. Entregar Pelicula ");
		        System.out.println("4. SALIR");
		        int op = lector.nextInt();	
		    	
		        if (op == 4) {
		            System.out.println("Hasta pronto");
		            break;
		            
		            
		        } else if (op == 1) {    
		        	bo.Peliculas();
		        	
		                 
		        } else if (op == 2) {    
		        	bo.AlquilerPelicula();
		        	
		        } else if (op ==3) {
		        	bo.EntregarPelicula();
		        	;
		        }
		        
		    	
		    }
		    }
	
}


