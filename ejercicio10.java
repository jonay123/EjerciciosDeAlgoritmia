public class Main {

    public static int calcularPromedio(int[] numeros){
        int suma=0;
        int longitud= numeros.length;
        int promedio=0;
        for(int i=0; i<numeros.length;i++){
            suma+= numeros[i];
        }
        promedio= suma/longitud;
        return promedio;
    }
    public static void main(String[] args) {
    int[] array = {1, 2, 4, 8, 5, 6};
    int promedio= calcularPromedio(array);
        calcularPromedio(array);
    System.out.println(promedio);
        }
    }
