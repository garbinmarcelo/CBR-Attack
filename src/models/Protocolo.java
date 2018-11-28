package models;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Protocolo {
	
	private Integer id;
	private String titulo;
	
	public Protocolo() {
	}

	public Protocolo(Integer id, String titulo) {
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
	
	private ArrayList<Protocolo> protocolos(){
		ArrayList<Protocolo> registros = new ArrayList<>();

		registros.add(new Protocolo(0 ,"Vazio"));
		registros.add(new Protocolo(1 ,"HTTP"));
		registros.add(new Protocolo(2 ,"BITTORRENT"));
		registros.add(new Protocolo(3 ,"UDP"));
		registros.add(new Protocolo(4 ,"SSH"));
		registros.add(new Protocolo(5 ,"SSL"));
		registros.add(new Protocolo(6 ,"DNS"));
		registros.add(new Protocolo(7 ,"NETBIOS"));
		registros.add(new Protocolo(8 ,"SNMP"));
		registros.add(new Protocolo(9 ,"NTPD"));
		registros.add(new Protocolo(10 ,"SSDP"));

		return registros;
	}
	
	public ObservableList<Protocolo> getProtocoloList() {
		Protocolo obj = new Protocolo();
		ObservableList<Protocolo> lista = FXCollections.observableArrayList(obj.protocolos());

		return lista;		
	}

	public Protocolo getProtocolo(int chave) {
		return  protocolos().get(chave);
	}
}
