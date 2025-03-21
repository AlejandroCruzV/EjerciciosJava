import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * DATE WRITTEN 09-03-2024 https://retosdeprogramacion.com/ejercicios
 * #1 - EL FAMOSO "FIZZ BUZZ"
 * * Escribe un programa que muestre por consola (con un print) los
 * * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * * cada impresión), sustituyendo los siguientes:
 * * - Múltiplos de 3 por la palabra "fizz".
 * * - Múltiplos de 5 por la palabra "buzz".
 * * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, contMult5 = 0, contMult3 = 0, contMultAmbos = 0, contMultOtros = 0;
        String salida = "";

//Valida que la entrada sea numerica y mayor a ceros
        try {
            System.out.println("Elige un numero mayor a cero para mostrar la secuencia en pantalla");
            total = sc.nextInt();
        } catch (Exception e) {
            System.err.println("ERROR: en el valor ingresado debe ser numerico mayor a cero. Error:" + e);
            //System.exit(1);
            main(args);
        }
        if (total <= 0) {
            System.err.println("ERROR: en el valor ingresado debe ser numerico mayor a cero");
            //System.exit(1);
            main(args);
        }


        for (int i = 1; i <= total; i++) {
            salida = String.valueOf(i);
            if (i % 3 == 0) {
                salida = "FIZZ";
            } else {
                if (i % 5 == 0) {
                    salida = "BUZZ";
                }
            }
            if ((i % 3 == 0) && (i % 5 == 0)) {
                salida = "FIZZBUZZ";
            }

            switch (salida) { //Acumula cifras de control
                case "FIZZ":
                    contMult3 += 1;
                    break;
                case "BUZZ":
                    contMult5 += 1;
                    break;
                case "FIZZBUZZ":
                    contMultAmbos += 1;
                    break;
                default:
                    contMultOtros += 1;
            }
            System.out.println(salida);
        }
        System.out.println("************TOTALES************");
        System.out.println("Multiplos 5 :" + new DecimalFormat("###,###,###").format(contMult5));
        System.out.println("Multiplos 3 :" + new DecimalFormat("###,###,###").format(contMult3));
        System.out.println("Multiplos3y5:" + new DecimalFormat("###,###,###").format(contMultAmbos));
        System.out.println("Sin Multipos:" + new DecimalFormat("###,###,###").format(contMultOtros));
        System.out.println("************---------************");


    }
}