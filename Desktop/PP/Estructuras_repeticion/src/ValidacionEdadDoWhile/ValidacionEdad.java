
package ValidacionEdadDoWhile;

import java.util.Scanner;


public class ValidacionEdad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        do {
            System.out.print("Ingrese su edad (positiva): ");
            edad = sc.nextInt();
        } while (edad <= 0);

        System.out.println("Edad ingresada: " + edad);
    }
}