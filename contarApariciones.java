public class Main {

    public static int contarApariciones(int[] numeros, int n){
        int contador = 0;
        for(int numero: numeros){
            if (numero == n){
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
    int[] array = {1, 2, 4, 8, 5, 2, 2, 6};
    int suma= contarApariciones(array,2);
        contarApariciones(array, 2);
    System.out.println(suma);
        }
    }
