package br.senai.jandira.sp.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.jandira.sp.model.Tabuada;

public class Tela {

	public void criarTela() {

		JFrame minhaTela = new JFrame();
		minhaTela.setSize(600, 600);
		minhaTela.setTitle("Tabuada");
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setLayout(null);

		JLabel lblTabuada = new JLabel();
		lblTabuada.setText("Tabuada");
		lblTabuada.setBounds(100, 30, 200, 30);
		lblTabuada.setForeground(Color.LIGHT_GRAY);
		lblTabuada.setFont(new Font("Times new roman", Font.BOLD, 45));

		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando: ");
		lblMultiplicando.setBounds(90, 90, 150, 30);

		JLabel lblMultiplicador = new JLabel();
		lblMultiplicador.setText("Máximo multiplicador: ");
		lblMultiplicador.setBounds(50, 130, 150, 30);

		JLabel lblResultado = new JLabel();
		lblResultado.setText("Resultado: ");
		lblResultado.setBounds(300, 80, 100, 30);
		lblResultado.setForeground(Color.GREEN);

		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(200, 90, 50, 30);

		JTextField txtMultiplicador = new JTextField();
		txtMultiplicador.setBounds(200, 130, 50, 30);

		JButton btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(20, 190, 200, 50);
		btnCalcular.setBackground(Color.RED);
		btnCalcular.setFont(new Font("Times new roman", Font.BOLD, 25));
		btnCalcular.setForeground(Color.WHITE);

		JButton btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setBounds(20, 250, 200, 50);
		btnLimpar.setBackground(Color.GREEN);
		btnLimpar.setFont(new Font("Times new roman", Font.BOLD, 25));
		btnLimpar.setForeground(Color.WHITE);

		DefaultListModel<String> listModel = new DefaultListModel<>();
		JList<String> list = new JList<>(listModel);
		list.setBounds(300, 120, 200, 200);

		JScrollPane listResultados = new JScrollPane(list);
		listResultados.setBounds(300, 120, 200, 200);

		minhaTela.getContentPane().add(lblTabuada);
		minhaTela.getContentPane().add(lblMultiplicando);
		minhaTela.getContentPane().add(lblMultiplicador);
		minhaTela.getContentPane().add(lblResultado);
		minhaTela.getContentPane().add(txtMultiplicando);
		minhaTela.getContentPane().add(txtMultiplicador);
		minhaTela.getContentPane().add(btnCalcular);
		minhaTela.getContentPane().add(btnLimpar);
		minhaTela.getContentPane().add(listResultados);
		minhaTela.getContentPane().setBackground(Color.YELLOW);

		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Tabuada tabuada = new Tabuada();

				tabuada.setMultiplicando(txtMultiplicando.getText());
				tabuada.getMultiplicando();
				tabuada.setMultiplicador(txtMultiplicador.getText());

				for (int contador = 0; contador <= tabuada.getMultiplicador(); contador++) {
					tabuada.setCalcular(tabuada.getMultiplicando(), contador);
					listModel.addElement(tabuada.getMultiplicando() + " X " + contador + " = " + tabuada.getCalcular());

				}
			}
		});

		btnLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			    listModel.removeAllElements();
				txtMultiplicando.grabFocus();
			}
		});

		minhaTela.setVisible(true);

	}
}
