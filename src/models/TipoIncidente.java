package models;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TipoIncidente {

	private Integer id;
	private String titulo;

	public TipoIncidente() {
	}

	public TipoIncidente(Integer id, String titulo) {
		this.id = id;
		this.titulo = titulo;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return this.id + " - " + this.titulo;
		//return this.titulo;
	}

	private ArrayList<TipoIncidente> tiposIncidentes(){
		ArrayList<TipoIncidente> tiposIncidentes = new ArrayList<TipoIncidente>();

		tiposIncidentes.add(new TipoIncidente(0 ,"Vazio"));
		tiposIncidentes.add(new TipoIncidente(1 ,"Bot"));
		tiposIncidentes.add(new TipoIncidente(2 ,"Defacement"));
		tiposIncidentes.add(new TipoIncidente(3 ,"DDoS"));
		tiposIncidentes.add(new TipoIncidente(4 ,"Phishing-Site"));
		tiposIncidentes.add(new TipoIncidente(5 ,"Proxy"));
		tiposIncidentes.add(new TipoIncidente(6 ,"Scan"));
		tiposIncidentes.add(new TipoIncidente(7 ,"Spam"));
		tiposIncidentes.add(new TipoIncidente(8 ,"Tentativa de Login"));
		tiposIncidentes.add(new TipoIncidente(9 ,"URL-Maliciosa"));
		tiposIncidentes.add(new TipoIncidente(10 ,"Violação de Direitos Autorais / Copyright"));
		tiposIncidentes.add(new TipoIncidente(11 ,"Outro"));

		return tiposIncidentes;
	}

	public ObservableList<TipoIncidente> getTipoIncidenteList() {
		TipoIncidente tiposIncidentes = new TipoIncidente();
		ObservableList<TipoIncidente> lista = FXCollections.observableArrayList(tiposIncidentes.tiposIncidentes());

		return lista;		
	}

	public TipoIncidente getTipoIncidente(int chave) {
		try {
			return  tiposIncidentes().get(chave);
		} catch (Exception e) {
			return null;
		}
		
	}
}
