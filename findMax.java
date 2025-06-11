Crea una función findMax que reciba un array de enteros y devuelva el valor máximo del array.
public class Main {

    public static int findMax(int[] numeros){
        int valorMaximo= numeros[0];
        for(int i=1;i<numeros.length;i++){
            if(valorMaximo<numeros[i]){
                valorMaximo=numeros[i];
            }
        }
        return valorMaximo;
    }
    public static void main(String[] args) {
    int[] array = {1, 2, 4, 8, 5, 6};
    int ordenados= findMax(array);
        findMax(array);
    System.out.println(ordenados);
        }
    }
