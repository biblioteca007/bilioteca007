/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.sistemas.biblioteca.bl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.sistemas.biblioteca.dao.CategoriaDaoLocal;

/**
 *
 * @author Estudiante
 */
@Stateless
public class Categoria implements CategoriaLocal {
    @EJB
    private CategoriaDaoLocal categoriaDao;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean registar(Categoria categoria) {
        categoriaDao.crear(null);
        return false;
    }

    @Override
    public boolean editar(Categoria categoria) {
        categoriaDao.editar(null);
        return false;
    }

    @Override
    public boolean remover(Categoria categoria) {
        categoriaDao.remover(null);
        return false;
    }

    @Override
    public int buscartodo() {
        categoriaDao.buscarTodo();
        return 0;
    }

    @Override
    public int buscarPorId() {
        categoriaDao.buscarPorId(this);
        return 0;
    }
    
}
