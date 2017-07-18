package br.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.domain.Cliente;

public class ClienteDao {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("cliente-web");
	private EntityManager manager = factory.createEntityManager();
	
	public void salvar(Cliente c){
		c = new Cliente();
		c.setNome(c.getNome());
		c.setEmial(c.getEmial());
		c.setLogin(c.getLogin());
		c.setSenha(c.getSenha());
		manager.persist(c);
		manager.close();
		
	}
	
	
}
