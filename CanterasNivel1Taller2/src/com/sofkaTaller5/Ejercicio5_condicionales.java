package com.sofkaTaller5;

import java.util.Scanner;



public class Ejercicio5_condicionales {



public static void Productos() {
	System.out.println("CONSULTA DE PRECIOS");
			System.out.println("1.Ibuprofeno-200 mg PRECIO: $7500");
			System.out.println("2.Acido acetilsalicílico?500 mg PRECIO $20500");
			System.out.println("3.Morfina-10 mg (sulfato de morfina) PRECIO $18900");
			System.out.println("4.Dexametasona Inyección: 4 mg PRECIO $12500");
			System.out.println("5.Albendazol (masticables): 400 mg PRECIO $25500");
			System.out.println("6.Amoxicilina 250 mg PRECIO $30000");
			System.out.println("7.Azitromicina 500 mg PRECIO $13500");
			System.out.println("8.pirazinamida 400 mg PRECIO $15000");
			System.out.println(" ");
	 
	}

public static void ConsultaProductos() {
	System.out.println("Digite el nombre del producto");
	Scanner lector =new Scanner(System.in);
	String producto = lector.next();
	System.out.println("Digite caracteristicas del producto");
	String caracteristica = lector.next();
	System.out.println("el producto "+ producto+" con caracteristicas "+ caracteristica+ 
			" sera entregado en caja al momento de su facturacion.");
	System.out.println("Muchas Gracias Por Su Compra");
	
}


public static void DevolucionProducto() {
	System.out.println("Digite el nombre del producto a devolver");
	Scanner lector =new Scanner(System.in);
	String producto = lector.next();
	System.out.println("Desea añadir un comentario?(digite true o false)");
	boolean v = CapturarBoolean();
		if (v) {
		System.out.println("Digite Comentarios y Observaciones");
		String comentar=lector.next();
		System.out.println("La Novedad ha sido ingresada con exito.");	
		}
		}

		

    private static boolean CapturarBoolean() {
    Scanner lector =new Scanner(System.in);
	return lector.nextBoolean();
	
}

public static void main(String[] args) {
    
    boolean verdadero = true;
    Scanner lector = new Scanner(System.in);
  
    Ejercicio5_condicionales bo = new Ejercicio5_condicionales();


    while (true) {
    	
    	
    
    	System.out.println("-----------------------------------------------------");
        System.out.println("*** BIENVENIDOS A SU DROGUERIA MI SALUD ***");
        System.out.println("1.Digite su Nombre y Apellido");
        String nombre = lector.nextLine();
         
        System.out.println("ESCOJA UNA DE LAS SIGUIENTES OPCIONES");
        System.out.println("1. COMPRA DE PRODUCTO");
        System.out.println("2. CONSULTAR PRECIOS");
        System.out.println("3. DEVOLUCIONES ");
        System.out.println("4. SALIR");
        int op = lector.nextInt();	
    	
        if (op == 4) {
            System.out.println("Hasta pronto");
            break;
            
            
        } else if (op == 1) {    
        	bo.ConsultaProductos();
        	
                 
        } else if (op == 2) {    
        	bo.Productos();
        	
        } else if (op ==3) {
        	bo.DevolucionProducto() ;
        	;
        }
        
    	
    }
    }



}
