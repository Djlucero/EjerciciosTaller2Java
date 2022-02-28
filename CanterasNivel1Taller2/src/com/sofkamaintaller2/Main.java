package com.sofkamaintaller2;

import java.io.IOException;
import java.util.Scanner;

import com.sofkaTaller1.Ejercicio1_Condicionales;
import com.sofkaTaller10.Ejercicio10_condicionales;
import com.sofkaTaller2.Ejercicio2_condicionales;
import com.sofkaTaller3.Ejercicio3_condicionales;
import com.sofkaTaller4.Ejercicio4_condicionales;
import com.sofkaTaller5.Ejercicio5_condicionales;
import com.sofkaTaller6.PrincipalEjercicio6;
import com.sofkaTaller7.Ejercicio7_condicionales;
import com.sofkaTaller8.Ejercicio8_condicionales;
import com.sofkaTaller9.Ejercicio9_condicionales;





public class Main {
	
	private static boolean bandera = true;
    private static int opcion;

    public static void main(String[] args) throws IOException {
        do {
            limpiarPantalla();
            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
        } while (bandera == true);
    }

		    private static void menu() {
		        System.out.println("TALLER N.2 CONDICIONALES");
		        System.out.println("Escoja un punto del taller");
		        System.out.println("1. Ejercicio N.1");
		        System.out.println("2. Ejercicio N.2");
		        System.out.println("3. Ejercicio N.3");
		        System.out.println("4. Ejercicio N.4");
		        System.out.println("5. Ejercicio N.5");
		        System.out.println("6. Ejercicio N.6");
		        System.out.println("7. Ejercicio N.7");
		        System.out.println("8. Ejercicio N.8");
		        System.out.println("9. Ejercicio N.9");
		        System.out.println("10. Ejercicio N.10");
		        System.out.println("11. Salir");
		    }

		    private static int capturarOpcion() {
		        Scanner input = new Scanner(System.in);
		        return input.nextInt();
		    }
		    
		    private static boolean evaluarOpcion(int opcion) throws IOException {
		        switch (opcion) {

				case 1:
				    Ejercicio1_Condicionales p1 = new Ejercicio1_Condicionales();
				    p1.Ejercicio1();
				    return true;
				    
				case 2:
				    Ejercicio2_condicionales p2 = new Ejercicio2_condicionales();
				    p2.Ejercicio2();
				    return true;
				    
				case 3:
				    Ejercicio3_condicionales p3 = new Ejercicio3_condicionales();
				    p3.Ejercicio3();
				    return true;
				    
				case 4:
					Ejercicio4_condicionales p4= new Ejercicio4_condicionales();
				    p4.main(null);
				    return true;
				case 5:
					Ejercicio5_condicionales p5= new Ejercicio5_condicionales();
				    p5.main(null);
				    return true;
								    
				case 6:
					PrincipalEjercicio6 p6= new PrincipalEjercicio6();
				    p6.main(null);
				    return true;
				
				case 7:
					Ejercicio7_condicionales p7=new Ejercicio7_condicionales();
					p7.main(null);
				    return true;
				case 8:
					Ejercicio8_condicionales p8= new Ejercicio8_condicionales();
				    p8.main(null);
				    return true;    
				case 9:
					Ejercicio9_condicionales p9= new Ejercicio9_condicionales();
				    p9.main(null);
				    return true; 
				case 10:
					Ejercicio10_condicionales p10= new Ejercicio10_condicionales();
				    p10.main(null);
				    return true; 
						                
		                
		            case 11:
		                return false;
		                // break;
		            default:
		                System.out.println("Opción incorrecta");
		                System.in.read();
		                
		        }
		        return true;
		    }

		    private static void limpiarPantalla() {
		    		System.out.println();
		    		}
		    

}
