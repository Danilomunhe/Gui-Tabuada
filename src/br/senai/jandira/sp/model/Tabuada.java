package br.senai.jandira.sp.model;

;

public class Tabuada {

	private int multiplicando, multiplicador, resultado;

	public void setMultiplicando(String multiplicando) {
		this.multiplicando = Integer.parseInt(multiplicando);
	}

	public int getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicador(String multiplicador) {
		this.multiplicador = Integer.parseInt(multiplicador);
	}

	public int getMultiplicador() {
		return multiplicador;
	}

	public void setCalcular(int multiplicando, int contador) {
		resultado = multiplicando * contador;
	}

	public int getCalcular() {
		return resultado;
	}
}
