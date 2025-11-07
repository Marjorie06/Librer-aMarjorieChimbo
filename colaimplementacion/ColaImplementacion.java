/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.colaimplementacion;

import java.util.Scanner;

/**
 *
 * @author MARJORIE
 */
public class ColaImplementacion {

    public static void main(String[] args) {
          Cola cola = new Cola();
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println(" METODO COLA ");
            System.out.println("1. Encolar");
            System.out.println("2. DesencolarNodo");
            System.out.println("3. Ver frente (peek)");
            System.out.println("4. Mostrar cola");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese un dato del nodo: ");
                    int dato = sc.nextInt();
                    cola.encolar(dato);
                    cola.mostrar();
                }
                case 2 -> {
                    if (cola.isEmpty()) {
                        System.out.println("La cola esta vacia");
                    } else {
                        int valor = cola.desencolarNodo();
                        System.out.println("Se desencolo el elemento del nodo: " + valor);
                        cola.mostrar();
                    }
                }
                case 3 -> {
                    if (cola.isEmpty()) {
                        System.out.println("La cola esta vacia");
                    } else {
                        System.out.println("Elemento al frente: " + cola.peek());
                    }
                }
                case 4 -> cola.mostrar();
                case 0 -> System.out.println("FIN");
                default -> System.out.println("Opcion no valida");
            }
        }
        sc.close();
    }
}
        