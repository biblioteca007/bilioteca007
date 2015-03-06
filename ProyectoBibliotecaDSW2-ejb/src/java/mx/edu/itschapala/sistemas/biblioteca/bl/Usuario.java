/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.sistemas.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.sistemas.biblioteca.dao.UsuarioDaoLocal;

/**
 *
 * @author Estudiante
 */
@Stateless
public class Usuario implements UsuarioLocal {
    @EJB
    private UsuarioDaoLocal usuarioDao;

    @Override
    public boolean registrar(Usuario usuario) {
        usuarioDao.crear(null);
        return false;
    }

    @Override
    public boolean eliminar(Usuario usuario) {
        usuarioDao.remover(null);
        return false;
    }

    @Override
    public boolean modificar(Usuario usuario) {
        usuarioDao.editar(null);
        return false;
    }

    @Override
    public List<Usuario> getList() {
        usuarioDao.buscarTodo();
                return null;
    }

    @Override
    public Usuario getPorId(int id) {
        usuarioDao.buscarPorId(id);
        return null;
    }
    

    

}
