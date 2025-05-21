
package RectanguloCaracteres;

import java.util.Scanner;


public class RectanguloCaracteres {

    final static char CARACTER = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ancho, alto;

        System.out.print("Ingresá el ancho: ");
        ancho = sc.nextInt();
        while (ancho <= 0) {
            System.out.print("ERROR. Ingresá el ancho: ");
            ancho = sc.nextInt();
        }

        System.out.print("Ingresá el alto: ");
        alto = sc.nextInt();
        while (alto <= 0) {
            System.out.print("ERROR. Ingresá el alto: ");
            alto = sc.nextInt();
        }

        System.out.println("\nRectángulo de " + ancho + "x" + alto + " con el carácter '" + CARACTER + "':");
        for (int f = 1; f <= alto; f++) {
            for (int c = 1; c <= ancho; c++) {
                System.out.print(CARACTER);
            }
            System.out.println();
        }
    }
}