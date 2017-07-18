package br.com.test;

import org.junit.Test;

import br.com.dao.ClienteDao;
import br.com.domain.Cliente;

public class ClienteTest {
	
	@Test
	public void salvar(){
		Cliente c = new Cliente("Maria","maria@gmail.com","mariaa","ariaaa");
		ClienteDao dao = new ClienteDao();
		dao.salvar(c);
	}
}
