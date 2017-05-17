package br.com.r39.erp.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class RelogioPonto {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	
	@OneToMany
	private List<Pessoa> Pessoa;
	@OneToMany
	private List<Cliente> Cliente;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar DataHora;
	private String LatLong;
	private String Observacao;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public List<Pessoa> getPessoa() {
		return Pessoa;
	}
	public void setPessoa(List<Pessoa> pessoa) {
		Pessoa = pessoa;
	}
	public List<Cliente> getCliente() {
		return Cliente;
	}
	public void setCliente(List<Cliente> cliente) {
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
