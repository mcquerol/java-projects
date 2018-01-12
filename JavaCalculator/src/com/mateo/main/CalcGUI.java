package com.mateo.main;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.mateo.main.Calculations.Operation;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CalcGUI extends JFrame {
	private JTextField textField;

	private Operation CURRENT_OP;

	int a;
	int b;

	public CalcGUI() {
		this.getContentPane().setLayout(null);
		this.setSize(500, 300);
		this.setVisible(true);

		textField = new JTextField();
		textField.setBounds(75, 13, 345, 22);
		getContentPane().add(textField);
		textField.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btn7.setBounds(75, 48, 60, 25);
		getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btn8.setBounds(147, 48, 60, 25);
		getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btn9.setBounds(219, 48, 60, 25);
		getContentPane().add(btn9);

		JButton btn2 = new JButton("4");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btn2.setBounds(75, 86, 60, 25);
		getContentPane().add(btn2);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btn5.setBounds(147, 86, 60, 25);
		getContentPane().add(btn5);

		JButton btn4 = new JButton("6");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btn4.setBounds(219, 86, 60, 25);
		getContentPane().add(btn4);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btn1.setBounds(75, 124, 60, 25);
		getContentPane().add(btn1);

		JButton btn6 = new JButton("2");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btn6.setBounds(147, 124, 60, 25);
		getContentPane().add(btn6);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btn3.setBounds(219, 124, 60, 25);
		getContentPane().add(btn3);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btn0.setBounds(147, 162, 60, 25);
		getContentPane().add(btn0);

		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CURRENT_OP = Calculations.Operation.ADD;
				if (a == 0) {
					a = Integer.parseInt(textField.getText());
					textField.setText("");
				} else if (b == 0) {
					b = Integer.parseInt(textField.getText());
					textField.setText("");
				}
				System.out.println(a);
				System.out.println(b);
			}
		});
		btnplus.setBounds(298, 48, 60, 25);
		getContentPane().add(btnplus);

		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CURRENT_OP = Calculations.Operation.SUBTRACT;
				if (a == 0) {
					a = Integer.parseInt(textField.getText());
					textField.setText("");
				} else if (b == 0) {
					b = Integer.parseInt(textField.getText());
					textField.setText("");
				}
				System.out.println(a);
				System.out.println(b);
			}
		});
		btnminus.setBounds(360, 48, 60, 25);
		getContentPane().add(btnminus);

		JButton btndivide = new JButton("÷");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CURRENT_OP = Calculations.Operation.DIVIDE;
				if (a == 0) {
					a = Integer.parseInt(textField.getText());
					textField.setText("");
				} else if (b == 0) {
					b = Integer.parseInt(textField.getText());
					textField.setText("");
				}
				System.out.println(a);
				System.out.println(b);
			}
		});
		btndivide.setBounds(360, 86, 60, 25);
		getContentPane().add(btndivide);

		JButton btnmultiply = new JButton("x");
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CURRENT_OP = Calculations.Operation.MULTIPLY;
				if (a == 0) {
					a = Integer.parseInt(textField.getText());
					textField.setText("");
				} else if (b == 0) {
					b = Integer.parseInt(textField.getText());
					textField.setText("");
				}
				System.out.println(a);
				System.out.println(b);
			}
		});
		btnmultiply.setBounds(298, 86, 60, 25);
		getContentPane().add(btnmultiply);

		JButton btnequals = new JButton("=");
		btnequals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (CURRENT_OP) {
				case ADD:
					textField.setText(Integer.toString(Calculations.calculate(Calculations.Operation.ADD, a, b)));
					a = Calculations.calculate(Calculations.Operation.ADD, a, b);
					b = 0;
					break;

				case SUBTRACT:
					textField.setText(Integer.toString(Calculations.calculate(Calculations.Operation.SUBTRACT, a, b)));
					a = Calculations.calculate(Calculations.Operation.SUBTRACT, a, b);
					b = 0;
					break;

				case MULTIPLY:
					textField.setText(Integer.toString(Calculations.calculate(Calculations.Operation.MULTIPLY, a, b)));
					a = Calculations.calculate(Calculations.Operation.MULTIPLY, a, b);
					b = 0;
					break;

				case DIVIDE:
					textField.setText(Integer.toString(Calculations.calculate(Calculations.Operation.DIVIDE, a, b)));
					a = Calculations.calculate(Calculations.Operation.DIVIDE, a, b);
					b = 0;
					break;
				}
			}
		});
		btnequals.setBounds(298, 124, 60, 25);
		getContentPane().add(btnequals);
	}

	public static void main(String[] args) {
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new CalcGUI();

			}
		});
	}
}
