package base;

import java.util.ArrayList;

public class Fita {
	
	private String cadeia;
	
	private ArrayList<Integer> cadeiaTransdutor = new ArrayList<>();
	
	
	public Fita(String cadeia) {
		super();
		this.cadeia = cadeia;
	}
	
	public Fita(ArrayList<Integer> cadeiaTransdutor) {
		super();
		this.cadeiaTransdutor = cadeiaTransdutor;
	}
	
	public String getCadeia() {
		return cadeia;
	}

	public void setCadeia(String cadeia) {
		this.cadeia = cadeia;
	}
	
	

	public ArrayList<Integer> getCadeiaTransdutor() {
		return cadeiaTransdutor;
	}

	public void setCadeiaTransdutor(ArrayList<Integer> cadeiaTrasdutor) {
		this.cadeiaTransdutor = cadeiaTrasdutor;
	}

	@Override
	public String toString() {
		return "Fita [cadeia=" + cadeia + ", cadeiaTransdutor=" + cadeiaTransdutor + "]";
	}

	

	

	

	
	
	
	
	
}
