package br.senai.sp.jandira.model;



public class Tabuada {
	
	public int multiplicando,
	minMultiplicador,
	maxMultiplicador;
	
	public boolean confirm = false;
	
	public String[] getTabuada() {
		
		int tamanho = maxMultiplicador - minMultiplicador + 1;
			
		confirm = true;
		
		String[] resultados = new String[tamanho];
		int contador = 0;

		while(minMultiplicador <= maxMultiplicador) {
			
			int produto = multiplicando * minMultiplicador;
			resultados[contador] = multiplicando + " X " + minMultiplicador + " = " + produto; 
			contador++;
			minMultiplicador++;
			
			}
		
		return resultados;
		
		

	}
}
	
//	public void getResultado() {
//		
//		int contador1 = 0;
//		int contador2 = minMultiplicador;
//		while(contador2 <= maxMultiplicador) {
//			
//			System.out.println(resultados[contador1]);
//			
//			++contador2;
//			++contador1;
//		}
//		
//		
//	}
//	
//
//}
