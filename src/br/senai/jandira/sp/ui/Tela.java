package br.senai.jandira.sp.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListModel;

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
		lblTabuada.setBounds(100, 30, 100, 30);

		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando: ");
		lblMultiplicando.setBounds(50, 90, 150, 30);

		JLabel lblMultiplicador = new JLabel();
		lblMultiplicador.setText("Máximo multiplicador: ");
		lblMultiplicador.setBounds(50, 130, 150, 30);

		JLabel lblResultado = new JLabel();
		lblResultado.setText("Resultado: ");
		lblResultado.setBounds(300, 80, 100, 30);

		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(150, 90, 50, 30);

		JTextField txtMultiplicador = new JTextField();
		txtMultiplicador.setBounds(200, 130, 50, 30);

		JButton btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(20, 190, 200, 50);
		
		JButton btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setBounds(20, 250, 200, 50);

		minhaTela.getContentPane().add(lblTabuada);
		minhaTela.getContentPane().add(lblMultiplicando);
		minhaTela.getContentPane().add(lblMultiplicador);
		minhaTela.getContentPane().add(lblResultado);
		minhaTela.getContentPane().add(txtMultiplicando);
		minhaTela.getContentPane().add(txtMultiplicador);
		minhaTela.getContentPane().add(btnCalcular);
		minhaTela.getContentPane().add(btnLimpar);

		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Tabuada tabuada = new Tabuada();

				int multiplicando = Integer.parseInt(txtMultiplicando.getText());
				int multiplicador = Integer.parseInt(txtMultiplicador.getText());
				int contador = 0;

				DefaultListModel listModel = new DefaultListModel();
				JList list = new JList(listModel);

				for (contador = 0; contador <= multiplicador; contador++) {
					tabuada.Calcular(multiplicando, contador);
					listModel.addElement(multiplicando + " X " + contador + " = "+tabuada.getCalcular());
					list.setBounds(300, 150, 200, 200);

					minhaTela.getContentPane().add(list);
				}

			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
			}
		});

		minhaTela.setVisible(true);

	}
}
