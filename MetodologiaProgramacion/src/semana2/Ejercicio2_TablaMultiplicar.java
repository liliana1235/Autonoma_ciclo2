package semana2;

import javax.swing.JOptionPane;

public class Ejercicio2_TablaMultiplicar {

    public static void main(String[] args) {
        int numeroMultiplo = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero multiplo"));

        for (int i = 1; i <= 12; i++) {

            int multiplo = numeroMultiplo * i;

            System.out.println(numeroMultiplo + " x " + i + " = " + (multiplo));

        }
    }
}
