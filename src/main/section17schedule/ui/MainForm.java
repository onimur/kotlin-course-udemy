package section17schedule.ui;

import section17schedule.business.ContactBusiness;
import section17schedule.model.ContactModel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainForm extends JFrame {

    private JPanel rootPanel;
    private JButton buttonNewContact;
    private JButton buttonRemove;
    private JTable tableContacts;

    private ContactBusiness contactBusiness;

    public MainForm() {
        //initializes the interface
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
        loadContacts();
    }

    private void loadContacts() {
        List<ContactModel> listContact = contactBusiness.getList();
    }

    private void setListeners() {
        buttonNewContact.addActionListener(e -> {
            new ContactForm();
            dispose();
        });

        buttonRemove.addActionListener(e -> {

        });
    }

}
