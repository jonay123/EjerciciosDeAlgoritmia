5. Implementar en Java un método imagen Espejo que recibe un array de números enteros y devuelve un nuevo array donde primero aparecen los elementos del array inicial seguidos por esos mismos elementos en orden inverso. El array deberá tener al menos un elemento.

Ejemplos de uso:

imagenEspejo ([1,2]) --> [1,2,2,1]

imagenEspejo([1,2,6,7,6]) --> [1,2,6,7,6,6,7,6,2,1]

imagenEspejo ([2]) --> [2,2]

import java.util.Arrays;
public class Main {
    public static int[] imagenEspejo(int[] numeros) {
        int[] nuevoArray= new int[numeros.length*2];
        int n= numeros.length;
        for(int i=0; i<numeros.length; i++){
            nuevoArray[i]= numeros[i];
        }
        for(int i=0; i<n; i++){
            nuevoArray[n+i]= numeros[numeros.length-1-i];
        }
        return nuevoArray;
    }
    public static void main(String[] args) {
    int[] manolo={1, 2, 3, 4, 5, 6};
    System.out.println(Arrays.toString(imagenEspejo(manolo)));
        }
    }
