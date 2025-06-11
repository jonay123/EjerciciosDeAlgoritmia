Implementar en Java un método esNIFCorrecto que, dado un array de caracteres de cualquier tamaño y contenido, devuelve true si dicho array representa un NIF correcto y false en caso contrario.

Se deberá usar la función tiene FormatoNIF que dado un número entre 0 y 22 devuelve la letra mayúscula correspondiente según la tabla anterior.

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
        }
        return false;
    }

    static int aDigito(char caracter) {
        return caracter - '0';
    }

    public static int aNum(char[] numeroNIF) {
        int numeroEntero = 0;
        if (tieneFormatoNIF(numeroNIF) == true) {
            for (int i = 0; i < numeroNIF.length - 1; i++) {
                numeroEntero = numeroEntero * 10 + aDigito(numeroNIF[i]);
            }
        }
        return numeroEntero;
    }

    public static char esNIFCorrecto(char[] numeros) {
        int resto = 0;
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        if (tieneFormatoNIF(numeros) == true) {
            resto = (aNum(numeros)) % 23;

        }

        return letras[resto-1];
    }


    public static void main(String[] args) {
    char[] manolo={'0', '2', '3', '7', '0', '0', '4', '0', 'S'};
    System.out.println(esNIFCorrecto(manolo));
        }
    }
