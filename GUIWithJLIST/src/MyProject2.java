/**
*This project includes methods 
*   - handling an ARRAY,
*   - writing the array into a text file, and
*   - reading the content of a text file into the array. 
*All of it, of course, using a simple GUI
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MyProject2 extends JFrame {

    // Objects which will be included in the project window
    public JMenuBar menuBar;        // a menu bar
    public JPanel panel1;           // a panel
    public JPanel panel2;          // a panel 
    public static JPanel contentPane; // this JPanel is static because it is used by the Preferences class to change the background color
    public JTextField textfield1;   // a text field
    public JButton button1;         // a button (Add)
    public JButton button2;         // another button (Save..."
    public JButton button3;         // anither button (Clear Array)
    public JTextArea textarea1;     // a text area
    public JScrollPane scrollpane1;  // a scrollpane for the textarea
    public JCheckBox checkbox1;     // a checkbox
    
	
	public JList list;

    
    // Variables linked to the array
    static String[] MYARRAY = new String[4];
    static int COUNTER = 0;
    static String NEWITEM = null;
    

    // Variables linked to the textfile
    static String INITIALFILEPATH = "C:\\Users\\robom\\Desktop\\";
    static String FILEPATH = INITIALFILEPATH;

    /*
     * Main
     */ 
    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() {
                new MyProject2();
            }
        });
    }    
     
    /*
     * Constructor
     */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public MyProject2(){
        this.setTitle("MyProject");
        this.setSize(520,420);
        

        // menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);
            
        // prepare the pane and the controls (2 panels, 1 text area, 1 text field, 1 checkbox and 2 buttons)
        contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(520,420));
        //System.out.println(contentPane.getBackground()); this is to get the default rgb background color
        
        // First panel (add elements to array)
        panel1 = new JPanel(null);
        panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(1),"Add elements to array: "));
        panel1.setBounds(250,15,200,120);
        panel1.setOpaque(false);
        panel1.setBackground(new Color(214,217,223));
        panel1.setForeground(new Color(0,0,0));
        panel1.setEnabled(true);
        panel1.setFont(new Font("sansserif",0,12));
        panel1.setVisible(true);

        // Second panel (save array to file)
        panel2 = new JPanel(null);       
        panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(1),"Save array to file: "));
        panel2.setBounds(250,260,200,120);
        panel2.setOpaque(false);
        //panel2.setBackground(new Color(214,217,223));
        panel2.setForeground(new Color(0,0,0));
        panel2.setEnabled(true);        
        panel2.setFont(new Font("sansserif",0,12));
        panel2.setVisible(true);        
        
        // Text area
        textarea1 = new JTextArea();
        textarea1.setBounds(55,15,182,366);
        textarea1.setBackground(new Color(255,255,255));
        textarea1.setForeground(new Color(0,0,0));
        textarea1.setMargin(new Insets(5,0,0,0));
        textarea1.setEnabled(true);
        textarea1.setFont(new Font("sansserif",0,12));
        textarea1.setText("");
        //textarea1.setBorder(BorderFactory.createBevelBorder(1));      REMOVED
        textarea1.setVisible(true);
        
        // Scroll Pane (added to provide scroll bars to the textarea1)
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(55,15,182,366);
        scrollpane1.setBorder(BorderFactory.createBevelBorder(1));
        scrollpane1.setVisible(true);
        
        // Text field
        textfield1 = new JTextField();
        textfield1.setBounds(260,40,175,24);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("sansserif",0,12));
        textfield1.setText("");
        textfield1.setVisible(true);

        // First button (add elements to array)
        button1 = new JButton();
        button1.setBounds(348,75,88,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Add Word");
        button1.setVisible(true);
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae){
                addButtonClicked();
                
            }
        });
        
        // First button (add elements to array)
        button3 = new JButton();
        button3.setBounds(260,75,88,35);
        button3.setBackground(new Color(214,217,223));
        button3.setForeground(new Color(0,0,0));
        button3.setEnabled(true);
        button3.setFont(new Font("sansserif",0,12));
        button3.setText("Clear Array");
        button3.setVisible(true);
        button3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae) {
                clearArrayButtonClicked();
            }
        });
        // Checkbox
        checkbox1 = new JCheckBox();
        checkbox1.setBounds(260,290,90,35);
        checkbox1.setBackground(new Color(214,217,223));
        checkbox1.setForeground(new Color(0,0,0));
        checkbox1.setEnabled(true);
        checkbox1.setFont(new Font("sansserif",0,12));
        checkbox1.setText("XML Format");
        checkbox1.setToolTipText("Select to save as XML, unselect to save as plain text.");
        checkbox1.setVisible(true);

        // Second button (Save array to file) 
        button2 = new JButton();
        button2.setBounds(345,330,90,35);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("sansserif",0,12));
        button2.setText("Save as...");
        button2.setVisible(true);
        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae){
                saveButtonClicked();
                
            }
        });  
        
      
        DefaultListModel<String> ItemName = new DefaultListModel<String>();
        list = new JList(ItemName);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setVisibleRowCount(20);
        list.setSelectedIndex(0);
        list.setFixedCellHeight(30);
        list.setBounds(55,15,182,366);
        list.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent a){
                System.out.println("List element clicked");
                
            }
        });
        list.setVisible(true);
        //add all components to contentPane panel
        contentPane.add(panel1);
        contentPane.add(panel2);
        contentPane.add(button1);
        contentPane.add(button3);
        contentPane.add(textfield1);
        contentPane.add(checkbox1);
        contentPane.add(button2);
        contentPane.add(list);
        
        //add panel to JFrame and set window position
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(button1);
        this.pack();
        this.setVisible(true);
        

        this.textfield1.requestFocusInWindow();
        
    }   
	/*
     * Method triggered by the Add Button event...
     */ 
	
    
	private void addButtonClicked () {
        NEWITEM = textfield1.getText();

        if (NEWITEM.compareTo("") != 0){
            // Add item to the array
            MYARRAY[COUNTER] = NEWITEM;
            COUNTER++;
            
            // If counter limit is reached, increase the size of the array
            if (COUNTER == MYARRAY.length){
                increaseArraySize();
            }
            
            
            //ItemName.addElement(NEWITEM);
           
            this.textfield1.setText("");
            this.textfield1.requestFocusInWindow();
            
        }
    }
    
    /*
     * Method triggered by the Clear Array button event...
     */ 
    private void clearArrayButtonClicked () {
        String TEMP[] = new String[4];
        MYARRAY = TEMP;
        COUNTER = 0;
        JOptionPane.showMessageDialog(this,"The array was reset.");
        list.clearSelection();
        this.textfield1.setText("");
        this.textfield1.requestFocusInWindow();

    }
    
    /*
     * Method triggered by the Save button event...
     */ 
    private void saveButtonClicked () {
        FILEPATH = INITIALFILEPATH;
        SelectFile('s');
            if (FILEPATH !=INITIALFILEPATH) {
                WriteTextFile();
            }
    }
    
    /*
     * This method increases the size of the array
     */
    private void increaseArraySize(){
        String TEMP[] = new String[MYARRAY.length*2];
        System.arraycopy(MYARRAY, 0, TEMP, 0, MYARRAY.length);
        MYARRAY = TEMP;
        JOptionPane.showMessageDialog(this,"Array size increased to " + TEMP.length);
    }
    
    /*
     * This method writes the elements of the array in a text file using a BufferedWriter object 
     */
    private void WriteTextFile(){
        //System.out.println (">>> Writing text file");
        /*
         * Some instructions, in this method, are bound directly to the choice made by the user about the XML format.
         * How will you handle that ?
         * It may have to do with the method checkbox1.isSelected())
         */
        
        try (BufferedWriter MYFILE = new BufferedWriter(new FileWriter(FILEPATH))){    // use (FILEPATH,true) to append to the file   
            
            //if (checkbox1.isSelected()) {MYFILE.write("<XML>\r\n");}
            
            //MYFILE.newLine();         REMOVED
            
            for (int ITEM=0;ITEM<COUNTER;ITEM++){
                    if (checkbox1.isSelected()){
                        MYFILE.write(convertToXml(MYARRAY[ITEM]));
                    }else{
                        MYFILE.write(MYARRAY[ITEM]);
                    }
                    MYFILE.newLine();
            }
            //if (checkbox1.isSelected()) {MYFILE.write("<XML>");}
            MYFILE.close();  
        }catch(Exception e){
            System.out.println(e);
            return;
        }
        
        JOptionPane.showMessageDialog(this,"Writing completed successfully.");
        
    }
    
    /*
     * This method reads the content of a text file using a BufferedReader object
     */
    private void ReadTextFile(){
        
        //System.out.println (">>> Reading text file");

        /*
         * This method needs to be completed...
         * Think about resetting MYARRAY before you start...
         * Think about calling increaseArraySize() when needed...
         */
        
        try (BufferedReader MYFILE = new BufferedReader(new FileReader(FILEPATH))){
            clearArrayButtonClicked();
            COUNTER = 0;
            String LINE = null;
            
            while ((LINE = MYFILE.readLine()) != null){
                MYARRAY[COUNTER] = LINE;
                COUNTER++;
                if (COUNTER == MYARRAY.length) {
                    increaseArraySize();
                }
            }
            MYFILE.close();

        }catch(Exception e){
            System.out.println(e);
            return;
        }
        
        String TEMP = "";
        for(int I = 0; I<COUNTER;I++) {
            TEMP = TEMP + MYARRAY[I] + "\n";
            //ItemName.addElement(TEMP);
        }
        textfield1.setText("");
        textfield1.requestFocusInWindow();
        
        JOptionPane.showMessageDialog(this,"Reading completed successfully.");
                
    } 
    
    /*
     * This method opens the FileChooser dialog
     */    
    private void SelectFile(char MODE){
        JFileChooser FILECHOOSER = new JFileChooser();
        FILECHOOSER.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter FILTER;
        String EXTENSION;
        if(checkbox1.isSelected()) {
            FILTER = new FileNameExtensionFilter("XML Files","xml");
            EXTENSION = ".xml";
        }else{
            FILTER = new FileNameExtensionFilter("Text FIles","txt");
            EXTENSION = ".txt";
        }
        FILECHOOSER.addChoosableFileFilter(FILTER);
        FILECHOOSER.setFileFilter(FILTER);
        
        int RESULT;
        if(MODE =='s') {
            RESULT = FILECHOOSER.showSaveDialog(null);
        }else{
            RESULT = FILECHOOSER.showOpenDialog(null);
        }
        
        if (RESULT == JFileChooser.APPROVE_OPTION) {
            File selectedFile = FILECHOOSER.getSelectedFile();
            FILEPATH = selectedFile.getAbsolutePath();
            if (FILEPATH.substring(FILEPATH.length()-4).compareTo(EXTENSION) !=0){
                FILEPATH = FILEPATH + EXTENSION;
            }
        }
        
    }
    
    /*
     * This method converts the elements to XML 
     */
    private String convertToXml(String myString){
        String strOutput = "\t<item>" + myString + "</item>";
        return(strOutput);
    }
     

    /*
     * This method generates the menus 
     */
        public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open...");
        JMenuItem save = new JMenuItem("Save as...");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences...");

        
        // add action listener to the Open... menu
        open.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent evt) {
                FILEPATH = INITIALFILEPATH;
                SelectFile('r');
                if(FILEPATH !=INITIALFILEPATH) {
                    ReadTextFile();
            }
        }
        });  
        
        // add action listener to the Save... menu
        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                FILEPATH = INITIALFILEPATH;
                SelectFile('s');
                if (FILEPATH !=INITIALFILEPATH) {
                	WriteTextFile();
                }
            }
        });
        
        
        // add action listener to the Exit... menu
        exit.addActionListener(new ActionListener()  {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        
        // add action listener to the Preferences... menu
        preferences.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent pref){
        		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.window.WindowLookAndFeel");
        		javax.swing.SwingUtilities.invokeLater(new Runnable() {
        			public void run() {
        				new Preferences();
        			}
        		});
        	}
        });
        
        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        
        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }

}
