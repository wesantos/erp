package br.com.r39.erp.model;

import java.util.Calendar;

public class RelogioPonto {

	private Integer Id;
	private Pessoa Pessoa;
	private Cliente Cliente;
	
	private Calendar DataHora;
	private String LatLong;
	private String Observacao;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Pessoa getPessoa() {
		return Pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		Pessoa = pessoa;
	}
	public Cliente getCliente() {
		return Cliente;
	}
	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	public Calendar getDataHora() {
		return DataHora;
	}
	public void setDataHora(Calendar dataHora) {
		DataHora = dataHora;
	}
	public String getLatLong() {
		return LatLong;
	}
	public void setLatLong(String latLong) {
		LatLong = latLong;
	}
	public String getObservacao() {
		return Observacao;
	}
	public void setObservacao(String observacao) {
		Observacao = observacao;
	}
	
	
}
