package base;

import java.util.ArrayList;

public class Estado {

	private ArrayList<String> estados = new ArrayList<>();
	private ArrayList<String> estadoInicial = new ArrayList<>();
	private ArrayList<String> estadoFinal = new ArrayList<>();
	
	public ArrayList<String> getEstados() {
		return estados;
	}
	public void setEstados(ArrayList<String> estados) {
		this.estados = estados;
	}
	public ArrayList<String> getEstadoInicial() {
		return estadoInicial;
	}
	public void setEstadoInicial(ArrayList<String> estadoInicial) {
		this.estadoInicial = estadoInicial;
	}
	public ArrayList<String> getEstadoFinal() {
		return estadoFinal;
	}
	public void setEstadoFinal(ArrayList<String> estadoFinal) {
		this.estadoFinal = estadoFinal;
	}
	@Override
	public String toString() {
		return "Estado [estados=" + estados + ", estadoInicial=" + estadoInicial + ", estadoFinal=" + estadoFinal + "]";
	}
	
	

}
