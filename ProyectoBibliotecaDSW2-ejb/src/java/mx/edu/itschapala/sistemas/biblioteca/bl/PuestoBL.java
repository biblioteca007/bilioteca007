/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.sistemas.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.sistemas.biblioteca.dao.PuestoDaoLocal;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Puesto;

/**
 *
 * @author Estudiante
 */
@Stateless
public class PuestoBL implements PuestoBLLocal {
    @EJB
    private PuestoDaoLocal puestoDao;

    @Override
    public boolean registrar(Puesto puesto) {
        puestoDao.crear(puesto);
        return false;
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean editar(Puesto puesto) {
        puestoDao.editar(puesto);
        return false;
    }

    @Override
    public boolean remover(Puesto puesto) {
        puestoDao.remover(puesto);
        return false;
    }

    @Override
    public List<Puesto> getList() {
        puestoDao.buscarTodo();
        return null;
    }

    @Override
    public Puesto getPorId(int id) {
        
        return puestoDao.buscarPorId(id);
    }


    }

    
    
    

