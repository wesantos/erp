package br.com.r39.erp.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.r39.erp.model.Cliente;
import br.com.r39.erp.model.Pessoa;
import br.com.r39.erp.model.RelogioPonto;
import br.com.r39.erp.model.TipoMarcacao;

public class TestePessoa {

	public static void main(String[] args) {
		EntityManagerFactory dbEMF = Persistence.createEntityManagerFactory("erp");
		EntityManager em = dbEMF.createEntityManager();

		List<Pessoa> ListaPessoas = new ArrayList<>();
		ListaPessoas.add(new Pessoa("Cleibison da Silva","c.silva@silva.com","Usuario Teste"));
		ListaPessoas.add(new Pessoa("Joao da Silva","j.silva@silva.com","Usuario Teste"));
		ListaPessoas.add(new Pessoa("Pedro da Silva","p.silva@silva.com","Usuario Teste"));
		ListaPessoas.add(new Pessoa("Costa da Santos","c.santos@silva.com","Usuario Teste"));
		ListaPessoas.add(new Pessoa("Barabara da Silva","b.silva@silva.com","Usuario Teste"));
		ListaPessoas.add(new Pessoa("Tayane da Silva","t.silva@silva.com","Usuario Teste"));
		
		List<Cliente> ListaClientes = new ArrayList<>();
		ListaClientes.add(new Cliente("Walmart","63.304621, -76.750488","Estados Unidos","Super Mercado"));
		ListaClientes.add(new Cliente("Exxonmobil","47.649034, -81.979980","Estados Unidos","Moto Club"));
		ListaClientes.add(new Cliente("Google","47.890232, -111.730957","Estados Unidos","Tecnologia"));
		ListaClientes.add(new Cliente("Microsoft","56.890232, -111.730957","Estados Unidos","Super Mercado"));
		ListaClientes.add(new Cliente("Petrochina","33.304621, -76.750488","China","Super Mercado"));
		ListaClientes.add(new Cliente("Johnson & Johnson","43.304621, -76.750488","Estados Unidos","Super Mercado"));
		ListaClientes.add(new Cliente("Novartis","02.304621, -76.750488","Suiça","Super Mercado"));
		
		
		em.getTransaction().begin();
		
		for (Pessoa p : ListaPessoas) {
			em.persist(p);		
		}
		for (Cliente c : ListaClientes) {
			em.persist(c);	
			
		}
				
		RelogioPonto PontoInicio = new RelogioPonto();
		PontoInicio.setDataHora(Calendar.getInstance());
		PontoInicio.setCliente(em.find(Cliente.class,3));
		PontoInicio.setPessoa(em.find(Pessoa.class, 2));
		PontoInicio.setMarcacao(TipoMarcacao.INICIO);
		PontoInicio.setLatLong(em.find(Cliente.class,3).getLatLong());
		
		RelogioPonto PontoAlmoco = new RelogioPonto();
		PontoAlmoco.setDataHora(Calendar.getInstance());
		PontoAlmoco.setCliente(em.find(Cliente.class,3));
		PontoAlmoco.setPessoa(em.find(Pessoa.class, 2));
		PontoAlmoco.setMarcacao(TipoMarcacao.ALMOCO);
		PontoAlmoco.setLatLong(em.find(Cliente.class,3).getLatLong());
		
		
		em.persist(PontoInicio);
		em.persist(PontoAlmoco);
		
		em.getTransaction().commit();
		em.close();		

	}

}
