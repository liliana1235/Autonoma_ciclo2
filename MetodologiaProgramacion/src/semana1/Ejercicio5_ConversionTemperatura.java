package semana1;

import javax.swing.JOptionPane;

public class Ejercicio5_ConversionTemperatura {

    public static void main(String[] args) {
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Temperatura en grados Celsius"));
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperatura en celsius: " + celsius);
        System.out.println("Grados Fahrenheit: " + fahrenheit);
    }
}
