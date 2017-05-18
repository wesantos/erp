package br.com.r39.erp.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.r39.dao.PessoaDAO;
import br.com.r39.erp.model.Pessoa;

public class TestePessoaDAO {

	public static void main(String[] args) {

		EntityManagerFactory dbEMF = Persistence.createEntityManagerFactory("erp");
		EntityManager em = dbEMF.createEntityManager();
		
		PessoaDAO pessoaDao = new PessoaDAO(em);
		
		em.getTransaction().begin();
		List<Pessoa> lp = pessoaDao.lista();
		for (Pessoa pessoa : lp) {
			System.out.println(pessoa.getNome());
		}
		
		em.getTransaction().commit();
		em.close();
		
	}

}
