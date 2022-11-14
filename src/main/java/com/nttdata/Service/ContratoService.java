package com.nttdata.Service;

import com.nttdata.Entity.Cliente;
import com.nttdata.Entity.Contrato;

import java.util.List;

/**
 * Servicio para la gestión de los contratos
 * @author Lorena
 */
public interface ContratoService {
    /**
     * Buscar contrato por Id del cliente
     * @param id Busqueda por id
     * @return {@link Cliente}
     */
    Contrato findById(int id);

    /**
     * Listar todos los contratos
     * @return
     */
    List<Contrato> findAll();

    /**
     * Insertar nuevo contrato
     * @param entity
     */
    void insert(Contrato entity);

    /**
     * Actualizamos datos de los contratos del cliente
     * @param entity
     * @return
     */
    Cliente update (Contrato entity);

    /**
     * Borrar contrato
     * @param entity
     */
    void delete(Contrato entity);

    /**
     * Listar contratos encontrados por el id del cliente
     * @param idCliente
     * @return
     */
    List<Contrato>findByIdCliente(int idCliente);
}
