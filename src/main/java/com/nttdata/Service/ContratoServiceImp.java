package com.nttdata.Service;

import com.nttdata.Entity.Cliente;
import com.nttdata.Entity.Contrato;
import com.nttdata.Entity.Dao.ContratoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ContratoServiceImp implements ContratoService{

    @Autowired
    private ContratoDao contratoDao;

    @Override
    @Transactional
    public Contrato findById(int id) {
        return (Contrato) contratoDao.searchById(id);
    }

    @Override
    @Transactional
    public List<Contrato> findAll() {
        return contratoDao.searchAll();
    }

    @Override
    @Transactional
    public void insert(Contrato entity) {
        contratoDao.insert(entity);

    }

    @Override
    @Transactional
    public Cliente update(Contrato entity) {
        return contratoDao.update(entity);
    }

    @Override
    @Transactional
    public void delete(Contrato entity) {
        contratoDao.delete(entity);

    }

    @Override
    @Transactional
    public List<Contrato> findByIdCliente(int idCliente) {
        return (List<Contrato>) contratoDao.searchById(idCliente);
    }
}
