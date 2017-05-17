package br.com.r39.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Cliente {
	
	public Cliente(){
		super();
	}
	public Cliente(String nome,String latLong, String endereco,String observacao){
		this.setNome(nome);
		this.setLatLong(latLong);
		this.setEndereco(endereco);
		this.setObservacao(observacao);
	}
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	private String Nome;
	private String LatLong;
	private String Endereco;
	private String Observacao;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getLatLong() {
		return LatLong;
	}
	public void setLatLong(String latLong) {
		LatLong = latLong;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getObservacao() {
		return Observacao;
	}
	public void setObservacao(String observacao) {
		Observacao = observacao;
	}
	
}
