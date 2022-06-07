/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package controlador.tda.lista.exception;

import java.io.IOException;

/**
 *
 * @author Gigabyte
 */
public class EstructuraVaciaException extends IOException {

    /**
     * Creates a new instance of <code>PilaVaciaException</code> without detail
     * message.
     */
    public EstructuraVaciaException() {
    }

    /**
     * Constructs an instance of <code>PilaVaciaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EstructuraVaciaException(String msg) {
        super(msg);
    }
}
