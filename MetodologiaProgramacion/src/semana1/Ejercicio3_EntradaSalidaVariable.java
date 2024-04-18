package semana1;

import javax.swing.JOptionPane;

public class Ejercicio3_EntradaSalidaVariable {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("edad"));

        System.out.println("Hola " + nombre);

        System.out.println("Tienes " + edad + " anios ");

    }
}
