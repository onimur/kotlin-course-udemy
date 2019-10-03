package section17schedule.ui;

import javax.swing.*;
import java.awt.*;

public class MainForm extends JFrame {

    private JPanel rootPanel;
    private JButton buttonNewContact;
    private JButton buttonRemove;
    private JTable tableContacts;

   public MainForm(){
       //initializes the interface
       setContentPane(rootPanel);
       setSize(500,250);
       setVisible(true);

       //set the interface to the middle of the screen
       Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
       setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2 );

       //Set the close function
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
   }
}
