package br.senai.jandira.sp.model;
;

public class Tabuada {

	private int multiplicando, contador, resultado;
	
	public void Calcular(int multiplicando, int contador){
		resultado = multiplicando * contador;
	}
	public int getCalcular(){
		return resultado;
	}
}
