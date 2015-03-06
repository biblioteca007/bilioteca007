/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.itschapala.sistemas.biblioteca.bl;

import javax.ejb.Local;

/**
 *
 * @author Estudiante
 */
@Local
public interface CategoriaLocal {

    boolean registar(Categoria categoria);

    boolean editar(Categoria categoria);

    boolean remover(Categoria categoria);

   

    int buscartodo();

    int buscarPorId();
    
}
