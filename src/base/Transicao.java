package base;

import java.util.HashMap;

public class Transicao {

	private HashMap<String, String> transicao = new HashMap<>();

	public HashMap<String, String> getTransicao() {
		return transicao;
	}

	public void setTransicao(HashMap<String, String> transicao) {
		this.transicao = transicao;
	}

	@Override
	public String toString() {
		return "Transicao [transicao=" + transicao + "]";
	}

}
