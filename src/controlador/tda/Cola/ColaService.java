/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.tda.Cola;

import controlador.tda.lista.exception.EstructuraVaciaException;
import controlador.tda.lista.exception.PosicionException;

/**
 *
 * @author Gigabyte
 */
public class ColaService<E> {

    private Cola<E> cola;

    public ColaService(Integer tope) {
        cola = new Cola<>(tope);
    }

    public ColaService() {
    }

    public Boolean Queue(E dato) {
        try {
            cola.Queue(dato);
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public E Dequeue(Integer pos) {
        try {
            return cola.Dequeue(pos);

        } catch (EstructuraVaciaException | PosicionException e) {
        }
        return null;
    }

//    public void imprimir() {
//        try {
//            cola.imprimir();
//        } catch (Exception e) {
//        }
//    }

    public E obtenerDato(Integer pos) {
        try {
            return cola.obtenerDato(pos);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public Integer getSize() {
        return cola.getSize();
    }

    public Integer getTope() {
        return cola.getTope();
    }
}
