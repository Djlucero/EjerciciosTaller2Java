package com.sofkaTaller8;

import java.util.Scanner;

import com.sofkaTaller4.Ejercicio4_condicionales;

public class Ejercicio8_condicionales {

	
	public static void Menu() {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("ESCOJA UNA DE LAS SIGUIENTES OPCIONES");
		System.out.println("1. Torta festival cantidad 12 porciones decoracion crema chantilli");
		System.out.println("2. Torta festival cantidad 30 porciones decoracion crema chantilli");
		System.out.println("3. Torta de chocolate cantidad 12 porciones decoracion cubierta de chocolate");
		System.out.println("4. Torta de chocolate cantidad 30 porciones decoracion cubierta de chocolate");
		System.out.println("5. Torta 3 leches cantidad 12 porciones decoracion crema leche");
		System.out.println("6. Salir");	
		System.out.println("---------------------------------------------------------------------------------");
	}
	
	
	public static void DatosCliente() {
		Scanner lector = new Scanner(System.in);
		System.out.println("------BIENVENIDOS PASTELERIA DELICATESE-------");
        System.out.println("***para ofecerte un mejor servicio Digita la siguiente informacion***");
        System.out.println("Digite su Nombre y Apellido");
        String nombre = lector.nextLine();
        System.out.println("Digite numero documento identidad del cliente");
        String cedula = lector.nextLine();
        System.out.println("Bienvenid@ "+nombre);
	}
	
	public static void TortaUno() {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Usted ha elegido Torta festival cantidad 12 porciones decoracion crema chantilli");
        System.out.println("Ingrese cantidad");
        int cantidad = lector.nextInt();
        System.out.println("2. Digite precio");
        int precio = lector.nextInt();
        int total=(precio*cantidad);
        System.out.println("valor a cancelar $"+total+" Muchas Gracias por su compra");
        System.out.println("MUCHAS GRACIAS POR SU COMPRA");
	}
	
public static void TortaDos() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Usted ha elegido Torta festival cantidad 30 porciones decoracion crema chantilli");
		System.out.println("Ingrese cantidad");
        int cantidad = lector.nextInt();
        System.out.println("2. Digite precio");
        int precio = lector.nextInt();
        int total=(precio*cantidad);
        System.out.println("valor a cancelar $"+total+" Muchas Gracias por su compra");
        System.out.println("MUCHAS GRACIAS POR SU COMPRA");
	}
	
public static void TortaTres() {
	Scanner lector = new Scanner(System.in);
	System.out.println("Usted ha elegido Torta de chocolate cantidad 12 porciones decoracion cubierta de chocolate ");
    System.out.println("Ingrese cantidad");
    int cantidad = lector.nextInt();
    System.out.println("2. Digite precio");
    int precio = lector.nextInt();
    int total=(precio*cantidad);
    System.out.println("valor a cancelar $"+total+" Muchas Gracias por su compra");
    System.out.println("MUCHAS GRACIAS POR SU COMPRA");
}

public static void TortaCuatro() {
	Scanner lector = new Scanner(System.in);
	System.out.println("Usted ha elegido Torta de chocolate cantidad 30 porciones decoracion cubierta de chocolate ");
    System.out.println("Ingrese cantidad");
    int cantidad = lector.nextInt();
    System.out.println("2. Digite precio");
    int precio = lector.nextInt();
    int total=(precio*cantidad);
    System.out.println("valor a cancelar $"+total+" Muchas Gracias por su compra");
    System.out.println("MUCHAS GRACIAS POR SU COMPRA");
}

public static void TortaCinco() {
	Scanner lector = new Scanner(System.in);
	System.out.println("Usted ha elegido Torta 3 leches cantidad 12 porciones decoracion crema leche ");
    System.out.println("Ingrese cantidad");
    int cantidad = lector.nextInt();
    System.out.println("2. Digite precio");
    int precio = lector.nextInt();
    int total=(precio*cantidad);
    System.out.println("Su pedido es Torta festival cantidad 12 porciones decoracion crema chantilli");
    System.out.println("valor a cancelar $"+total+" Muchas Gracias por su compra");
    System.out.println("MUCHAS GRACIAS POR SU COMPRA");
}
	
	
	 public static void main(String[] args) {
		    
		    boolean verdadero = true;
		    Scanner lector = new Scanner(System.in);
		  
		    Ejercicio8_condicionales bo = new Ejercicio8_condicionales();

		    bo.DatosCliente();
		    

		    while (true) {
		    	
		    	
		    	bo.Menu();
		        int op = lector.nextInt();	
		    	
		        if (op == 6) {
		            System.out.println("Hasta pronto");
		            break;
		            
		            
		        } else if (op == 1) {    
		        	bo.TortaUno();
		        	
		                 
		        } else if (op == 2) {    
		        	bo.TortaDos();
		        	
		        } else if (op ==3) {
		        	bo.TortaTres();
		        	
		        } else if (op ==4) {
		        	bo.TortaCuatro();
		        	
		        } else if (op ==5) {
		        	bo.TortaCinco();
		        	
		        }
		        
		    	
		    }
		    }
	
}

