import java.util.Arrays;
public class Main {

    public static void invertirArray(int[] numeros){
        int[] ordenInvertido= new int[numeros.length];
        for(int i=0; i<numeros.length; i++){
         ordenInvertido[i]= numeros[numeros.length-1-i];
        }
        System.out.println(Arrays.toString (ordenInvertido));

    }
    public static void main(String[] args) {
    int[] array = {1, 2, 4, 8, 5, 6};
    invertirArray(array);
        }
    }
