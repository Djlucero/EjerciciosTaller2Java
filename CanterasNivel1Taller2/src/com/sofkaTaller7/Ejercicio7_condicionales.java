package com.sofkaTaller7;

import java.util.Scanner;

import com.sofkaTaller5.Ejercicio5_condicionales;


public class Ejercicio7_condicionales {

	private String nombre;
	private String documento;
	private double peso;
	private double estatura;
	
	
	private static double calcularIMC(double altura, double peso){
        double imc = peso/(Math.pow(altura, 2));
        return Math.rint(imc*100)/100;
    }
	

	
	public static void main(String[] args) {
		 
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("SECRETARIA DE SALUD\n");
        System.out.print("Digite su Nombre y Apellido:\n");
        String nombre=sc.next();
        System.out.print("digite numero de documento de identidad\n");
        String documento=sc.nextLine();
        sc.next();
        System.out.print("Digite su peso en kilogramos? \n");
        double peso = sc.nextDouble();
        System.out.print("Digite su estatura en metros: \n");
        double altura = sc.nextDouble();
        sc.close();
 
        double imc = calcularIMC(altura, peso);
 
        String clasificacion = "";
        if(imc < 18.5 ){
            clasificacion = "Bajo de Peso";
        } else if(imc>=18.5 && imc<=24.9){
            clasificacion = "Peso Normal";
        } else if(imc>=25 && imc<=29.9){
            clasificacion = "Preobecidad o Sobrepeso";
        } else if(imc>=30.0 && imc<=34.9){
            clasificacion = "Obecidad Clase I";
        } else if(imc>=35.0 && imc<=39.9){
            clasificacion = "Obecidad clase II";
        } else {
        	clasificacion = "Obecidad clase III";
        }
        
        System.out.println("\nSeñor(a) "+nombre+ " su indice de masa corporal IMC es de " + imc);
        System.out.println("Atendiendo al IMC, tiene: " + clasificacion);
 
	}


	 
	}



	



