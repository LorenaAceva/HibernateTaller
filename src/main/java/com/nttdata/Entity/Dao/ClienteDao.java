package com.nttdata.Entity.Dao;


import com.nttdata.Entity.Cliente;

import java.util.List;

/**
 *
 */
public interface ClienteDao extends commonDao<Cliente>{
    List<Cliente> findByNameAndLastName(String name, String lastNAme);


}

