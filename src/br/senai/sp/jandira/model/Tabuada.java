package br.senai.sp.jandira.model;

public class Tabuada {
	
	public int multiplicando,
	minMultiplicador,
	maxMultiplicador;
	public String[] resultados;
	
	
	public void getTabuada() {
		
		resultados = new String[maxMultiplicador - minMultiplicador + 1];
		int contador1 = 0;
		int contador2 = minMultiplicador;
		while(contador2 <= maxMultiplicador) {
			
			resultados[contador1] = multiplicando + " X " + contador2 + " = " + multiplicando * contador2; 
			contador1++;
			contador2++;
			
		}
		
	}
	
	public void getResultado() {
		
		int contador1 = 0;
		int contador2 = minMultiplicador;
		while(contador2 <= maxMultiplicador) {
			
			System.out.println(resultados[contador1]);
			
			++contador2;
			++contador1;
		}
		
		
	}
	

}
