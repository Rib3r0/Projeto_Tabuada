package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {
	
	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundo;
	public Font fontesDosLabels;
	public Color corDoButton1;
	public Color corDoButton2;
	public Font fonteTextField;
	public Color corDaCaixa;
	public Font fontedacaixa;
	
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
		labelTitulo.setBounds(10, 0, 250, 80);
		painel.add(labelTitulo);
		labelTitulo.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		labelTitulo.setForeground(new Color(255, 0, 0));

		// Multiplicando
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(141, 100, 300, 30);
		labelMultiplicando.setFont(fontesDosLabels);
		painel.add(labelMultiplicando);
		

		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(290, 100, 170, 40);
		textFieldMultiplicando.setFont(fonteTextField);
		painel.add(textFieldMultiplicando);
		
		textFieldMultiplicando.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		// Minimo Multiplicador
		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Minimo Multiplicador:");
		labelMinMultiplicador.setBounds(66, 150, 300, 30);
		labelMinMultiplicador.setFont(fontesDosLabels);
		painel.add(labelMinMultiplicador);
		
		
		JTextField textFieldMinMultiplicador = new JTextField();
		textFieldMinMultiplicador.setBounds(290, 150, 170, 40);
		textFieldMinMultiplicador.setFont(fonteTextField);
		painel.add(textFieldMinMultiplicador);
		
		// Maximo Multiplicador
		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Maximo Multiplicador:");
		labelMaxMultiplicador.setBounds(60, 200, 300, 30);
		labelMaxMultiplicador.setFont(fontesDosLabels);
		painel.add(labelMaxMultiplicador);
		
		
		JTextField textFieldMaxMultiplicador = new JTextField();
		textFieldMaxMultiplicador.setBounds(290, 200, 170, 40);
		textFieldMaxMultiplicador.setFont(fonteTextField);
		painel.add(textFieldMaxMultiplicador);
		
		// Criar um botão calcular
		JButton buttonCalcularTabuada = new JButton();
		buttonCalcularTabuada.setText("Calcular");
		buttonCalcularTabuada.setBounds(20, 250, 230, 50);
		buttonCalcularTabuada.setBackground(corDoButton1);
		painel.add(buttonCalcularTabuada);
		
		
		// Criar um botão limpar
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(260, 250, 200, 50);
		buttonLimpar.setBackground(corDoButton2);
		painel.add(buttonLimpar);
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textFieldMultiplicando.setText("");
				textFieldMaxMultiplicador.setText("");
				textFieldMinMultiplicador.setText("");
				
			}
		});
		
		// Criar lista de resultados
		
		JList<String> listResultados = new JList<String>();
		JScrollPane scroll = new JScrollPane(listResultados);
		
		
		scroll.setBounds(20, 320, 440, 200);
		listResultados.setBackground(corDaCaixa);
		listResultados.setFont(fontedacaixa);
		painel.add(scroll);
		

		
		buttonCalcularTabuada.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				tabuada.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
				tabuada.maxMultiplicador = Integer.parseInt(textFieldMaxMultiplicador.getText());
				tabuada.minMultiplicador = Integer.parseInt(textFieldMinMultiplicador.getText());
				
				String[] resultados = tabuada.getTabuada();
				listResultados.setListData(resultados);
				
			}
			
			
		});
		


		
		
		
		
		tela.setVisible(true);
		
		
	}
	

}
