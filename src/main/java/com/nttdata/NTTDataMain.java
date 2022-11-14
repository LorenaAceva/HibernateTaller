package com.nttdata;

import ch.qos.logback.core.net.server.Client;
import com.nttdata.Entity.Cliente;
import com.nttdata.Entity.Contrato;
import com.nttdata.Service.ClienteService;
import com.nttdata.Service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;

import java.util.Date;
import java.util.List;

/**
 * Formación - Hibernate - Ejemplo
 * 
 * Clase principal
 * 
 * @author NTT Data Sevilla
 *
 */
@SpringBootApplication
public class NTTDataMain implements CommandLineRunner {

	@Autowired
	private ClienteService clienteService;
	private ContratoService contratoService;

	/**
	 * Método principal
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(NTTDataMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Lorena");
		cliente1.setPrimerApellido("Acedo");
		cliente1.setSegundoApellido("Vázquez");
		cliente1.setDocumentoEntidad("123456789");

		Cliente cliente2 = new Cliente();
		cliente2.setNombre("Virginia");
		cliente2.setPrimerApellido("Bellido");
		cliente2.setSegundoApellido("Vázquez");
		cliente2.setDocumentoEntidad("123456543");


		clienteService.crearCliente(cliente1);
		clienteService.crearCliente(cliente2);

		List<Cliente> listaClientes = clienteService.obtenerClientes();
		System.out.println("Lista Clientes");
		for (Cliente cliente : listaClientes) ;
		{
			System.out.println(cliente1);

			cliente1.setDocumentoEntidad("345654345");
			clienteService.actualizarCliente(cliente1);

			listaClientes = clienteService.obtenerClientes();
			System.out.println("Lista Actualizada");
			for (Cliente cliente : listaClientes) ;
			{
				System.out.println(cliente1);
			}


			Contrato contrato=new Contrato();
			contrato.setCliente((cliente1));
			contrato.getFechaVigencia(new Date());
			contrato.getPrecioMensual(5.1d);
		}
	}
}