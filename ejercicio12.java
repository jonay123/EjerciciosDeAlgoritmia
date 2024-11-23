import java.util.Arrays;
public class Main {

    public static int[] ordenarArray(int[] numeros){
        int[] ordenado=numeros.clone();
        Arrays.sort(ordenado);
        return ordenado;
    }
    public static void main(String[] args) {
    int[] array = {1, 2, 4, 8, 5, 6};
    int[] ordenados= ordenarArray(array);
        ordenarArray(array);
    System.out.println(Arrays.toString(ordenados));
        }
    }
