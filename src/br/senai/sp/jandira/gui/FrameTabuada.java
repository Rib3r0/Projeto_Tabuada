package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTabuada {
	
	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundo;
	public Font fontesDosLabels;
	public Color corDoButton;
	public Font fonteTextField;
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		//conteiner da janela
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundo);
		
		
		// Titulo
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Tabuada 1.0");
		labelTitulo.setBounds(30, 30, 250, 80);
		painel.add(labelTitulo);
		labelTitulo.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		labelTitulo.setForeground(new Color(255, 0, 0));

		
		
		
		
		
		
		
		
		
		
		
		
		tela.setVisible(true);
		
		
	}
	

}
