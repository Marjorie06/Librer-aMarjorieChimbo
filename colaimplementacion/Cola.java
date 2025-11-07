/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.colaimplementacion;

/**
 *
 * @author MARJORIE
 */
public class Cola {

    private Nodo frente;
    private Nodo ultimo;
    private int tamano;

    public Cola() {
    }

    public boolean encolar(int dato) {
        Nodo nuevo = new Nodo(dato);
        boolean resp = false;
        if (isEmpty()) {
            frente = nuevo;
            ultimo = nuevo;
            resp = true;
        } else {
            ultimo.siguiente = nuevo; //
            ultimo = nuevo;
            resp = true;
        }
        return true;
    }

    public int desencolarNodo() {
        if (isEmpty()) {
            System.out.println("La cola esta vacia: no se puede desencolarNodo");
        }
        int valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null) { // si quitamos el último, actualizamos (ultimo)
            ultimo = null;
        }
        return valor;
    }

    public boolean isEmpty() {
        boolean resp = false;
        if (frente == null) {
            resp = true;
        }
        return resp;

    }

    public int peek() {
        return frente.dato;
    }

    public void mostrar() {
        if (isEmpty()) {
            System.out.println("Cola vacia");

        } else {
            Nodo actual = frente;
            System.out.print("Elementos en la cola: ");
            while (actual != null) {
                System.out.print(actual.dato + " ");
                actual = actual.siguiente;
            }
            
        }
    }
}
