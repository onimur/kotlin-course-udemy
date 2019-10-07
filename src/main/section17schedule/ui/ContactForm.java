package section17schedule.ui;

import section17schedule.business.ContactBusiness;

import javax.swing.*;
import java.awt.*;

public class ContactForm extends JFrame {

    private JPanel rootPanel;
    private JTextField textName;
    private JTextField textPhone;
    private JButton buttonSave;
    private JButton buttonCancel;

    private ContactBusiness contactBusiness;

    public ContactForm() {
        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        //Set the interface to the middle of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);

        //Set the close function
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        contactBusiness = new ContactBusiness();
        setListeners();
    }

    private void setListeners() {
        buttonSave.addActionListener(e -> {
            try {
                String name = textName.getText();
                String phone = textPhone.getText();

                contactBusiness.save(name, phone);

                new MainForm();
                dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(new JFrame(), ex.getMessage());
            }
        });

        buttonCancel.addActionListener(e -> {
            new MainForm();
            dispose();
        });
    }
}
