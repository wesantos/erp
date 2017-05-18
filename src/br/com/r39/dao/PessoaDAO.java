package br.com.r39.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import br.com.r39.erp.model.Pessoa;

public class PessoaDAO {

	private EntityManager manager;
	
	public PessoaDAO(EntityManager em){
		this.manager = em;
	}
	
	public Pessoa localizar(Integer id){
		return manager.find(Pessoa.class, id);
	}
	
	public void adiciona(Pessoa pessoa) {
		manager.persist(pessoa);
	}

		public void remove(Integer id) {
			manager.remove(localizar(id));
	}

		public void altera(Pessoa pessoa) {
			manager.merge(pessoa);
	}
		
		public List<Pessoa> lista() {
			CriteriaQuery<Pessoa> criteria = manager.getCriteriaBuilder().createQuery(Pessoa.class);
		    criteria.select(criteria.from(Pessoa.class));
			return manager.createQuery(criteria).getResultList();
		}

		
}
