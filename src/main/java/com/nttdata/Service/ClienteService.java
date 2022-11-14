package com.nttdata.Service;

import com.nttdata.Entity.Cliente;

import java.util.List;

/**
 * Servivio para crear la gestión de Cliente
 * @author Lorena
 */
public interface ClienteService {

    /**
     * Búsqueda del cliente por Id
     * @param id Busqueda por id
     * @return  {@link Cliente}
     */

    Cliente buscarPorId(int id);

    /**
     * Buscar por nombre y apellido
     * @param nombre {@link String} nombre del cliente
     * @param apellido {@link String} apellido de l cliente
     * @return
     */
    List<Cliente> buscarPorNombreYApellido(String nombre, String apellido);

    /**
     * Borrado de Cliente
     * @param entity datos del cliente
     */
    void borrarCliente(Cliente entity);

    /**
     * Actualizar datos del Cliente
     * @param entity datos del cliente
     * @return
     */
    Cliente actualizarCliente(Cliente entity);

    /**
     * Obtener datos del cliente
     * @return datos actualizados
     */
    List<Cliente> obtenerClientes();

    /**
     *
     * @param entity
     * @return
     */
    Cliente crearCliente(Cliente entity);
}
