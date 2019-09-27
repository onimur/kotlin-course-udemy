package section17schedule.ui;

import javax.swing.*;

public class MainForm extends JFrame {

    private JPanel rootPanel;
    private JButton buttonNewContact;
    private JButton buttonRemove;
    private JTable tableContacts;

   public MainForm(){
       setContentPane(rootPanel);
       setSize(500,250);
       setVisible(true);
   }
}
