/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avisos;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author JenniferAdmin
 */
@Named(value = "listarAvisos")
@RequestScoped
public class ListarAvisos {

    public List<Aviso> getListarAvisos() {

        List<Aviso> resultado = new ArrayList<>();
        resultado.add(new Aviso(012, "20:00", "Ciudad Jardín", Aviso.Prioridad.URGENTE, Aviso.Estado.SIN_ATENDER));
        resultado.add(new Aviso(013, "5:00", "El Palo", Aviso.Prioridad.PLANIFICADO, Aviso.Estado.EN_PROCESO));
        resultado.add(new Aviso(014, "12:45", "Centro", Aviso.Prioridad.URGENTE, Aviso.Estado.EN_PROCESO));
        
        return resultado;
    }
}
