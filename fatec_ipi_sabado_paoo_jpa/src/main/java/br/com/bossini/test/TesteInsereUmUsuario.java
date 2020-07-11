package br.com.bossini.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.bossini.model.bean.Usuario;
import br.com.bossini.model.repository.JPAUtil;

public class TesteInsereUmUsuario {
	
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Usuario u = new Usuario ();
		u.setNome("Jose");
		u.setFone("11223344");
		u.setEmail ("jose@email.com");
		
		manager.persist(u);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
