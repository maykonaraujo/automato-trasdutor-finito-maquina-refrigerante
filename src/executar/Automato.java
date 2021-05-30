package executar;

import java.util.ArrayList;
import java.util.HashMap;

import base.Estado;
import base.Fita;
import base.MaquinaEstado;
import base.Transicao;

public class Automato {

	public void questao4(ArrayList<Integer> simbolo) {
		/*
		 * Questão 4 - Maquina de refrigerante Estados: q0, q1,q2,q3,q4 Estado Inicial:
		 * q0 Estados Finais:q3 λ= { q3→1; q1,q2,q4→0} Transições: (q0/0,25)-> q1/0
		 * (q0/0,50)-> q2/0 (q0/0,1)->q3/1
		 * 
		 * (q1/0,25)-> q2/0 (q1/0,50)-> q4/0 (q1/0,1)->q3/1
		 * 
		 * (q2/0,25)-> q4/0 (q2/0,50)-> q3/1 (q2/0,1)->q3/1
		 * 
		 * (q4/0,25)-> q3/1 (q4/0,50)-> q3/1 (q4/0,1)->q3/1
		 * 
		 * 
		 */

		/*
		 * inserir simbolos na fita
		 * 
		 */

		Fita fita = new Fita(simbolo);

		/*
		 * inserir os estados
		 */

		ArrayList<String> estados = new ArrayList<>();
		ArrayList<String> estadosIniciais = new ArrayList<>();
		ArrayList<String> estadosFinais = new ArrayList<>();

		estados.add("q0");
		estados.add("q1");
		estados.add("q2");
		estados.add("q3");
		estados.add("q4");

		estadosIniciais.add("q0");

		estadosFinais.add("q3");

		Estado estado = new Estado();
		estado.setEstados(estados);
		estado.setEstadoInicial(estadosIniciais);
		estado.setEstadoFinal(estadosFinais);

		/*
		 * inserir transições
		 */

		HashMap<String, String> transicoes = new HashMap<>();

		transicoes.put("q025", "q1");
		transicoes.put("q050", "q2");
		transicoes.put("q0100", "q3");

		transicoes.put("q125", "q2");
		transicoes.put("q150", "q4");
		transicoes.put("q1100", "q3");

		transicoes.put("q225", "q4");
		transicoes.put("q250", "q3");
		transicoes.put("q2100", "q3");

		transicoes.put("q425", "q3");
		transicoes.put("q450", "q3");
		transicoes.put("q4100", "q3");

		transicoes.put("q325", "q1");
		transicoes.put("q350", "q2");
		transicoes.put("q3100", "q3");

		Transicao transicao = new Transicao();

		transicao.setTransicao(transicoes);

		MaquinaEstado maquinaEstado = new MaquinaEstado();
		ArrayList<Integer> fitaSaida = maquinaEstado.transdutorFinito(fita, estado, transicao);
		System.out.println(
				"Questão 4: "+fita + " \"+\n\n"
						+ "Fita Saída: "
						+ "\n" + fitaSaida);
	}

	public static void main(String[] args) {
		Automato automato = new Automato();
//
		/*
		 * questão 4
		 */
		ArrayList<Integer> fitaEntrada = new ArrayList<>();
		
		fitaEntrada.add(100);
		fitaEntrada.add(25);
		fitaEntrada.add(25);
		fitaEntrada.add(25);
		fitaEntrada.add(25);
		fitaEntrada.add(100);
		fitaEntrada.add(50);
		fitaEntrada.add(50);
		fitaEntrada.add(100);
		fitaEntrada.add(100);
		fitaEntrada.add(25);
		fitaEntrada.add(50);
		fitaEntrada.add(25);
		fitaEntrada.add(50);
		fitaEntrada.add(25);
		fitaEntrada.add(25);
		fitaEntrada.add(100);
		
		automato.questao4(fitaEntrada);
	}
}
