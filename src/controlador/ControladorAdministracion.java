package controlador;

import excepcion.DAOException;
import modelo.dao.impl.ProyectoDAO;
import modelo.entidades.Proyecto;

import java.util.ArrayList;
import java.util.List;

public class ControladorAdministracion {

    ProyectoDAO proyectoDAO;

    public ControladorAdministracion(ProyectoDAO proyectoDAO) {
        this.proyectoDAO = proyectoDAO;
    }

    public void crearProyecto(String nombre, String descripcion) throws DAOException {
        Proyecto proyecto = new Proyecto(nombre, descripcion);
        proyectoDAO.guardar(proyecto);
    }

}
