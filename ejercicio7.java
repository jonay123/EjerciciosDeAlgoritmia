public class Main {

    public static int sumarElementos(int[] numeros){
        int suma=0;
        for(int i=0; i<numeros.length; i++){
            suma+= numeros[i];
        }
        return suma;
    }
    public static void main(String[] args) {
    int[] array = {1, 2, 4, 8, 5, 6};
    int suma= sumarElementos(array);
        sumarElementos(array);
    System.out.println(suma);
        }
    }
