package com.nttdata.Entity.Dao;

import com.nttdata.Entity.AbstractEntity;
import com.nttdata.Entity.Cliente;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.lang.reflect.ParameterizedType;
import java.util.List;


/**
 * CRUD GENERICO DESARROLLADO
 *
 * @param <T>
 */
@Repository
public abstract class CommonDaoImp <T extends AbstractEntity> implements commonDao<T>{

    /**
     * Tipo de clase
     */
    private Class<T> entityClass;

    /**
     * Manejador de entidades
     */
    @Autowired
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public void CommonDaoImpl() {
        setEntityClass((Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
    }


    @Override
    @Transactional
    public void insert(T paramT) {
        // Obtención de sesión.
        Session currentSession = entityManager.unwrap(Session.class);

        // Insercción.
        currentSession.save(paramT);

        // Cierre de sesión.
        currentSession.close();

    }

    @Override
    @Transactional
    public Cliente update(T paramT) {
        // Obtención de sesión.
        Session currentSession = entityManager.unwrap(Session.class);

        // Insercción.
        currentSession.saveOrUpdate(paramT);

        // Cierre de sesión.
        currentSession.close();
        return null;
    }

    @Override
    @Transactional
    public void delete(T paramT) {
        // Obtención de sesión.
        Session currentSession = entityManager.unwrap(Session.class);

        // Insercción.
        currentSession.delete(paramT);

        // Cierre de sesión.
        currentSession.close();
    }

    @Override
    @Transactional
    public T searchById(Long id) {
        // Obtención de sesión.
        Session currentSession = entityManager.unwrap(Session.class);

        // Búsqueda por PK.
        T result = currentSession.get(this.entityClass, id);

        // Cierre de sesión.
        currentSession.close();
        return result;
    }

    @Override
    @Transactional
    public List<T> searchAll() {
        // Obtención de sesión.
        Session currentSession = entityManager.unwrap(Session.class);

        // Búsqueda de todos los registros.
        List<T> list = currentSession.createQuery("FROM " + this.entityClass.getName()).list();

        // Cierre de sesión.
        currentSession.close();

        return list;
    }

    public Class<T> getEntityClass() {
        return entityClass;
    }

    public void setEntityClass(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
}
