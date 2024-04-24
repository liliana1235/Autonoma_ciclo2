package semana3;

import java.util.Scanner;

public class Ejercicio_1EstructuraWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("Ingrese numeros enteros positivos (ingrese un numero negativo para salir):");

        do {
            System.out.print("Ingrese un numero: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                suma += numero;
            }
        } while (numero >= 0);

        System.out.println("La suma de los numeros ingresados es: " + suma);

        scanner.close();
    }
}
