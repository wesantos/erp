package br.com.r39.erp.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class RelogioPonto {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	
	@ManyToOne
	private Pessoa Pessoa;
	@ManyToOne
	private Cliente Cliente;
	@Enumerated(EnumType.STRING)
	private TipoMarcacao Marcacao;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar DataHora;
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
	private String LatLong;
	private String Observacao;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
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
	public TipoMarcacao getMarcacao() {
		return Marcacao;
	}
	public void setMarcacao(TipoMarcacao marcacao) {
		Marcacao = marcacao;
	}
	
	
}
