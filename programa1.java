/Primer archivo
//Comentarios desde la rama modificacion
//Otro comentario desde rama master
//Otra modificacion de programa1

//Comentari dins de la rama comentaris

/*
Hola
Comentaris
*/

import java.util.Scanner;

public class SumaDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Posa un numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Posa un altre numero: ");
        double numero2 = scanner.nextDouble();

        double suma = numero1 + numero2;

        System.out.println("La suma es: " + suma);
    }
}

