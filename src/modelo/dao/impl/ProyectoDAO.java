package modelo.dao.impl;

import excepcion.DAOException;
import modelo.dao.IProyectoDAO;
import modelo.entidades.Proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ProyectoDAO implements IProyectoDAO {
    @Override
    public void guardar(Proyecto proyecto) throws DAOException {
        try {
            //1.-Levantar el driver de la base de datos
            Class.forName("org.h2.Driver");

            //2.- Conectar a la base de datos
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

            //3.- Operar sobre la base de datos. Ya sea consultar o modificar datos
            Statement statement = connection.createStatement();

            //TODO
            String sql = "INSERT INTO PERSONAS VALUES("+","+proyecto.getNombre()+")";

            //4.- Ingresar datos
            int cantRegistros = statement.executeUpdate("INSERT INTO PERSONAS VALUES(" + persona.getId() + ", '" + persona.getNombre() + "', '" + persona.getApellido() + "', '" + persona.getTelefono() + "')");


            //5.- Evaluar resultado
            if(cantRegistros > 0)
                System.out.println("Se ha guardado una nueva persona");

            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new DAOException("PersonaDAO.Guardar: " + e.getMessage());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new DAOException("PersonaDAO.Guardar: " + throwables.getMessage());
        }

    }

    @Override
    public void eliminar(int id) throws DAOException {

    }

    @Override
    public void modificar(Proyecto persona) throws DAOException {

    }

    @Override
    public Proyecto recuperar(int id) throws DAOException {
        return null;
    }

    @Override
    public List<Proyecto> recuperarTodos() throws DAOException {
        return null;
    }
}
