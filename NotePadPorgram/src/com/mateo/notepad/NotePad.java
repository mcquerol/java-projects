package src.com.mateo.notepad;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.text.BadLocationException;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class NotePad extends JFrame {

	private JMenuBar menuBar;
	private JLabel WordCount;
	private JEditorPane Pane;
	private JFileChooser fc;
	private Scanner sc;

	private String FONT = "Comic Sans MS";
	private int SIZE = 12;

	static String[] WORDS = new String[10];
	static int COUNTER = 0;

	static int WC; // Word Count

	static String INITIALFILEPATH = "C:\\Users\\1ceballom\\Desktop\\";
	static String FILEPATH = INITIALFILEPATH;

	static String TMP;

	// Constructor
	public NotePad() {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("icons/main.PNG"));

		this.setTitle("Mateo's Notepad");
		this.setSize(500, 400);
		// menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		// pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(500, 400));
		contentPane.setBackground(new Color(192, 192, 192));

		// adding panel to JFrame and seting of window position and close
		// operation
		getContentPane().add(contentPane);

		Pane = new JEditorPane();
		Pane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO
				WORDS = Pane.getText().split(" "); // split the elements in the
													// array by spaces
				if (Pane.getText().equals("")) {
					WC = 0; // 0 word count when no words
				} else {
					WC = WORDS.length; // as many words as the length of the //
										// array
				}
				WordCount.setText("Word Count: " + WC);
				// System.out.println(WORDS.length);
			}

		});

		Pane.setBounds(0, 0, 500, 377);
		Pane.setEnabled(true);
		Pane.setFont(new Font(FONT, 0, SIZE));
		Pane.setVisible(true);

		// adding components to contentPane panel
		contentPane.add(Pane);

		WordCount = new JLabel("Word Count: 0");
		WordCount.setBounds(10, 376, 150, 24);
		contentPane.add(WordCount);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	// method for generate menu
	public void generateMenu() {
		menuBar = new JMenuBar();

		JMenu mnFile = new JMenu("File");
		JMenu mnEdit = new JMenu("Edit");

		JMenuItem open = new JMenuItem("Open   ");
		open.setIcon(new ImageIcon("icons/open.png"));
		open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK));

		JMenuItem save = new JMenuItem("Save   ");
		save.setIcon(new ImageIcon("icons/save.png"));
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Event.CTRL_MASK));

		JMenuItem quit = new JMenuItem("Quit   ");
		quit.setIcon(new ImageIcon("icons/quit.png"));
		quit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, Event.CTRL_MASK));

		JMenuItem undo = new JMenuItem("Undo   ");
		undo.setIcon(new ImageIcon("icons/undo.png"));
		undo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, Event.CTRL_MASK));

		JMenuItem redo = new JMenuItem("Redo   ");
		redo.setIcon(new ImageIcon("icons/redo.png"));
		redo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, Event.CTRL_MASK));

		fc = new JFileChooser();
		fc.setCurrentDirectory(new File(System.getProperty("user.home")));
		// fc.setDialogTitle("FileChooser");
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		// Setings action for menu item
		// Call defined method
		open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				open(evt);
			}
		});

		// Setings action for menu item
		// Call defined method
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				save(evt);
			}
		});

		// Setings action for menu item
		// Call defined method
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				quit(evt);
			}
		});

		////////////////
		undo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				undo(evt);
			}

		});

		redo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				redo(evt);
			}
		});

		mnFile.add(open);
		mnFile.add(save);
		mnFile.addSeparator();
		mnFile.add(quit);

		mnEdit.add(undo);
		mnEdit.add(redo);

		menuBar.add(mnFile);
		menuBar.add(mnEdit);
	}

	// Method for Open from menuFile
	private void open(ActionEvent evt) {
		fc.setDialogTitle("Open");
		fc.showOpenDialog(this);
		openFile();
	}

	private void openFile() {
		try {
			sc = new Scanner(new FileReader(fc.getSelectedFile()));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String c = "";
		while (sc.hasNext()) {
			c = sc.next();
		}
		try {
			Pane.getDocument().insertString(Pane.getDocument().getLength(), c, null);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

	// Method for Save from menuFile
	private void save(ActionEvent evt) {
		fc.setDialogTitle("Save");
		fc.showSaveDialog(null);

		FILEPATH = INITIALFILEPATH;
		if (FILEPATH != INITIALFILEPATH) {
			try (BufferedWriter MYFILE = new BufferedWriter(new FileWriter(FILEPATH))) { // (FILEPATH,true)
																							// to
																							// append
																							// to
																							// the
																							// file
				for (int ITEM = 0; ITEM < COUNTER; ITEM++) {
					MYFILE.write(WORDS[ITEM]);
					MYFILE.newLine();
				}
				MYFILE.close();
			} catch (Exception e) {
				System.out.println(e);
				return;
			}
		}
	}

	// Method for Exit from menuFile
	private void quit(ActionEvent evt) {
		System.exit(0);
	}

	private void undo(ActionEvent evt) {
		TMP = WORDS[WORDS.length - 1];
		// System.out.println(TMP);
		String[] TEXT = new String[WORDS.length - 1];
		System.arraycopy(WORDS, 0, TEXT, 0, TEXT.length);
		TEXT = WORDS;

		for (int i = 0; i < TEXT.length; i++) {
			try {
				Pane.getDocument().remove(WORDS.length-1, TEXT.length-1);
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println(WORDS.length);
		WC = WORDS.length;
	}

	private void redo(ActionEvent evt) {
		// TODO
	}

	public static void main(String[] args) {
		// System.setProperty("swing.defaultlaf","com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new NotePad();
			}
		});
	}
}