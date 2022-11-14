package com.nttdata.Entity.Dao;

import com.mysql.cj.Session;
import com.nttdata.Entity.Contrato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ContratoDaoImp extends CommonDaoImp<Contrato> implements ContratoDao{

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Contrato> searchById(int id) {

        //Obtención de sesión
        Session currentSession= entityManager.unwrap(Session.class);

        //Localiza contratos por el id del cliente
        List<Contrato> contratoList= currentSession.createQuery("From Contrato Where Cliente.id"+id).list();

        //Cierre de sesión
        currentSession.close();

        return contratoList;
    }


}
