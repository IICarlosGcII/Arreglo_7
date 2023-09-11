import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10]; //Declaramos el arreglo con 10 espacios
        int ultimo; //Declaramos la variable a utilizar

        System.out.println("Digite los datos del arreglo: ");
        for(int i=0 ; i<10 ; i++){ //Llenamos el arreglo con los numero ingresados
            arreglo[i] = entrada.nextInt(); //Usamos Scanner para guardar
        }

        ultimo = arreglo[9]; //Le decimos al programa que la posicion 9 es la ultima posicion nueva
        for(int i = 8; i>=0 ; i--){ //Corremos los datos hacia la derecha del arreglo
            arreglo[i+1]=arreglo[i]; //La posicion siguiente sera la posicion anterior
        }

        arreglo[0] = ultimo; //Le decimos al programa que la posicion 0 es la primera posicion nueva

        System.out.printf("El arreglo resultante es: ");
        for(int i=0 ; i<10 ; i++){ //Mostramos el arreglo resultante
            System.out.print(arreglo[i]+" - ");
        }
    }
}