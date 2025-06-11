1. Implementa en Java un método tiene FormatoNIF que recibe un array de caracteres y devuelve true si los elementos del array
  tienen el formato de un NIF (ocho dígitos y una letra mayúscula, no Ñ, al final), y false en caso contrario.
  import java.util.Arrays;
public class Main {
    static boolean esLetraMayuscula(char caracter) {
        return 'A' <= caracter && caracter <= 'Z';
    }

    static boolean esDigito(char caracter) {
        return '0' <= caracter && caracter <= '9';
    }


    public static boolean tieneFormatoNIF(char[] nif) {
        if (nif.length == 9) {
            for (int i = 0; i < nif.length - 1; i++) {
                if (esDigito(nif[i]) && esLetraMayuscula(nif[8]) && nif[8] != 'Ñ') {
                    return true;
                }
            }
        }return false;
}
    public static void main(String[] args) {
    char[] manolo={'1', '2', '3', '4', '9', '5', '7', '8', 'S'};
    System.out.println(tieneFormatoNIF(manolo));
        }
    }
