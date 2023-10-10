//Primer archivo
//Comentarios desde la rama modificacion
//Otro comentario desde rama master
//Otra modificacion de programa1

//Comentari dins de la rama comentaris

import java.util.Scanner;

public class ProducteNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Posa un nombre: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Posa'n un altre: ");
        double numero2 = scanner.nextDouble();

        double producte = numero1 * numero2;

        System.out.println("El producte es" producte);
    }
}

