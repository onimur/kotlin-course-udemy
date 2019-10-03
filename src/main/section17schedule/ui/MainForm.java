package section17schedule.ui;

import section17schedule.business.ContactBusiness;
import section17schedule.model.ContactModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class MainForm extends JFrame {

    private JPanel rootPanel;
    private JButton buttonNewContact;
    private JButton buttonRemove;
    private JTable tableContacts;
    private JLabel labelContactCount;

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
        List<ContactModel> contactList = contactBusiness.getList();

        String[] columnNames = {"Name, Telephone"};
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], columnNames);

        for (ContactModel c : contactList) {
            Object[] o = new Object[2];
            o[0] = c.getName();
            o[1] = c.getPhone();

            model.addRow(o);
        }

        tableContacts.clearSelection();
        tableContacts.setModel(model);

        labelContactCount.setText(contactBusiness.getCount());
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
