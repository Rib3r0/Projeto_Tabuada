package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;


import br.senai.sp.jandira.gui.FrameTabuada;


public class AppTabuada {

	public static void main(String[] args) {
		
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.largura = 500;
		tela.altura = 600;
		tela.corDeFundo = new Color(250, 250, 250);
		tela.fontesDosLabels = new Font("Comic Sans MS", Font.BOLD, 20);
		tela.fonteTextField = new Font("BankGothic Md BT", 0, 40);
		tela.corDoButton1 = new Color(0, 200, 0);
		tela.corDoButton2 = new Color(255, 200, 0);
		
		tela.criarTela();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner leitor = new Scanner(System.in);
//		
//		Tabuada usuario = new Tabuada(); 
//	
//		System.out.println("insira o multiplicando:");
//		usuario.multiplicando = leitor.nextInt();
//		
//		System.out.println("insira o minimo multiplicador:");
//		usuario.minMultiplicador = leitor.nextInt();
//		
//		System.out.println("insira o maximo multiplicador:");
//		usuario.maxMultiplicador= leitor.nextInt();
//		
//		usuario.getTabuada();
//		usuario.getResultado();
		

	}

}
