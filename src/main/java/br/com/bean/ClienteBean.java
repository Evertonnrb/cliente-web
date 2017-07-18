package br.com.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.dao.ClienteDao;
import br.com.domain.Cliente;

@ManagedBean
@ViewScoped
public class ClienteBean {
	private Cliente cliente= new Cliente();
	private ClienteDao clienteDao = new ClienteDao();
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public ClienteDao getClienteDao() {
		return clienteDao;
	}
	
	public void setClienteDao(ClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}
	
}
