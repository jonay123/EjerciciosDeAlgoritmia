Escribe una función countEven que reciba un array de enteros y devuelva la cantidad de números pares en el array.
public class Main {

    public static int countEven(int[] numeros){
        int numerosPares= 0;
        for(int i=0; i<numeros.length; i++){
            if(numeros[i] % 2 ==0){
                numerosPares++;
            }
        }
        return numerosPares;
    }
    public static void main(String[] args) {
    int[] array = {1, 2, 4, 8, 5, 6};
    int ordenados= countEven(array);
        countEven(array);
    System.out.println(ordenados);
        }
    }
