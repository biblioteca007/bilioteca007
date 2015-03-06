/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.sistemas.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.sistemas.biblioteca.dao.AutorDaoLocal;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Autor;

/**
 *
 * @author Estudiante
 */
@Stateless
public class AutorBL implements AutorBLLocal {
    @EJB
    private AutorDaoLocal autorDao;

    @Override    public boolean registrar(Autor autor) {
        autorDao.crear(autor);
        return false;
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean editar(Autor autor) {
        autorDao.editar(autor);
        return false;
    }

    @Override
    public boolean remover(Autor autor) {
        autorDao.remover(autor);
        return false;
    }

    @Override
    public List<Autor> getAutor() {
        autorDao.buscarTodo();
        return null;
    }

    @Override
    public int buscarPorId() {
        autorDao.buscarPorId(this);
        return 0;
    }


    
    
}
