import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * DATE WRITTEN 19-03-2024 https://retosdeprogramacion.com/ejercicios
 * #3 - LA SUCESIÓN DE FIBONACCI
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 * la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 */
public class Fibonacci {

    public static void main(String[] args) {
        double numActual = 0, numAnterior = 0, fiboAux = 0;
        int contador = 0, maxFibo = 0;
        // Valida que la entrada sea númerica
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos números deseas mostrar para la serie de Fibonacci?");
        try {
            maxFibo = sc.nextInt();
        } catch (Exception e) {
            System.err.println("ERROR: Debes ingresar un dato númerico positivo");
            System.exit(1);
        }
        // Valida que la entrada sea mayor a ceros
        if (maxFibo < 1) {
            System.err.println("ERROR: Debes ingresar un dato númerico mayor a cero");
        }
        System.out.println("La serie de Fibonacci para " + maxFibo + " es:");
        while (contador < maxFibo) {
            contador++;
            fiboAux = numAnterior + numActual;
            System.out.println("CONTADOR:" + contador + "-" + new DecimalFormat("###,###,###,###,###,###").format(fiboAux));
            numAnterior = numActual;
            if (numActual == 0) {
                numActual++;
            } else {
                numActual = fiboAux;
            }
        }
        System.out.println("************TOTALES************");
        System.out.println("Fibonacci      :" + new DecimalFormat("###,###,###,###,###,###").format(fiboAux));
        System.out.println("Número Actual  :" + new DecimalFormat("###,###,###,###,###,###").format(numActual));
        System.out.println("Número Anterior:" + new DecimalFormat("###,###,###,###,###,###").format(numAnterior));
        System.out.println("Contador       :" + new DecimalFormat("###,###,###,###,###,###").format(contador));
        System.out.println("Número Máx.Fibo:" + new DecimalFormat("###,###,###,###,###,###").format(maxFibo));
        System.out.println("************---------************");

    }
}