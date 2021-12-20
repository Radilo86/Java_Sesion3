/* Ejercicios tema 3
 * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado
 * final por consola.
 * Tened en cuenta que los textos pueden venir de un array de tipo String.
 * Por ejemplo: String[] nombres = {"", "", "", ""}
 */
public class TemaTres {
    private static String[] cadena = {"Juan", "Antonio", "Felipe", "Rafael", "Rodrigo"};

    public static void main(String[] args) {
        concatenarTextos(cadena);
    }

    public static void concatenarTextos(String[] nombres) {
        String concatenar="";
        for (int i = 0; i < nombres.length; i++) {
            concatenar = concatenar + " " + nombres[i];
        }
        System.out.println(concatenar);
    }
}
