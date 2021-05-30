package base;

import java.util.ArrayList;

public class MaquinaEstado {

	public boolean isSetenca(Fita fita, Estado estado, Transicao transicao) {
		int tamanhoFita = fita.getCadeia().length();

		if (tamanhoFita == 0)
			return false;

		/*
		 * ler fita
		 */
		String contraDominio = null;
		String dominio = null;
		for (int i = 0; i < tamanhoFita; i++) {
			String simbolo = fita.getCadeia().substring(i, i + 1);

			if (i == 0) {
				/*
				 * primeiro simbolo estado inicial
				 */
				dominio = estado.getEstadoInicial().get(i) + simbolo;
				contraDominio = transicao.getTransicao().get(dominio);

				/*
				 * se a transicao inicial não existir por causa do simbolo, a maquina de estados
				 * rejeita a cadeia
				 */
				if (contraDominio == null) {
					return false;
				}

			} else {
				if (contraDominio == null) {
					return false;
				}
				dominio = contraDominio + simbolo;
				contraDominio = transicao.getTransicao().get(dominio);
			}

		}
		if (estado.getEstadoFinal().contains(contraDominio)) {
			return true;
		}

		return false;
	}

	/*
	 * Essa função realiza retorna o texto da fita com a computador na cor preto.
	 */
	public ArrayList<Integer> matchComputador(Fita fita, Estado estado, Transicao transicao) {
		/*
		 * Array para guardar as posições de match
		 * 
		 */
		ArrayList<Integer> posicaoMatch = new ArrayList<>();

		int tamanhoFita = fita.getCadeia().length();

		if (tamanhoFita == 0)
			return null;

		/*
		 * ler fita
		 */
		String contraDominio = null;
		String dominio = null;
		int estadoAtual = 0;

		for (int i = 0; i < tamanhoFita; i++) {
			String simbolo = fita.getCadeia().substring(i, i + 1);

			dominio = "q" + estadoAtual + simbolo;
			contraDominio = transicao.getTransicao().get(dominio);

			if (contraDominio == null) {
				estadoAtual = 0;
			} else {
				estadoAtual += 1;
			}

			if (estado.getEstadoFinal().contains(contraDominio)) {
				posicaoMatch.add(i);
				estadoAtual = 0;
			}

		}

		return posicaoMatch;
	}

	public ArrayList<Integer> transdutorFinito(Fita fita, Estado estado, Transicao transicao) {
		ArrayList<Integer> fitaSaida = new ArrayList<>();

		int tamanhoFita = fita.getCadeiaTransdutor().size();

		if (tamanhoFita == 0) {
			return null;
		}

		/*
		 * ler fita
		 */
		String contraDominio = null;
		String dominio = null;
		int troco = 0;
		int acumulador = 0;

		for (int i = 0; i < tamanhoFita; i++) {
			int simbolo = fita.getCadeiaTransdutor().get(i);

			acumulador = acumulador + simbolo;

			if (i == 0) {

				dominio = estado.getEstadoInicial().get(i) + simbolo;

				contraDominio = transicao.getTransicao().get(dominio);
			} else {
				if (simbolo < 100 && troco > 0) {
					acumulador = acumulador+troco;
					dominio = contraDominio +acumulador;
					troco = 0;
					
				} else {
					dominio = contraDominio + simbolo;
				}
				contraDominio = transicao.getTransicao().get(dominio);
			}

			if (contraDominio == null) {
				return null;
			}

			if (estado.getEstadoFinal().contains(contraDominio)) {
				fitaSaida.add(1);
				troco = troco + (acumulador - 100);
				acumulador = 0;

			} else {
				fitaSaida.add(0);
			}

		}
		return fitaSaida;
	}
}
