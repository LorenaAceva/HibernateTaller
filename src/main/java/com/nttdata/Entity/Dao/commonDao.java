package com.nttdata.Entity.Dao;

import com.nttdata.Entity.Cliente;

import java.util.List;

public interface commonDao <T>{

    //Crud Genérico

    public void insert(final T paramT);

    /**
     * Actualiza el registro en la BBDD
     *
     * @param paramT
     * @return
     */
    public Cliente update(final T paramT);

    /**
     * Borra el Registro en la BBDD
     * @param paramT
     */
    public void delete(final T paramT);

    /**
     *
     * @param id
     * @return
     */
    public T searchById(final Long id);

    /**
     * Búsqueda de todos los registros en BBDD.
     *
     * @return List<T>
     */
    public List<T> searchAll();

}

