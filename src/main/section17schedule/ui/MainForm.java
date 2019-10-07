package section17schedule.ui;

import section17schedule.business.ContactBusiness;
import section17schedule.model.ContactModel;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
    private String name = "";
    private String phone = "";

    public MainForm() {
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
        loadContacts();
    }

    /**
     * Assign events to interface elements
     */
    private void setEvents() {
        this.buttonNewContact.addActionListener(e -> {
            new ContactForm();
            dispose();
        });

        tableContacts.getSelectionModel().addListSelectionListener(e -> {
            if (e.getValueIsAdjusting()) {
                // Get the value of the row that was clicked
                if (tableContacts.getSelectedRow() != -1) {
                    name = tableContacts.getValueAt(tableContacts.getSelectedRow(), 0).toString();
                    phone = tableContacts.getValueAt(tableContacts.getSelectedRow(), 1).toString();
                }
            }
        });

        buttonRemove.addActionListener(e -> {
            try {
                contactBusiness.delete(name, phone);
                name = "";
                phone = "";
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(new JFrame(), ex.getMessage());
            } finally {
                loadContacts();
            }


        });
    }

    private void loadContacts() {
        List<ContactModel> contactList = this.contactBusiness.getList();

        // Java Swing - Create the template that will be used in the table.
        String[] columnNames = {"Name", "Telephone"};
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], columnNames);

        for (ContactModel c : contactList) {
            Object[] o = new Object[2];
            o[0] = c.getName();
            o[1] = c.getPhone();

            model.addRow(o);
        }

        this.tableContacts.clearSelection();
        this.tableContacts.setModel(model);

        labelContactCount.setText(contactBusiness.getCount());
    }

}
