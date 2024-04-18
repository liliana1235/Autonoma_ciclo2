package semana2;

import javax.swing.JOptionPane;

public class Ejercicio1_SumaNumerosPares {

    public static void main(String[] args) {
        int ultimoNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ultimo numero"));
        int sumaTotalPares = 0;

        for (int i = 1; i <= ultimoNumero; i++) {
            if (i % 2 == 0) {
                int numeroPar = i;
                System.out.println("Numero par: " + numeroPar);
                sumaTotalPares = sumaTotalPares + numeroPar;
            }
        }

        System.out.println("La suma total de los numeros pares es: " + sumaTotalPares);
    }
}
