/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class GUI_project extends JFrame {

    private JMenuBar menuBar;
    private JButton Addbtn;
    private JButton Clearbtn;
    private JLabel label1;
    private JTextArea textarea1;
    private JTextField textfield1;

    //Constructor 
    public GUI_project(){

        this.setTitle("GUI_project");
        this.setSize(500,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));


        textarea1 = new JTextArea();
        textarea1.setBounds(12,24,240,351);
        textarea1.setBackground(new Color(255,255,255));
        textarea1.setForeground(new Color(0,0,0));
        textarea1.setEnabled(true);
        textarea1.setFont(new Font("sansserif",0,12));
        textarea1.setText("");
        textarea1.setBorder(BorderFactory.createBevelBorder(1));
        textarea1.setVisible(true);

        textfield1 = new JTextField();
        textfield1.setBounds(267,67,204,34);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("sansserif",0,12));
        textfield1.setText("");
        textfield1.setVisible(true);

        Addbtn = new JButton();
        Addbtn.setBounds(268,102,90,35);
        Addbtn.setBackground(new Color(214,217,223));
        Addbtn.setForeground(new Color(0,0,0));
        Addbtn.setEnabled(true);
        Addbtn.setFont(new Font("sansserif",0,12));
        Addbtn.setText("Add Item");
        Addbtn.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        Addbtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                String txt = textfield1.getText().toString();
                textarea1.append(IncreaseArraySize.addItem(txt));
                for(String N : IncreaseArraySize.MYARRAY){
                    textarea1.append(N + "\n");
                } 
            }
        });
       
        Clearbtn = new JButton();
        Clearbtn.setBounds(357,102,115,35);
        Clearbtn.setBackground(new Color(214,217,223));
        Clearbtn.setForeground(new Color(0,0,0));
        Clearbtn.setEnabled(true);
        Clearbtn.setFont(new Font("sansserif",0,12));
        Clearbtn.setText("Clear Textarea");
        Clearbtn.setVisible(true);
        //Set methods for mouse events
        //Call defined methods
        Clearbtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                textarea1.setText(null);
            }
        });
                                       
        label1 = new JLabel();
        label1.setBounds(270,25,226,32);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("sansserif",0,12));
        label1.setText("Please enter an item (type 'end' to stop)");
        label1.setVisible(true);



        //adding components to contentPane panel
        contentPane.add(Addbtn);
        contentPane.add(Clearbtn);
        contentPane.add(label1);
        contentPane.add(textarea1);
        contentPane.add(textfield1);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //Method mouseClicked for Addbtn
    private void AddbtnClicked (MouseEvent evt) {
            //TODO
    }

    //Method mouseClicked for Clearbtn
    private void ClearbtnClicked (MouseEvent evt) {
            //TODO
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");


        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }



     public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI_project();
            }
        });
    }

}