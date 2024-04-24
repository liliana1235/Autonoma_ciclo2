package semana3;

import java.util.Scanner;

public class Ejercicio2_DoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int i = 1;

        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 12);

        scanner.close();
    }
}
