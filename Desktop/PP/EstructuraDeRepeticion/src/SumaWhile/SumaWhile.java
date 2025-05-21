
package SumaWhile;

import java.util.Scanner;


public class SumaWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("WHILE: Sumar números hasta ingresar 0");
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = sc.nextInt();

        while (numero != 0) {
            suma += numero;
            System.out.print("Ingrese otro número: ");
            numero = sc.nextInt();
        }

        System.out.println("Suma total: " + suma);
    }
}