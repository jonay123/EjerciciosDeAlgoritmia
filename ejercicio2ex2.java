2. Implementa en Java un método aNum que, dado un array de caracteres que tiene el formato de un NIF, devuelva el número entero correspondiente al NIF sin la letra. Ten en cuenta que el array tiene el formato de un NIF (ocho dígitos seguidos de una letra mayúscula que no es la Ñ).

Ejemplos de uso:

aNum(['0','8','9','2','8','8','6','7','Z']) - 8928867 aNum(['0',' 0','0','0','0','0','2','4','R']) → 24

Se puede usar la siguiente función:

static int aDigito (char caracter) { return caracter - '0';

}

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
    static int aDigito(char caracter){
    return caracter-'0';
    }

    public static int aNum(char[] numeroNIF){
        int numeroEntero=0;
        if(tieneFormatoNIF(numeroNIF)==true){
            for(int i=0; i<numeroNIF.length-1; i++){
                numeroEntero= numeroEntero * 10 + aDigito(numeroNIF[i]);
                }
            }
        return numeroEntero;
        }



    public static void main(String[] args) {
    char[] manolo={'0', '2', '3', '4', '9', '5', '7', '8', 'S'};
    System.out.println(aNum(manolo));
        }
    }
