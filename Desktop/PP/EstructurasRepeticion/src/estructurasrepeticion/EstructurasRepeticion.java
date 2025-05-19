
package estructurasrepeticion;

import java.util.Scanner;


public class EstructurasRepeticion {
    
    final static char CARACTER = 'X';

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);

        // FOR: Contador
        System.out.println("FOR: Mostrar los primeros 10 números");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Número: " + i);
        }

        // WHILE: Acumulador con validación
        int suma = 0;
        int numero;
        System.out.println("\nWHILE: Sumar números hasta ingresar 0");
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = sc.nextInt();
        while (numero != 0) {
            suma += numero;
            System.out.print("Ingrese otro número: ");
            numero = sc.nextInt();
        }
        System.out.println("Suma total: " + suma);

        // DO-WHILE: Validar que se ingrese un número positivo
        int edad;
        do {
            System.out.print("\nDO-WHILE: Ingrese su edad (positiva): ");
            edad = sc.nextInt();
        } while (edad <= 0);
        System.out.println("Edad ingresada: " + edad);

        // Bucle anidado: Tabla de multiplicar del 1 al 3
        System.out.println("\nBucles anidados: Tablas de multiplicar del 1 al 3");
        for (int tabla = 1; tabla <= 3; tabla++) {
            System.out.println("Tabla del " + tabla);
            for (int i = 1; i <= 10; i++) {
                System.out.println(tabla + " x " + i + " = " + (tabla * i));
            }
            System.out.println();
        }

        
        
        //EJERCICIO de CICLOS ANIDADOS (Charly Cimino)
        
        int ancho, alto;
        
     

        System.out.print("Ingresá el ancho: ");
        ancho = Integer.parseInt(sc.next());

        while (ancho <= 0) {
            System.out.print("ERROR. Ingresá el ancho: ");
            ancho = Integer.parseInt(sc.next());
        }

        System.out.print("Ingresá el alto: ");
        alto = Integer.parseInt(sca.nextLine());

        while (alto <= 0) {
            System.out.print("ERROR. Ingresá el alto: ");
            alto = Integer.parseInt(sca.nextLine());
        }
        
        for (int f = 1;f<=alto; f++) {
            for (int c=1;c<= ancho; c++){
                System.out.print(CARACTER);
            }
            System.out.println();
        }
        
    }
}