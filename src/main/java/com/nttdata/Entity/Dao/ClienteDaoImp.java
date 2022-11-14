package com.nttdata.Entity.Dao;

import com.nttdata.Entity.Cliente;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Método buscar por nombre y apellidos
 * Partimos de los métodos genéricos
 */
@Repository
public abstract class ClienteDaoImp extends CommonDaoImp <Cliente> implements ClienteDao{

    /**Manejador de entidades*/
    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Cliente> findByNameAndLastName(String name, String lastNAme) {

        // Obtención de sesión.
        Session currentSession = entityManager.unwrap(Session.class);

        // Búsqueda de todos los registros.
        List<Cliente> clientes = currentSession.createQuery("FROM Cliente Where nombre '" + name + "' (and primerApellido='" + lastNAme + "' or segundoApellido='" + lastNAme + "')").list();

        currentSession.close();

        return clientes;
    }


}
