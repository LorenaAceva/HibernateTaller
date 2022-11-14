package com.nttdata.Service;

import com.nttdata.Entity.Cliente;
import com.nttdata.Entity.Dao.ClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementación del servicio
 * Hacemos Comprobaciones
 */
@Service
public class ClienteServiceImp implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;

    @Override
    public Cliente buscarPorId(long id) {
        return clienteDao.searchById(id);

    }

    @Override
    public Cliente buscarPorId(int id) {
        return null;
    }

    @Override
    public List<Cliente> buscarPorNombreYApellido(String nombre, String apellido) {
        if (nombre != null && apellido!= null)
            return clienteDao.findByNameAndLastName(nombre,apellido);
        else
            return null;
    }

    @Override
    public void borrarCliente(Cliente entity) {
        clienteDao.delete(entity);

    }

    @Override
    public Cliente actualizarCliente(Cliente entity) {
        return clienteDao.update(entity);
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return clienteDao.searchAll();
    }

    @Override
    public Cliente crearCliente(Cliente entity) {
        clienteDao.insert(entity);
        return null;
    }

}
