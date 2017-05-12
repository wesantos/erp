package br.com.r39.erp.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.r39.erp.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Cleibison da Silva");
		pessoa.setEmail("c.silva@silva.com");
		pessoa.setObservacao("Usuario Teste");
		
		EntityManagerFactory dbEMF = Persistence.createEntityManagerFactory("erp");
		EntityManager m = dbEMF.createEntityManager();
		
		m.getTransaction().begin();
		m.persist(pessoa);
		m.getTransaction().commit();
		m.close();

	}

}
