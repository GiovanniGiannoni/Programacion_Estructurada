
package TablasMultiplicar;


public class TablasMultiplicar {

    
    public static void main(String[] args) {
        System.out.println("Tablas de multiplicar del 1 al 3");

        for (int tabla = 1; tabla <= 3; tabla++) {
            System.out.println("Tabla del " + tabla);
            for (int i = 1; i <= 10; i++) {
                System.out.println(tabla + " x " + i + " = " + (tabla * i));
            }
            System.out.println();
        }
    }
}
