import java.util.Arrays;
public class Main {

    public static int[] encontrarMayorYMenor(int[] numeros){
        int numeroMayor= numeros [0];
        int numeroMenor= numeros [0];
        for(int i=0; i<numeros.length; i++){
            if(numeroMayor < numeros[i]){
                numeroMayor= numeros[i];
            }
            if(numeroMenor > numeros[i]){
                numeroMenor= numeros[i];
            }
        }
        return new int[]{numeroMayor, numeroMenor};
    }
    public static void main(String[] args) {
    int[] array = {1, 2, 4, 8, 5, 6};
    int[] picos= encontrarMayorYMenor(array);
        encontrarMayorYMenor(array);
    System.out.println(Arrays.toString(picos));
        }
    }
