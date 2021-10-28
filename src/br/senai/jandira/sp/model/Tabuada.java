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
	public void setCalcular(int multiplicando, int contador){
		resultado = multiplicando * contador;
	}
	public int getCalcular(){
		return resultado;
	}
	int resultado1[] = new int[multiplicador];
	public void setCalcular2(int multiplicando, int contador) {
		for(contador = 0; contador  < getMultiplicador(); ++contador) {
		resultado1[multiplicador] = multiplicando * contador;
		System.out.println(resultado1);
		}
	}
}
