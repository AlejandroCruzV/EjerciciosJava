import javax.swing.*;

/**
 * DATE WRITTEN 20-03-2024 https://retosdeprogramacion.com/ejercicios
 * #4 - ¿ES UN NÚMERO PRIMO?
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
public class NumeroPrimo {
    public static void main(String[] args) {
        String entrada = "", salida = "";
        int numAValidar = 0;
        //COMPRUEBA SI EL NÚMERO PROPORCIONADO POR EL USUARIO ES PRIMO
        try {
            entrada = JOptionPane.showInputDialog("INTRODUCE UN NUMERO PARA VALIDAR SI ES PRIMO:");
            numAValidar = Integer.parseInt(entrada);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: SE DEBE INGRESAR UN DATO NUMERICO. Ref.: " + e);
        }
        if (esPrimo(numAValidar)) {
            JOptionPane.showMessageDialog(null, "EL NÚMERO " + numAValidar + " ES PRIMO");
        } else {
            JOptionPane.showMessageDialog(null, "EL NÚMERO " + numAValidar + " ES NO PRIMO");
        }
        //IMPRIME LOS NÚMEROS PRIMOS DE 1-100
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                salida = salida.concat(i + "-"); //SE CONCATENA LA SALIDA PARA MOSTRAR POR JOPTIONPANE
                //System.out.print(i + "-");
            }
        }
        JOptionPane.showMessageDialog(null, "LOS NÚMEROS PRIMOS DEL 1-100, SON:\n" + salida);
    }

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        } else {
            if (num % 2 == 0 && num != 2) { //VALIDA SI ES MULTIPLO DE 2 Y QUE SEA DIFERENTE A 2, YA QUE 2 ES UNA EXCEPCIÓN
                return false;
            } else {
                for (int i = 3; i * i < num; i += 2) { //VALIDA SOLO LOS NUMEROS IMPARES PARA MAYOR EFICIENCIA
                    if (num % i == 0) {
                        return false;
                    }
                }
            }
            return true;
        }

    }
}
