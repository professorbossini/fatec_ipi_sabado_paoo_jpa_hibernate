package br.com.bossini.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.bossini.model.bean.Usuario;
import br.com.bossini.model.repository.JPAUtil;

public class TesteAtualizaUsuario {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Usuario u = manager.find(Usuario.class, 1L);
		
		u.setNome(u.getNome() + " da Silva");
		u.setEmail("josedasilva@email.com");
		
		transaction.commit();
		
		manager.close();
		JPAUtil.close();
	}
}
