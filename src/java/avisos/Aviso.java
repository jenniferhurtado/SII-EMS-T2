/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avisos;

/**
 *
 * @author JenniferAdmin
 */
public class Aviso {

    private int id;
    private String fecha;
    private String ubicacion;

    public enum Prioridad {
        URGENTE, PLANIFICADO
    };
    private Prioridad prioridad;

    public enum Estado {
        SIN_ATENDER, EN_PROCESO
    };
    private Estado estado;

    public Aviso(int id, String fecha,
            String ubicacion, Prioridad prioridad,
            Estado estado) {
        this.id = id;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.prioridad = prioridad;
        this.estado = estado;

    }
   
}
