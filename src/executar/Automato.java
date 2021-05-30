package executar;

import java.util.ArrayList;
import java.util.HashMap;

import base.Estado;
import base.Fita;
import base.MaquinaEstado;
import base.Transicao;

public class Automato {

	public void questao1LetraA(String simbolo) {
		/*
		 * Questão 1. a) Todas as cadeias em {0,1}* que representam cada 1 seguido
		 * imediatamente de dois 0. Estados (Q): q0, q1, q2 Alfabeto (Σ): 0, 1
		 * Transições (δ): (q0, 0) -> q0; (q0, 1) -> q1; (q1, 0) -> q2; (q2, 0) -> q0
		 * Estado Inicial (q): q0 Estado(s) Final(is) (F): q0
		 */

		Fita fita = new Fita(simbolo);

		/*
		 * inserir os estados q0, q1, q2 Estado inicial: q0 Estado final: q0
		 */

		ArrayList<String> estados = new ArrayList<>();
		ArrayList<String> estadosIniciais = new ArrayList<>();
		ArrayList<String> estadosFinais = new ArrayList<>();

		estados.add("q0");
		estados.add("q1");
		estados.add("q2");

		estadosIniciais.add("q0");

		estadosFinais.add("q0");

		Estado estado = new Estado();
		estado.setEstados(estados);
		estado.setEstadoInicial(estadosIniciais);
		estado.setEstadoFinal(estadosFinais);

		/*
		 * inserir transições
		 */

		HashMap<String, String> transicoes = new HashMap<>();

		transicoes.put("q00", "q0");
		transicoes.put("q01", "q1");
		transicoes.put("q10", "q2");
		transicoes.put("q20", "q0");

		Transicao transicao = new Transicao();

		transicao.setTransicao(transicoes);

		MaquinaEstado maquinaEstado = new MaquinaEstado();
		boolean isSetenca = maquinaEstado.isSetenca(fita, estado, transicao);
		String cadeiaAceita = isSetenca ? "Sim" : "Não";
		System.out.println("Questão 1a: "+fita + " é uma setença aceita pelo autômato? " + cadeiaAceita);
	}

	public void questao1LetraB(String simbolo) {
		/*
		 * Questão 1. b) Todas as cadeias em {a,b}* de modo que o último símbolo seja b
		 * e o número de símbolos a seja par. Estados (Q): q0, q1, q2 Alfabeto (Σ): a, b
		 * Transições (δ): (q0, a) -> q1; (q0, b) -> q2; (q1, a) -> q0; (q1, b) -> q1;
		 * (q2, a) -> q1; (q2, b) ->q2 Estado Inicial (q): q0 Estado(s) Final(is) (F):
		 * q2
		 */

		/*
		 * inserir simbolos na fita
		 * 
		 */

		Fita fita = new Fita(simbolo);

		/*
		 * inserir os estados q0, q1, q2 Estado inicial: q0 Estado final: q2
		 */

		ArrayList<String> estados = new ArrayList<>();
		ArrayList<String> estadosIniciais = new ArrayList<>();
		ArrayList<String> estadosFinais = new ArrayList<>();

		estados.add("q0");
		estados.add("q1");
		estados.add("q2");

		estadosIniciais.add("q0");

		estadosFinais.add("q2");

		Estado estado = new Estado();
		estado.setEstados(estados);
		estado.setEstadoInicial(estadosIniciais);
		estado.setEstadoFinal(estadosFinais);

		/*
		 * inserir transições
		 */

		HashMap<String, String> transicoes = new HashMap<>();

		transicoes.put("q0a", "q1");
		transicoes.put("q0b", "q2");
		transicoes.put("q1a", "q0");
		transicoes.put("q1b", "q1");
		transicoes.put("q2a", "q1");
		transicoes.put("q2b", "q2");

		Transicao transicao = new Transicao();

		transicao.setTransicao(transicoes);

		MaquinaEstado maquinaEstado = new MaquinaEstado();
		boolean isSetenca = maquinaEstado.isSetenca(fita, estado, transicao);
		String cadeiaAceita = isSetenca ? "Sim" : "Não";
		System.out.println("Questão 1b: "+fita + " é uma setença aceita pelo autômato? " + cadeiaAceita);
	}

	public void questao2LetraA(String simbolo) {
		/*
		 * Questão 2 a) (ab*c*)* Estados (Q): q0, q1, q2, q3 Alfabeto (Σ): a, b, c
		 * Transições (δ): (q0,a) -> q1; (q1,a)->q1; (q1,b)->q2; (q1,c)->q3;
		 * (q2,a)->q1;(q2,b)->q2; (q2,c)->q3; (q3,a)->q1; (q3,c)->q3 Estado Inicial (q):
		 * q0 Estado(s) Final(is) (F): q0,q1,q2,q3
		 */

		/*
		 * inserir simbolos na fita
		 * 
		 */

		Fita fita = new Fita(simbolo);

		/*
		 * inserir os estados q0, q1, q2, q3 Estado inicial: q0 Estado final:
		 * q0,q1,q2,q3
		 */

		ArrayList<String> estados = new ArrayList<>();
		ArrayList<String> estadosIniciais = new ArrayList<>();
		ArrayList<String> estadosFinais = new ArrayList<>();

		estados.add("q0");
		estados.add("q1");
		estados.add("q2");
		estados.add("q3");

		estadosIniciais.add("q0");

		estadosFinais.add("q0");
		estadosFinais.add("q1");
		estadosFinais.add("q2");
		estadosFinais.add("q3");

		Estado estado = new Estado();
		estado.setEstados(estados);
		estado.setEstadoInicial(estadosIniciais);
		estado.setEstadoFinal(estadosFinais);

		/*
		 * inserir transições
		 */

		HashMap<String, String> transicoes = new HashMap<>();

		transicoes.put("q0 ", "q0");
		transicoes.put("q0a", "q1");

		transicoes.put("q1a", "q1");
		transicoes.put("q1b", "q2");
		transicoes.put("q1c", "q3");

		transicoes.put("q2a", "q1");
		transicoes.put("q2b", "q2");
		transicoes.put("q2c", "q3");

		transicoes.put("q3a", "q1");
		transicoes.put("q3c", "q3");

		Transicao transicao = new Transicao();

		transicao.setTransicao(transicoes);

		MaquinaEstado maquinaEstado = new MaquinaEstado();
		boolean isSetenca = maquinaEstado.isSetenca(fita, estado, transicao);
		String cadeiaAceita = isSetenca ? "Sim" : "Não";
		System.out.println("Questão 2a: "+fita + " é uma setença aceita pelo autômato? " + cadeiaAceita);

	}

	public void questao2LetraB(String simbolo) {
		/*
		 * Questão 2 b) aaa(b | c)* | (b | c)* Transições: (q0,a)->q1, (q0,b)->q4,
		 * (q0,c)->q4 (q1,a)->q2 (q2,a)->q3 (q3,b)->q3, (q3, c)->q3 (q4,a)->q5, (q4,
		 * b)->q4, (q4,c)->q4 (q5,a)->q6 (q6,a)->q7
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
		estados.add("q3");
		estados.add("q4");
		estados.add("q5");
		estados.add("q6");
		estados.add("q7");

		estadosIniciais.add("q0");

		estadosFinais.add("q3");
		estadosFinais.add("q7");

		Estado estado = new Estado();
		estado.setEstados(estados);
		estado.setEstadoInicial(estadosIniciais);
		estado.setEstadoFinal(estadosFinais);

		/*
		 * inserir transições
		 */

		HashMap<String, String> transicoes = new HashMap<>();

		transicoes.put("q0a", "q1");
		transicoes.put("q0b", "q4");
		transicoes.put("q0c", "q4");

		transicoes.put("q1a", "q2");

		transicoes.put("q2a", "q3");

		transicoes.put("q3b", "q3");
		transicoes.put("q3c", "q3");

		transicoes.put("q4a", "q5");
		transicoes.put("q4b", "q4");
		transicoes.put("q4c", "q4");

		transicoes.put("q5a", "q6");

		transicoes.put("q6a", "q7");

		Transicao transicao = new Transicao();

		transicao.setTransicao(transicoes);

		MaquinaEstado maquinaEstado = new MaquinaEstado();
		boolean isSetenca = maquinaEstado.isSetenca(fita, estado, transicao);
		String cadeiaAceita = isSetenca ? "Sim" : "Não";
		System.out.println(
				"Questão 2b: "+fita + " é uma setença aceita pelo autômato? " + cadeiaAceita);
	}

	public void questao2LetraC(String simbolo) {
		/*
		 * Questão 2 c) a*b | ab* Estados: q0,q1,q2,q3,q4 Estado Inicial: q0 Estados
		 * Finais: q1,q2,q4 Transições: (q0,a)->q1; (q0,b)->q2 (q1,a)->q3; (q1,b)->q4
		 * (q2) (q3,a)->q3, (q3,b)->q2 (q4,b)->q4
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

		estadosFinais.add("q1");
		estadosFinais.add("q2");
		estadosFinais.add("q4");

		Estado estado = new Estado();
		estado.setEstados(estados);
		estado.setEstadoInicial(estadosIniciais);
		estado.setEstadoFinal(estadosFinais);

		/*
		 * inserir transições
		 */

		HashMap<String, String> transicoes = new HashMap<>();

		transicoes.put("q0a", "q1");
		transicoes.put("q0b", "q2");

		transicoes.put("q1a", "q3");
		transicoes.put("q1b", "q4");

		transicoes.put("q3a", "q3");
		transicoes.put("q3b", "q2");

		transicoes.put("q4b", "q4");

		Transicao transicao = new Transicao();

		transicao.setTransicao(transicoes);

		MaquinaEstado maquinaEstado = new MaquinaEstado();
		boolean isSetenca = maquinaEstado.isSetenca(fita, estado, transicao);
		String cadeiaAceita = isSetenca ? "Sim" : "Não";
		System.out.println(
				"Questão 2c: "+fita + " é uma setença aceita pelo autômato? " + cadeiaAceita);
	}

	public void questao2LetraD(String simbolo) {
		/*
		 * Questão 2 d) a*b | ab* Estados: q0,q1,q2,q3 Estado Inicial: q0 Estados
		 * Finais: q2,q3 Transições: (q0,a)->q1, (q0,b)->q2 (q1,a)->q1, (q1,b)->q2,
		 * (q1,c)->q3 (q2,a)->q3, (q2,b)->q2 (q3,c)->q3
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

		estadosIniciais.add("q0");

		estadosFinais.add("q1");
		estadosFinais.add("q3");

		Estado estado = new Estado();
		estado.setEstados(estados);
		estado.setEstadoInicial(estadosIniciais);
		estado.setEstadoFinal(estadosFinais);

		/*
		 * inserir transições
		 */

		HashMap<String, String> transicoes = new HashMap<>();

		transicoes.put("q0a", "q1");
		transicoes.put("q0b", "q2");

		transicoes.put("q1a", "q1");
		transicoes.put("q1b", "q2");
		transicoes.put("q1c", "q3");

		transicoes.put("q2a", "q3");
		transicoes.put("q2b", "q2");

		transicoes.put("q3c", "q3");

		Transicao transicao = new Transicao();

		transicao.setTransicao(transicoes);

		MaquinaEstado maquinaEstado = new MaquinaEstado();
		boolean isSetenca = maquinaEstado.isSetenca(fita, estado, transicao);
		String cadeiaAceita = isSetenca ? "Sim" : "Não";
		System.out.println(
				"Questão 2d: "+fita + " é uma setença aceita pelo autômato? " + cadeiaAceita);
	}

	public void questao3(String simbolo) {
		/*
		 * Questão 3 Match Computador Estados: q0,
		 * q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12 Estado Inicial: q0 Estados Finais:q12
		 * Transições: (q0"")->q1 (q1c)->q2 (q2o)->q3 (q3m)->q4 (q4p)->q5 (q5u)->q6
		 * (q6t)->q7 (q7a)->q8 (q8d)->q9 (q9o)->q10 (q10r)->q11 (q11"")->q12
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
		estados.add("q5");
		estados.add("q6");
		estados.add("q7");
		estados.add("q8");
		estados.add("q9");
		estados.add("q10");
		estados.add("q11");
		estados.add("q12");

		estadosIniciais.add("q0");

		estadosFinais.add("q12");

		Estado estado = new Estado();
		estado.setEstados(estados);
		estado.setEstadoInicial(estadosIniciais);
		estado.setEstadoFinal(estadosFinais);

		/*
		 * inserir transições
		 */

		HashMap<String, String> transicoes = new HashMap<>();

		transicoes.put("q0 ", "q1");
		transicoes.put("q1c", "q2");
		transicoes.put("q2o", "q3");
		transicoes.put("q3m", "q4");
		transicoes.put("q4p", "q5");
		transicoes.put("q5u", "q6");
		transicoes.put("q6t", "q7");
		transicoes.put("q7a", "q8");
		transicoes.put("q8d", "q9");
		transicoes.put("q9o", "q10");
		transicoes.put("q10r", "q11");
		transicoes.put("q11 ", "q12");

		Transicao transicao = new Transicao();

		transicao.setTransicao(transicoes);

		MaquinaEstado maquinaEstado = new MaquinaEstado();
		ArrayList<Integer> posicoes = maquinaEstado.matchComputador(fita, estado, transicao);
		System.out.println("Questão 3: posições onde os matchs ocorreram " + posicoes);
	}

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
//		/*
//		 * questão 1 a)
//		 */
//		/* Cadeias aceitas */
		automato.questao1LetraA("100");
		automato.questao1LetraA("0100");
		automato.questao1LetraA("100");
		automato.questao1LetraA("100");
////		
////		/*
////		 * Cadeias rejeitadas
////		 * 
////		 */
		automato.questao1LetraA("1");
		automato.questao1LetraA("1001");
		automato.questao1LetraA("010");
		automato.questao1LetraA("0001");

		/*
		 * questão 1 b)
		 */
		/*
		 * Cadeias aceitas
		 */
		automato.questao1LetraB("b");
		automato.questao1LetraB("babab");
		automato.questao1LetraB("baab");
		automato.questao1LetraB("aab");
//		
//		/*
//		 * Cadeias não aceitas
//		 */
		automato.questao1LetraB("a");
		automato.questao1LetraB("ab");
		automato.questao1LetraB("bab");
		automato.questao1LetraB("aba");

//		/*
//		 * questão 2 a)
//		 */
//		/*Cadeias aceitass
		automato.questao2LetraA(" ");
		automato.questao2LetraA("aa");
		automato.questao2LetraA("abacabccca");
//
//		/*
//		 * Cadeias não aceitas
//		 */
		automato.questao2LetraA("b");
//		
//		/*
//		 * questão 2 b)
//		 */
//		Cadeias aceitas
//		
		automato.questao2LetraB("aaa");
		automato.questao2LetraB("aaabbc");
		automato.questao2LetraB("caaa");
//		
//		/*
//		 * Cadeias rejeitadas
//		 * 
//		 */
		automato.questao2LetraB("aaabaaa");
		automato.questao2LetraB("aa");
		automato.questao2LetraB("bb");
//		
//		/*
//		 * cadeia de entrada questão 2 c)
//		 */
//		/*
		/*
		 * Cadeias aceitas
//		 */
		automato.questao2LetraC("a");
		automato.questao2LetraC("b");
		automato.questao2LetraC("aab");
//		
//		/*
//		 * Cadeias rejeitas
//		 */
//		
		automato.questao2LetraC("aabb");
		automato.questao2LetraC("aa");
		automato.questao2LetraC("bb");
//		/*
//		 * questão 2 d)
//		 */

////		Cadeias aceitas
		automato.questao2LetraD("ac");
		automato.questao2LetraD("bac");
		automato.questao2LetraD("a");
		automato.questao2LetraD("aabbac");
//		/*
//		 * Cadeias rejeitadas
//		 */
		automato.questao2LetraD("abc");
		automato.questao2LetraD("bc");
//		
//		/*
//		 * questão 3
//		 */
		String t = "O computador é uma máquina capaz de variados tipos de tratamento automático de informações ou processamento de dados. Entende-se por computador um sistema físico que realiza algum tipo de computação. Assumiu-se que os computadores pessoais e laptops são ícones da era da informação. O primeiro computador eletromecânico foi construído por Konrad Zuse (1910–1995). Atualmente, um microcomputador é também chamado computador pessoal ou ainda computador doméstico.";
		
		automato.questao3(t);
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
