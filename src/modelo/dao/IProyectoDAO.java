package modelo.dao;

import excepcion.DAOException;
import modelo.entidades.Proyecto;

import java.util.List;

public interface IProyectoDAO {
    public void guardar(Proyecto proyecto) throws DAOException;
    public void eliminar(int id)throws DAOException;
    public void modificar(Proyecto proyecto)throws DAOException;
    public Proyecto recuperar(int id)throws DAOException;
    public List<Proyecto> recuperarTodos()throws DAOException;
}
