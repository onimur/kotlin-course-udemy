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
        //Business
        contactBusiness = new ContactBusiness();

        this.setContentPane(rootPanel);
        this.setSize(500, 250);

        // Make the window start in the center of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);

        this.setVisible(true);

        //Set the close function
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setEvents();
    }

    private void setEvents() {
        this.buttonSave.addActionListener(e -> {
            String name = textName.getText();
            String phone = textPhone.getText();

            try {
                contactBusiness.save(name, phone);

                new MainForm();

                dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(new JFrame(), ex.getMessage());
            }
        });

        this.buttonCancel.addActionListener(e -> {
            new MainForm();
            dispose();
        });
    }
}
