public class Main {

    public static void encontrarMaximo(int[] numeros){
        int numeroMasAlto= numeros[0];
        for (int numero : numeros){
            if (numero > numeroMasAlto){
                numeroMasAlto= numero;
            }
        }
        System.out.println(numeroMasAlto);
    }
    public static void main(String[] args) {
    int[] array = {1, 2, 4, 8, 5, 6};
    encontrarMaximo(array);
        }
    }
