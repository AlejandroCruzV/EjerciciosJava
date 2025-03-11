import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/**
 * DATE WRITTEN 09-03-2024 https://retosdeprogramacion.com/ejercicios
 * #2 - ¿ES UN ANAGRAMA?
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 * las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
public class Anagrama {
    
    public static boolean isAnAnagram(String word1,String word2){
        
        char[] arrayWord1;
        char[] arrayWord2;
        
        //VALIDACIONES DE LOS DATOS DE ENTRADA
        if (word1.equals("") || word2.equals("")) {
            System.err.println("El valor de PARABRA1 y PALABRA2, no debe de ser espacios");
            System.exit(1);
            }
        if (word1.equals(word2)) {
            System.err.println("El valor de PARABRA1 debe ser diferente al valor de PALABRA2");
            System.exit(1);
            }
//CREA ARRAY PARA COMPARAR CARACTERES
        //rrayWord1= new char[word1.length()];
        //arrayWord2= new char[word2.length()];
        arrayWord1= word1.trim().toCharArray();//convierte la palabra a en un arreglo de tipo char
        arrayWord2= word2.trim().toCharArray();//convierte la palabra a en un arreglo de tipo char
        
        System.out.println(Arrays.toString(arrayWord1));//Muesta el array en consola
        System.out.println(Arrays.toString(arrayWord2));//Muesta el array en consola        
        
        System.out.println(arrayWord2);
//ORDENA ARREGLOS
        Arrays.sort(arrayWord1);//ordena el array
        Arrays.sort(arrayWord2);//ordena el array

//VALIDA SI ES ANAGRAMA
        System.out.println(Arrays.toString(arrayWord1)); //Muesta el array ordenado en consola
        System.out.println(Arrays.toString(arrayWord2)); //Muesta el array ordenado en consola
        
        if (Arrays.equals(arrayWord1, arrayWord2)){
            return true;
        }else{
            
        return false;
        }

    }



    public static void main(String[] args) {
        String word1;
        String word2;

        Scanner sc = new Scanner(System.in);

        

        System.out.println("Ingresa el valor para PALABRA1:");
        word1 = sc.nextLine();
        word1 = word1.toLowerCase();// convierte a minusculas
        System.out.println("Ingresa el valor para PALABRA2 diferente a PALABRA1:");
        word2 = sc.nextLine();
        word2 = word2.toLowerCase(); // convierte a minusculas
//RESGRESARA TRUE O FALSE, EJECUTANDO EL METODO ES_ANAGRAMA
        if (isAnAnagram(word1, word2)){;
            System.out.println("LAS PALABRAS:"+word1+" Y "+word2+" SON UN ANAGRAMA");
        }else{
            System.out.println("LAS PALABRAS:"+word1+" Y "+word2+" NO SON UN ANAGRAMA");
        }
    }

}

