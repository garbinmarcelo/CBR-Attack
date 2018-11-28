package models;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class HostnameOrigem {

	private Integer id;
	private String titulo;

	public HostnameOrigem() {
	}

	public HostnameOrigem(Integer id, String titulo) {
		this.id = id;
		this.titulo = titulo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return this.id + " - " + this.titulo;
		//return this.titulo;
	}

	private ArrayList<HostnameOrigem> hostnames(){
		ArrayList<HostnameOrigem> registros = new ArrayList<>();

		registros.add(new HostnameOrigem(0 ,"Vazio"));
		registros.add(new HostnameOrigem(1 ,"proxy-234.ufsm.br"));
		registros.add(new HostnameOrigem(2 ,"proxy01.ufsm.br"));
		registros.add(new HostnameOrigem(3 ,"proxy-231.ufsm.br"));
		registros.add(new HostnameOrigem(5 ,"w3.ufsm.br"));
		registros.add(new HostnameOrigem(6 ,"coralx.ufsm.br"));
		registros.add(new HostnameOrigem(8 ,"douglas-ps.cpd.ufsm.br"));
		registros.add(new HostnameOrigem(9 ,"multi11.cpd.ufsm.br"));
		registros.add(new HostnameOrigem(10 ,"pc-fabio.cpd.ufsm.br"));
		registros.add(new HostnameOrigem(11 ,"cristian.cpd.ufsm.br"));
		registros.add(new HostnameOrigem(15 ,"siee03.ctlab.ufsm.br"));
		registros.add(new HostnameOrigem(16 ,"intranet.ctism.ufsm.br"));
		registros.add(new HostnameOrigem(17 ,"fwinf.inf.ufsm.br"));
		registros.add(new HostnameOrigem(18 ,"mts3.si.ufsm.br"));
		registros.add(new HostnameOrigem(19 ,"pc45.lacesm.ufsm.br"));

		return registros;
	}
	
	public ObservableList<HostnameOrigem> getHostnameOrigemList() {
		HostnameOrigem obj = new HostnameOrigem();
		ObservableList<HostnameOrigem> lista = FXCollections.observableArrayList(obj.hostnames());

		return lista;		
	}

	public HostnameOrigem getHostname(int chave) {
		return  hostnames().get(chave);
	}
}
