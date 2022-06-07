/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.tablas;

import controlador.tda.Cola.ColaService;
import javax.swing.table.AbstractTableModel;
import modelo.Tickets;

/**
 *
 * @author John
 */
public class TablaTurnos extends AbstractTableModel {

    private ColaService lista;

    public ColaService getLista() {
        return lista;
    }

    public void setLista(ColaService lista) {
        this.lista = lista;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public int getRowCount() {
        return lista.getSize();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nro";
            case 1:
                return "Motivo";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int arg0, int arg1) {
        Tickets turno = (Tickets) lista.obtenerDato(arg0);
        switch (arg1) {
            case 0:
                return turno.getTurno();
            case 1:
                return turno.getMotivo();
            default:
                return null;
        }
    }
}
