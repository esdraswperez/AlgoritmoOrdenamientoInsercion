
import java.util.Scanner;

/* 
Algoritmo de Ordenamiento por el Método de Inserción
Por Esdras Pérez
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, posicion, auxiliar;

        System.out.print("Digite el numero de elementos del arreglo: ");
        nElementos = entrada.nextInt(); // Guarda la cantidad de elementos del usuario
        arreglo = new int[nElementos]; // Asigna el numero de elementos al arreglo

        // Llenado del arreglo
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        // Ordenamiento por Inserción
        for (int i = 0; i < nElementos; i++) {
            posicion = i;
            auxiliar = arreglo[i];

            while ((posicion > 0) && (arreglo[posicion - 1] > auxiliar)) {
                arreglo[posicion] = arreglo[posicion-1];
                posicion--;
            }
            arreglo[posicion] = auxiliar;
        }
        
        // Muestra el arreglo en orden Ascendente
        System.out.println("\nArreglo en orden Ascendente");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i]+" - ");
        }
        
        // Muestra el arreglo en orden Descendente
        System.out.println("\nArreglo en orden Descendente");
        for (int i = (nElementos-1); i >= 0; i--) {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
    }
}
