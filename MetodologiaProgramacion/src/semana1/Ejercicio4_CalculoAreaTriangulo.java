package semana1;

import javax.swing.JOptionPane;

public class Ejercicio4_CalculoAreaTriangulo {

    public static void main(String[] args) {

        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingresar base del Triangulo"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la altura del triangulo"));
        double area = (base * altura) / 2;
        System.out.println("Triangulo con base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Tiene un Area de: " + area);
    }
}
