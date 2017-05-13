

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.*;

public class Preferences extends JFrame {

	private JMenuBar menuBar;

	private JLabel Lbl1;
	private JLabel Lbl2;

	private JLabel RedLbl;
	private JLabel GreenLbl;
	private JLabel BlueLbl;

	private JTextField RGBTxtField;
	private JPanel Cpanel;

	public JSlider RSlider;
	public JSlider GSlider;
	public JSlider BSlider;

	static int R = 214;
	static int G = 217;
	static int B = 223;

	// Constructor
	public Preferences() {

		this.setTitle("Preferences");
		this.setSize(400, 200);
		// menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		// pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(400, 200));
		contentPane.setBackground(new Color(192, 192, 192));

		// adding components to contentPane panel

		// adding panel to JFrame and setting of window position and close
		// operation
		getContentPane().add(contentPane);
		contentPane.setLayout(null);

		Cpanel = new JPanel();
		Cpanel.setBounds(287, 51, 103, 87);
		Cpanel.setBackground(new Color(R, G, B));
		contentPane.add(Cpanel);
		Cpanel.setVisible(false);

		RGBTxtField = new JTextField();
		RGBTxtField.setBounds(287, 11, 103, 40);
		RGBTxtField.setFont(new Font("Consolas", Font.PLAIN, 12));
		RGBTxtField.setToolTipText("RGB");
		RGBTxtField.setEditable(false);
		RGBTxtField.setText("(" + R + "," + G + "," + B + ")");
		contentPane.add(RGBTxtField);
		RGBTxtField.setColumns(10);
		RGBTxtField.setVisible(false);

		Lbl1 = new JLabel("This is the Preferences Frame");
		Lbl1.setBounds(29, 76, 360, 40);
		Lbl1.setFont(new Font("Consolas", Font.PLAIN, 20));
		// Lbl1.
		contentPane.add(Lbl1);
		Lbl1.setVisible(true);

		Lbl2 = new JLabel("This changes the color of the background");
		Lbl2.setBounds(0, 0, 319, 40);
		Lbl2.setFont(new Font("Consolas", Font.PLAIN, 12));
		contentPane.add(Lbl2);
		Lbl2.setVisible(false);

		RedLbl = new JLabel("Red");
		RedLbl.setBounds(19, 60, 32, 14);
		contentPane.add(RedLbl);
		RedLbl.setVisible(false);

		GreenLbl = new JLabel("Green");
		GreenLbl.setBounds(10, 90, 41, 14);
		contentPane.add(GreenLbl);
		GreenLbl.setVisible(false);

		BlueLbl = new JLabel("Blue");
		BlueLbl.setBounds(19, 124, 32, 14);
		contentPane.add(BlueLbl);
		BlueLbl.setVisible(false);

		RSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
		RSlider.setBounds(61, 51, 200, 23);
		contentPane.add(RSlider);
		RSlider.setVisible(false);
		RSlider.setValue(R); // set the current R value of the slider to the R
								// value of the background
		RSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				// SliderAction();
				JSlider source = (JSlider) event.getSource();
				R = (int) source.getValue();
				// System.out.println("Red = " + R);// for debugging
				Cpanel.setBackground(new Color(R, G, B)); // preview pane
				MyProject2.contentPane.setBackground(new Color(R, G, B)); // change
																			// the
																			// background
																			// color
																			// of
																			// the
																			// contentPane
																			// of
																			// the
																			// Main
																			// class
				RGBTxtField.setText("(" + R + "," + G + "," + B + ")");

			}

		});

		GSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
		GSlider.setBounds(61, 81, 200, 23);
		contentPane.add(GSlider);
		GSlider.setVisible(false);
		GSlider.setValue(G); // set the current G value of the slider to the G
								// value of the background
		GSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				JSlider source = (JSlider) event.getSource();
				G = (int) source.getValue();
				// System.out.println("Green = " + G); // for debugging
				Cpanel.setBackground(new Color(R, G, B)); // preview pane
				MyProject2.contentPane.setBackground(new Color(R, G, B)); // change
																			// the
																			// background
																			// color
																			// of
																			// the
																			// contentPane
																			// of
																			// the
																			// Main
																			// class
				RGBTxtField.setText("(" + R + "," + G + "," + B + ")");
			}

		});

		BSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
		BSlider.setBounds(61, 115, 200, 23);
		contentPane.add(BSlider);
		BSlider.setVisible(false);
		BSlider.setValue(B); // set the current B value of the slider to the B
								// value of the background
		BSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				JSlider source = (JSlider) event.getSource();
				B = (int) source.getValue();
				// System.out.println("Blue = " + B);// for debugging
				Cpanel.setBackground(new Color(R, G, B)); // preview pane
				MyProject2.contentPane.setBackground(new Color(R, G, B)); // change
																			// the
																			// background
																			// color
																			// of
																			// the
																			// contentPane
																			// of
																			// the
																			// Main
																			// class
				RGBTxtField.setText("(" + R + "," + G + "," + B + ")");
			}

		});

		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);

	}

	// method for generate menu
	public void generateMenu() {
		menuBar = new JMenuBar();

		JMenu Background = new JMenu("Background");

		JMenuItem Color = new JMenuItem("Color");

		Color.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent bc) {
				Lbl1.setVisible(false); // make this 'disapear' when the
										// menuItem is clicked

				Lbl2.setVisible(true);
				RedLbl.setVisible(true);
				GreenLbl.setVisible(true);
				BlueLbl.setVisible(true);

				Cpanel.setVisible(true);
				RGBTxtField.setVisible(true);
				RSlider.setVisible(true);
				GSlider.setVisible(true);
				BSlider.setVisible(true);

			}
		});

		// add menuItems to menus
		Background.add(Color);

		menuBar.add(Background);

	}
}