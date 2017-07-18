package br.com.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private static EntityManagerFactory factory;
	
	static {
		factory = Persistence.createEntityManagerFactory("cliente-web");
	}
	
	public static EntityManager getFactory() {
		return factory.createEntityManager();
	}
}
