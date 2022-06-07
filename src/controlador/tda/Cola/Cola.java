/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.tda.Cola;

import controlador.tda.lista.ListaEnlazada;
import controlador.tda.lista.exception.EstructuraVaciaException;
import controlador.tda.lista.exception.PosicionException;
import controlador.tda.lista.exception.TopeException;

/**
 *
 * @author Gigabyte
 */
public class Cola<E> extends ListaEnlazada<E> {

    private Integer tope;

    public Integer getTope() {
        return tope;
    }

    public Cola() {
    }

    public Cola(Integer tope) {
        this.tope = tope;
    }

    public Boolean estaLLeno() {
        if (tope == 0) {
            return false;
        } else if (tope == getSize().intValue()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Encolar
     */
    public void Queue(E dato) throws TopeException, PosicionException {
        if (!estaLLeno()) {
            insertar(dato, getSize() - 1);
        } else {
            throw new TopeException("La pila está llena");
        }
    }

    public E Dequeue(Integer pos) throws EstructuraVaciaException, PosicionException {
        E auxDato = null;
        if (!estaVacia()) {

            if (pos >= 0 && pos < getSize()) {
                for (int i = 0; i <= pos; i++) {
                    auxDato = eliminarDato(0);
                }
                return auxDato;
            } else {
                throw new PosicionException("Error al realizar la operaciòn DEQUEUE. No existe la posicion dada");
            }
        } else {
            throw new EstructuraVaciaException("La cola està vacia");
        }
    }

//    public static void main(String[] args) {
//        Cola<Integer> cola = new Cola<>(5);
//        
//        try {
//            cola.Queue(4);
//            cola.Queue(1);
//            cola.Queue(6);
//            cola.Queue(10);
//            cola.Queue(2);
//            cola.imprimir();
//            System.out.println("Dato Dequeue "+cola.Dequeue(2));
//            cola.imprimir();
//        } catch (Exception e) {
//            System.out.println("Error "+e);
//        }
//    }
}
