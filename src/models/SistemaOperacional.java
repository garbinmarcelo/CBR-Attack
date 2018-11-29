package models;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SistemaOperacional {

	private Integer id;
	private String titulo;

	public SistemaOperacional() {
	}

	public SistemaOperacional(Integer id, String titulo) {
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

	private ArrayList<SistemaOperacional> sistemasOperacionais(){
		ArrayList<SistemaOperacional> registros = new ArrayList<>();

		registros.add(new SistemaOperacional(0 ,"Vazio"));
		registros.add(new SistemaOperacional(1 ,"Linux"));
		registros.add(new SistemaOperacional(2 ,"Windows"));

		return registros;
	}

	public ObservableList<SistemaOperacional> getSistemaOperacionalList() {
		SistemaOperacional obj = new SistemaOperacional();
		ObservableList<SistemaOperacional> lista = FXCollections.observableArrayList(obj.sistemasOperacionais());

		return lista;		
	}

	public SistemaOperacional getSistemaOperacional(int chave) {
		try {
			return  sistemasOperacionais().get(chave);
		} catch (Exception e) {
			return null;
		}
		
	}
}
