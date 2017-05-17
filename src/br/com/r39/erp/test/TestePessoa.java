package br.com.r39.erp.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.r39.erp.model.Cliente;
import br.com.r39.erp.model.Pessoa;
import br.com.r39.erp.model.RelogioPonto;

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
		ListaClientes.add(new Cliente("Walmart","Estados Unidos","63.304621, -76.750488","Super Mercado"));
		ListaClientes.add(new Cliente("Exxonmobil","Estados Unidos","47.649034, -81.979980",""));
		ListaClientes.add(new Cliente("Google","Estados Unidos","47.890232, -111.730957","Tecnologia"));
		ListaClientes.add(new Cliente("Microsoft","Estados Unidos","56.890232, -111.730957","Super Mercado"));
		ListaClientes.add(new Cliente("Petrochina","China","33.304621, -76.750488","Super Mercado"));
		ListaClientes.add(new Cliente("Johnson & Johnson","Estados Unidos","43.304621, -76.750488","Super Mercado"));
		ListaClientes.add(new Cliente("Novartis","Suiça","02.304621, -76.750488","Super Mercado"));
		
		
		em.getTransaction().begin();
		for (Pessoa p : ListaPessoas) {
			em.persist(p);		
		}
		for (Cliente c : ListaClientes) {
			em.persist(c);	
			
		}
		
		ListaClientes.clear();
		ListaClientes.add(em.find(Cliente.class,3));
		ListaClientes.add(em.find(Cliente.class,2));
		ListaClientes.add(em.find(Cliente.class,6));
		ListaPessoas.clear();
		ListaPessoas.add(em.find(Pessoa.class, 1));
		ListaPessoas.add(em.find(Pessoa.class, 2));
		ListaPessoas.add(em.find(Pessoa.class, 6));
				
		Date date = new Date();
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(date);
		
		RelogioPonto Ponto = new RelogioPonto();
		Ponto.setDataHora(cal);
		Ponto.setCliente(ListaClientes);
		Ponto.setPessoa(ListaPessoas);
		Ponto.setLatLong("");
		em.persist(Ponto);
		em.getTransaction().commit();
		em.close();
		
		
		

	}

}
