/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.sistemas.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.sistemas.biblioteca.dao.EmpleadoDaoLocal;

/**
 *
 * @author Estudiante
 */
@Stateless
public class Empleado implements EmpleadoLocal {
    @EJB
    private EmpleadoDaoLocal empleadoDao;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean registrar(Empleado empleado) {
        empleadoDao.crear(null);
        return false;
    }

    @Override
    public boolean editar(Empleado empleado) {
        empleadoDao.editar(null);
        return false;
    }

    @Override
    public boolean remover(Empleado empleado) {
    empleadoDao.remover(null);
        return false;
    }

    @Override
    public List<Empleado> getList() {
        empleadoDao.buscarTodo();
        return null;
    }

    @Override
    public int BuscarPorId() {
        empleadoDao.buscarPorId(this);
        return 0;
    }
    
}
