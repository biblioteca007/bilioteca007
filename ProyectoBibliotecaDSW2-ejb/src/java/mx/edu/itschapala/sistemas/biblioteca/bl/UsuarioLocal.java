/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.sistemas.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Estudiante
 */
@Local
public interface UsuarioLocal {

    boolean registrar(Usuario usuario);

    boolean eliminar(Usuario usuario);

    boolean modificar(Usuario usuario);

    List<Usuario> getList();

    Usuario getPorId(int id);
    
}
