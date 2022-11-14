package com.nttdata.Entity.Dao;

import com.nttdata.Entity.Contrato;

import java.util.List;

public interface ContratoDao extends commonDao<Contrato>{

    List<Contrato> searchById(int id);


}
