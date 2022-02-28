package com.sofkaTaller6;

import java.util.Scanner;

public class PrincipalEjercicio6 {

    public static void main(String[] args) {
    
    boolean verdadero = true;
    Scanner lector = new Scanner(System.in);
  
    Parqueadero bo = new Parqueadero();


    while (true) {
    	System.out.println("-----------------------------------------------------");
        System.out.println("*** BIENVENIDOS TALLER DE MOTOS EL MAQUINISTA ***");
        System.out.println("ESCOJA UNA DE LAS SIGUIENTES OPCIONES");
        System.out.println("1. REGISTRO DE INGRESO");
        System.out.println("2. REGISTRO DE SALIDA ");
        System.out.println("3. SALIR");
        System.out.println("Elija una Opción:\n");
        int op = lector.nextInt();

        
        if (op == 3) {
            System.out.println("Hasta pronto");
            break;
            
           
        } else if (op == 1) {
            System.out.println("INGRESO TALLER DE MOTOS");
            System.out.println("Ingresar nombres:");
            lector.nextLine();
            String nombre = lector.nextLine();
            System.out.println("Digite numero documento identidad del cliente");
            String documento = lector.nextLine();
            System.out.println("Digite numero de Placa de la moto");
            String placa = lector.nextLine();
            System.out.println("\"Digite modelo de la moto\"");
            String modelo = lector.nextLine();
            System.out.println("\"Digite observaciones de entrega de la motocicleta\"");
            String observacion = lector.nextLine();
            bo.crearCliente(nombre, documento, placa, modelo,observacion);
            
            
        } else if (op == 2) {
            System.out.println("Salida del vehiculo");
            System.out.println("Digite nombre del mecanico que realiaza la reparación\n");
            lector.nextLine();
            lector.nextLine();
            System.out.println("Digite arreglos realizados por el mecanico\n");
            String arreglo= lector.nextLine();
            System.out.println("Digite numero de Placa de la moto\n");
            lector.nextLine();
            
            System.out.println("La motocicleta de placas se le hicieron los siguientes arreglos"+arreglo+" y ha sido reparada y entregada con Exito\n");
        

        }   

    }
			
    }
}
