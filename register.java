package com.mainprojstudent;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class register extends JFrame
        implements ActionListener, ItemListener {

    private JLabel title;
    private JLabel welcomeLabel;
    private JLabel descriptionLabel;

    private JLabel j1, j2, j3, j4, j5;
    private JLabel j6, j7, j8, j9;

    private JTextField jt1;
    private JTextField jt2;
    private JTextField jt3;

    private JPasswordField jp;

    private JRadioButton male;
    private JRadioButton female;
    private JRadioButton others;

    private JComboBox<String> jcb1;
    private JComboBox<String> jcb2;
    private JComboBox<String> jcb3;

    private Checkbox jc1;
    private Checkbox jc2;
    private Checkbox jc3;

    private Button REGISTER;
    private Button CLEAR;

    String name;
    String email;
    String password;
    String gender;
    String address;
    String depart;
    String year;
    String hobb;
    String contact;


    public register() {

        // ==========================================
        // FRAME
        // ==========================================

        setTitle("Student Registration Portal");

        setSize(750, 700);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        setLayout(null);


        // ==========================================
        // PAGE BACKGROUND
        // ==========================================

        getContentPane().setBackground(
                new Color(225, 238, 250)
        );


        // ==========================================
        // WHITE REGISTRATION CARD
        // ==========================================

        Panel registerPanel = new Panel();

        registerPanel.setLayout(null);

        registerPanel.setBackground(
                Color.WHITE
        );

        registerPanel.setBounds(
                75,
                25,
                600,
                600
        );

        add(registerPanel);


        // ==========================================
        // TITLE
        // ==========================================

        title = new JLabel(
                "STUDENT REGISTRATION"
        );

        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        26
                )
        );

        title.setForeground(
                new Color(25, 75, 135)
        );

        title.setBounds(
                165,
                20,
                350,
                40
        );

        registerPanel.add(title);


        // ==========================================
        // WELCOME TEXT
        // ==========================================

        welcomeLabel = new JLabel(
                "Create Your Student Account"
        );

        welcomeLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        18
                )
        );

        welcomeLabel.setForeground(
                new Color(45, 55, 70)
        );

        welcomeLabel.setBounds(
                175,
                60,
                300,
                30
        );

        registerPanel.add(welcomeLabel);


        // ==========================================
        // DESCRIPTION
        // ==========================================

        descriptionLabel = new JLabel(
                "Enter your details to register with the portal"
        );

        descriptionLabel.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        12
                )
        );

        descriptionLabel.setForeground(
                new Color(120, 130, 140)
        );

        descriptionLabel.setBounds(
                165,
                88,
                320,
                25
        );

        registerPanel.add(descriptionLabel);


        // ==========================================
        // LABELS
        // ==========================================

        j1 = createLabel("Name");
        j2 = createLabel("Email");
        j3 = createLabel("Password");
        j4 = createLabel("Gender");
        j5 = createLabel("City");
        j6 = createLabel("Department");
        j7 = createLabel("Year");
        j8 = createLabel("Hobbies");
        j9 = createLabel("Contact");


        // ==========================================
        // TEXT FIELDS
        // ==========================================

        jt1 = createTextField();
        jt2 = createTextField();
        jt3 = createTextField();

        jp = new JPasswordField();

        jp.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        14
                )
        );


        // ==========================================
        // GENDER
        // ==========================================

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        others = new JRadioButton("Others");

        styleRadioButton(male);
        styleRadioButton(female);
        styleRadioButton(others);


        // ==========================================
        // CITY
        // ==========================================

        String[] cities = {
                "Select City",
                "Hyderabad",
                "Chennai",
                "Bangalore",
                "Delhi"
        };

        jcb1 = new JComboBox<>(cities);

        styleComboBox(jcb1);


        // ==========================================
        // DEPARTMENT
        // ==========================================

        String[] departments = {
                "Select Department",
                "CSE",
                "ECE",
                "IT",
                "EEE",
                "AIML"
        };

        jcb2 = new JComboBox<>(departments);

        styleComboBox(jcb2);


        // ==========================================
        // YEAR
        // ==========================================

        String[] years = {
                "Select Year",
                "2023",
                "2024",
                "2025",
                "2026"
        };

        jcb3 = new JComboBox<>(years);

        styleComboBox(jcb3);


        // ==========================================
        // HOBBIES
        // ==========================================

        jc1 = new Checkbox("Music");
        jc2 = new Checkbox("Sports");
        jc3 = new Checkbox("Coding");

        styleCheckbox(jc1);
        styleCheckbox(jc2);
        styleCheckbox(jc3);


        // ==========================================
        // POSITIONS
        // ==========================================

        j1.setBounds(70, 125, 130, 30);
        jt1.setBounds(210, 120, 320, 35);

        j2.setBounds(70, 170, 130, 30);
        jt2.setBounds(210, 165, 320, 35);

        j3.setBounds(70, 215, 130, 30);
        jp.setBounds(210, 210, 320, 35);

        j4.setBounds(70, 260, 130, 30);

        male.setBounds(210, 255, 90, 30);
        female.setBounds(305, 255, 100, 30);
        others.setBounds(410, 255, 100, 30);

        j5.setBounds(70, 305, 130, 30);
        jcb1.setBounds(210, 300, 320, 35);

        j6.setBounds(70, 350, 130, 30);
        jcb2.setBounds(210, 345, 320, 35);

        j7.setBounds(70, 395, 130, 30);
        jcb3.setBounds(210, 390, 320, 35);

        j8.setBounds(70, 440, 130, 30);

        jc1.setBounds(210, 435, 90, 30);
        jc2.setBounds(305, 435, 100, 30);
        jc3.setBounds(410, 435, 100, 30);

        j9.setBounds(70, 485, 130, 30);
        jt3.setBounds(210, 480, 320, 35);


        // ==========================================
        // BUTTONS
        // ==========================================

        REGISTER = new Button("REGISTER");

        REGISTER.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        REGISTER.setBackground(
                new Color(35, 110, 200)
        );

        REGISTER.setForeground(
                Color.WHITE
        );

        REGISTER.setBounds(
                210,
                535,
                140,
                40
        );


        CLEAR = new Button("CLEAR");

        CLEAR.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        CLEAR.setBackground(
                new Color(110, 120, 130)
        );

        CLEAR.setForeground(
                Color.WHITE
        );

        CLEAR.setBounds(
                370,
                535,
                140,
                40
        );


        // ==========================================
        // ADD COMPONENTS
        // ==========================================

        registerPanel.add(j1);
        registerPanel.add(jt1);

        registerPanel.add(j2);
        registerPanel.add(jt2);

        registerPanel.add(j3);
        registerPanel.add(jp);

        registerPanel.add(j4);
        registerPanel.add(male);
        registerPanel.add(female);
        registerPanel.add(others);

        registerPanel.add(j5);
        registerPanel.add(jcb1);

        registerPanel.add(j6);
        registerPanel.add(jcb2);

        registerPanel.add(j7);
        registerPanel.add(jcb3);

        registerPanel.add(j8);
        registerPanel.add(jc1);
        registerPanel.add(jc2);
        registerPanel.add(jc3);

        registerPanel.add(j9);
        registerPanel.add(jt3);

        registerPanel.add(REGISTER);
        registerPanel.add(CLEAR);


        // ==========================================
        // LISTENERS
        // ==========================================

        REGISTER.addActionListener(this);
        CLEAR.addActionListener(this);

        male.addActionListener(this);
        female.addActionListener(this);
        others.addActionListener(this);

        jcb1.addItemListener(this);
        jcb2.addItemListener(this);
        jcb3.addItemListener(this);

        jc1.addItemListener(this);
        jc2.addItemListener(this);
        jc3.addItemListener(this);
    }


    // ==========================================
    // CREATE LABEL
    // ==========================================

    private JLabel createLabel(
            String text
    ) {

        JLabel label =
                new JLabel(text);

        label.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        label.setForeground(
                new Color(50, 60, 70)
        );

        return label;
    }


    // ==========================================
    // CREATE TEXT FIELD
    // ==========================================

    private JTextField createTextField() {

        JTextField field =
                new JTextField();

        field.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        14
                )
        );

        return field;
    }


    // ==========================================
    // RADIO BUTTON STYLE
    // ==========================================

    private void styleRadioButton(
            JRadioButton button
    ) {

        button.setBackground(
                Color.WHITE
        );

        button.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        13
                )
        );
    }


    // ==========================================
    // CHECKBOX STYLE
    // ==========================================

    private void styleCheckbox(
            Checkbox checkbox
    ) {

        checkbox.setBackground(
                Color.WHITE
        );

        checkbox.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        13
                )
        );
    }


    // ==========================================
    // COMBO BOX STYLE
    // ==========================================

    private void styleComboBox(
            JComboBox<String> combo
    ) {

        combo.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        14
                )
        );

        combo.setBackground(
                Color.WHITE
        );
    }


    // ==========================================
    // ITEM LISTENER
    // ==========================================

    @Override
    public void itemStateChanged(
            ItemEvent e
    ) {

        if (e.getSource() == jcb1
                && e.getStateChange()
                == ItemEvent.SELECTED) {

            address =
                    (String) jcb1.getSelectedItem();
        }


        if (e.getSource() == jcb2
                && e.getStateChange()
                == ItemEvent.SELECTED) {

            depart =
                    (String) jcb2.getSelectedItem();
        }


        if (e.getSource() == jcb3
                && e.getStateChange()
                == ItemEvent.SELECTED) {

            year =
                    (String) jcb3.getSelectedItem();
        }


        if (e.getSource() == jc1
                && jc1.getState()) {

            hobb = "Music";
        }


        if (e.getSource() == jc2
                && jc2.getState()) {

            hobb = "Sports";
        }


        if (e.getSource() == jc3
                && jc3.getState()) {

            hobb = "Coding";
        }
    }


    // ==========================================
    // ACTION LISTENER
    // ==========================================

    @Override
    public void actionPerformed(
            ActionEvent e
    ) {


        // ==========================================
        // MALE
        // ==========================================

        if (e.getSource() == male) {

            female.setSelected(false);
            others.setSelected(false);

            gender = "Male";
        }


        // ==========================================
        // FEMALE
        // ==========================================

        if (e.getSource() == female) {

            male.setSelected(false);
            others.setSelected(false);

            gender = "Female";
        }


        // ==========================================
        // OTHERS
        // ==========================================

        if (e.getSource() == others) {

            male.setSelected(false);
            female.setSelected(false);

            gender = "Others";
        }


        // ==========================================
        // CLEAR
        // ==========================================

        if (e.getSource() == CLEAR) {

            jt1.setText("");
            jt2.setText("");
            jp.setText("");
            jt3.setText("");

            male.setSelected(false);
            female.setSelected(false);
            others.setSelected(false);

            jc1.setState(false);
            jc2.setState(false);
            jc3.setState(false);

            jcb1.setSelectedIndex(0);
            jcb2.setSelectedIndex(0);
            jcb3.setSelectedIndex(0);

            gender = null;
            address = null;
            depart = null;
            year = null;
            hobb = null;

            JOptionPane.showMessageDialog(
                    this,
                    "Registration form cleared.",
                    "Clear",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }


        // ==========================================
        // REGISTER
        // ==========================================

        if (e.getSource() == REGISTER) {

            name =
                    jt1.getText().trim();

            email =
                    jt2.getText().trim();

            password =
                    new String(
                            jp.getPassword()
                    );

            contact =
                    jt3.getText().trim();


            // ======================================
            // VALIDATION
            // ======================================

            if (name.isEmpty()
                    || email.isEmpty()
                    || password.isEmpty()
                    || gender == null
                    || address == null
                    || address.equals("Select City")
                    || depart == null
                    || depart.equals("Select Department")
                    || year == null
                    || year.equals("Select Year")
                    || contact.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please fill all required fields.",
                        "Registration",
                        JOptionPane.WARNING_MESSAGE
                );

                return;
            }


            // ======================================
            // DATABASE
            // ======================================

            try {

                Connection con =
                        DBConnection.getConnection();


                String sql =
                        "INSERT INTO mainproj "
                        + "(name,email,password,gender,address,"
                        + "depart,year,hobb,contact) "
                        + "VALUES (?,?,?,?,?,?,?,?,?)";


                PreparedStatement ps =
                        con.prepareStatement(sql);


                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, password);
                ps.setString(4, gender);
                ps.setString(5, address);
                ps.setString(6, depart);
                ps.setString(7, year);
                ps.setString(8, hobb);
                ps.setString(9, contact);


                int result =
                        ps.executeUpdate();


                if (result > 0) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Registration Successful!",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE
                    );


                    dashboard d =
                            new dashboard(
                                    name,
                                    email
                            );

                    d.setVisible(true);

                    this.dispose();
                }


                ps.close();

                con.close();

            }
            catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Registration Failed\n"
                                + ex.getMessage(),
                        "Database Error",
                        JOptionPane.ERROR_MESSAGE
                );

                ex.printStackTrace();
            }
        }
    }


    // ==========================================
    // MAIN METHOD
    // ==========================================

    public static void main(
            String[] args
    ) {

        register r =
                new register();

        r.setVisible(true);
    }
}

/*package com.mainprojstudent;
////---------------old code-------------
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class register extends JFrame
        implements ActionListener, ItemListener {

    private JLabel j1, j2, j3, j4, j5;
    private JLabel j6, j7, j8, j9;

    private JTextField jt1;
    private JTextField jt2;
    private JTextField jt3;

    private JPasswordField jp;

    private JRadioButton male;
    private JRadioButton female;
    private JRadioButton others;

    private JComboBox<String> jcb1;
    private JComboBox<String> jcb2;
    private JComboBox<String> jcb3;

    private Checkbox jc1;
    private Checkbox jc2;
    private Checkbox jc3;

    private Button REGISTER;
    private Button CLEAR;

    String name;
    String email;
    String password;
    String gender;
    String address;
    String depart;
    String year;
    String hobb;
    String contact;

    public register() {

        // ==============================
        // LABELS
        // ==============================

        j1 = new JLabel("Name");
        j2 = new JLabel("Email");
        j3 = new JLabel("Password");
        j4 = new JLabel("Gender");
        j5 = new JLabel("City");
        j6 = new JLabel("Department");
        j7 = new JLabel("Year");
        j8 = new JLabel("Hobbies");
        j9 = new JLabel("Contact");


        // ==============================
        // TEXT FIELDS
        // ==============================

        jt1 = new JTextField();
        jt2 = new JTextField();
        jt3 = new JTextField();

        jp = new JPasswordField();


        // ==============================
        // GENDER
        // ==============================

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        others = new JRadioButton("Others");


        // ==============================
        // CITY
        // ==============================

        String[] cities = {
                "Select City",
                "Hyderabad",
                "Chennai",
                "Bangalore",
                "Delhi"
        };

        jcb1 = new JComboBox<>(cities);


        // ==============================
        // DEPARTMENT
        // ==============================

        String[] departments = {
                "Select Department",
                "CSE",
                "ECE",
                "IT",
                "EEE",
                "AIML"
        };

        jcb2 = new JComboBox<>(departments);


        // ==============================
        // YEAR
        // ==============================

        String[] years = {
                "Select Year",
                "2023",
                "2024",
                "2025",
                "2026"
        };

        jcb3 = new JComboBox<>(years);


        // ==============================
        // HOBBIES
        // ==============================

        jc1 = new Checkbox("Music");
        jc2 = new Checkbox("Sports");
        jc3 = new Checkbox("Coding");


        // ==============================
        // BUTTONS
        // ==============================

        REGISTER = new Button("REGISTER");
        REGISTER.setBackground(Color.MAGENTA);

        CLEAR = new Button("CLEAR");
        CLEAR.setBackground(Color.MAGENTA);


        // ==============================
        // FRAME
        // ==============================

        setLayout(null);

        setTitle("Student Registration");
        setSize(800, 800);


        // ==============================
        // BOUNDS
        // ==============================

        j1.setBounds(150, 80, 150, 40);
        jt1.setBounds(320, 80, 300, 40);

        j2.setBounds(150, 140, 150, 40);
        jt2.setBounds(320, 140, 300, 40);

        j3.setBounds(150, 200, 150, 40);
        jp.setBounds(320, 200, 300, 40);

        j4.setBounds(150, 260, 150, 40);

        male.setBounds(320, 260, 90, 40);
        female.setBounds(410, 260, 100, 40);
        others.setBounds(510, 260, 100, 40);

        j5.setBounds(150, 320, 150, 40);
        jcb1.setBounds(320, 320, 300, 40);

        j6.setBounds(150, 380, 150, 40);
        jcb2.setBounds(320, 380, 300, 40);

        j7.setBounds(150, 440, 150, 40);
        jcb3.setBounds(320, 440, 300, 40);

        j8.setBounds(150, 500, 150, 40);

        jc1.setBounds(320, 500, 90, 40);
        jc2.setBounds(410, 500, 100, 40);
        jc3.setBounds(510, 500, 100, 40);

        j9.setBounds(150, 560, 150, 40);
        jt3.setBounds(320, 560, 300, 40);

        REGISTER.setBounds(270, 650, 120, 45);
        CLEAR.setBounds(410, 650, 120, 45);


        // ==============================
        // ADD COMPONENTS
        // ==============================

        add(j1);
        add(jt1);

        add(j2);
        add(jt2);

        add(j3);
        add(jp);

        add(j4);
        add(male);
        add(female);
        add(others);

        add(j5);
        add(jcb1);

        add(j6);
        add(jcb2);

        add(j7);
        add(jcb3);

        add(j8);
        add(jc1);
        add(jc2);
        add(jc3);

        add(j9);
        add(jt3);

        add(REGISTER);
        add(CLEAR);


        // ==============================
        // LISTENERS
        // ==============================

        REGISTER.addActionListener(this);
        CLEAR.addActionListener(this);

        male.addActionListener(this);
        female.addActionListener(this);
        others.addActionListener(this);

        jcb1.addItemListener(this);
        jcb2.addItemListener(this);
        jcb3.addItemListener(this);

        jc1.addItemListener(this);
        jc2.addItemListener(this);
        jc3.addItemListener(this);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
    }


    // ==============================
    // ITEM LISTENER
    // ==============================

    @Override
    public void itemStateChanged(ItemEvent e) {

        if (e.getSource() == jcb1) {
            address = (String) jcb1.getSelectedItem();
        }

        if (e.getSource() == jcb2) {
            depart = (String) jcb2.getSelectedItem();
        }

        if (e.getSource() == jcb3) {
            year = (String) jcb3.getSelectedItem();
        }

        if (e.getSource() == jc1 && jc1.getState()) {
            hobb = "Music";
        }

        if (e.getSource() == jc2 && jc2.getState()) {
            hobb = "Sports";
        }

        if (e.getSource() == jc3 && jc3.getState()) {
            hobb = "Coding";
        }
    }


    // ==============================
    // ACTION LISTENER
    // ==============================

    @Override
    public void actionPerformed(ActionEvent e) {


        // ==============================
        // MALE
        // ==============================

        if (e.getSource() == male) {

            female.setSelected(false);
            others.setSelected(false);

            gender = "Male";
        }


        // ==============================
        // FEMALE
        // ==============================

        if (e.getSource() == female) {

            male.setSelected(false);
            others.setSelected(false);

            gender = "Female";
        }


        // ==============================
        // OTHERS
        // ==============================

        if (e.getSource() == others) {

            male.setSelected(false);
            female.setSelected(false);

            gender = "Others";
        }


        // ==============================
        // CLEAR
        // ==============================

        if (e.getSource() == CLEAR) {

            jt1.setText("");
            jt2.setText("");
            jp.setText("");
            jt3.setText("");

            male.setSelected(false);
            female.setSelected(false);
            others.setSelected(false);

            jc1.setState(false);
            jc2.setState(false);
            jc3.setState(false);

            jcb1.setSelectedIndex(0);
            jcb2.setSelectedIndex(0);
            jcb3.setSelectedIndex(0);

            gender = null;
            address = null;
            depart = null;
            year = null;
            hobb = null;

            JOptionPane.showMessageDialog(
                    this,
                    "Form Cleared"
            );
        }


        // ==============================
        // REGISTER
        // ==============================

        if (e.getSource() == REGISTER) {

            name = jt1.getText().trim();
            email = jt2.getText().trim();
            password = new String(jp.getPassword());
            contact = jt3.getText().trim();


            if (name.isEmpty() ||
                email.isEmpty() ||
                password.isEmpty() ||
                gender == null ||
                address == null ||
                address.equals("Select City") ||
                depart == null ||
                depart.equals("Select Department") ||
                year == null ||
                year.equals("Select Year") ||
                contact.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please fill all required fields"
                );

                return;
            }


            // ==============================
            // DATABASE
            // ==============================

            try {

                Connection con =
                        DBConnection.getConnection();

                String sql =
                        "INSERT INTO mainproj "
                        + "(name,email,password,gender,address,"
                        + "depart,year,hobb,contact) "
                        + "VALUES (?,?,?,?,?,?,?,?,?)";

                PreparedStatement ps =
                        con.prepareStatement(sql);

                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, password);
                ps.setString(4, gender);
                ps.setString(5, address);
                ps.setString(6, depart);
                ps.setString(7, year);
                ps.setString(8, hobb);
                ps.setString(9, contact);

                int result = ps.executeUpdate();


                if (result > 0) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Registration Successful"
                    );

                    dashboard d =
                            new dashboard(name, email);

                    d.setVisible(true);

                    this.dispose();
                }

                ps.close();
                con.close();

            }
            catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Registration Failed\n"
                        + ex.getMessage()
                );

                ex.printStackTrace();
            }
        }
    }
}*/

/*package com.mainprojstudent;

	
	import java.awt.Button;
	import java.awt.Checkbox;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
	import javax.swing.JRadioButton;
	import javax.swing.JTextField;

	public class register extends JFrame implements ActionListener,ItemListener
	{

		
		private JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9;
		private JTextField jt1;
		private JTextField jt2;

		private JPasswordField jp;
		private JRadioButton male,female,others;
		private JComboBox<String> jcb1;
		private JComboBox<String> jcb2;
		private JComboBox<Integer> jcb3;

		

		private Checkbox jc1;
		private Checkbox jc2;
		private Checkbox jc3;
		
		private JTextField jt3;
		private Button CLEAR;
		private Button REGISTER;
		String password;
		String gender;
		String address;
		String depart;
		Integer year;
		String hobb;
		String contact;
		String name;
		String email;
		
		
		public register() {

		    // Labels
		    j1 = new JLabel("Name");
		    j2 = new JLabel("Email*");
		    j3 = new JLabel("Password*");
		    j4 = new JLabel("Gender*");
		    j5 = new JLabel("City*");
		    j6 = new JLabel("Department*");
		    j7 = new JLabel("Year*");
		    j8 = new JLabel("Hobbies");
		    j9 = new JLabel("Contact");

		    // Text fields
		    jt1 = new JTextField();
		    jt2 = new JTextField();
		    jp= new JPasswordField();

		    // Radio buttons
		    male = new JRadioButton("Male");
		    female = new JRadioButton("Female");
		    others = new JRadioButton("Others");

		    // City
		    Vector<String> v = new Vector<>();
		    v.add("Select the address");
		    v.add("Hyderabad");
		    v.add("Chennai");
		    v.add("Bangalore");
		    v.add("Delhi");

		    // Department
		    Vector<String> v1 = new Vector<>();
		    v1.add("CSE");
		    v1.add("ECE");
		    v1.add("IT");
		    v1.add("EEE");
		    v1.add("AIML");

		    // Year
		    Vector<Integer> v2 = new Vector<>();
		    v2.add(2023);
		    v2.add(2024);
		    v2.add(2025);
		    v2.add(2026);

		    // Combo boxes
		    jcb1 = new JComboBox<>(v);
		    jcb2 = new JComboBox<>(v1);
		    jcb3 = new JComboBox<>(v2);

		    // Checkboxes
		    jc1 = new Checkbox("Music");
		    jc2 = new Checkbox("Sports");
		    jc3 = new Checkbox("Coding");

		    // Contact
		    jt3 = new JTextField();

		    // Buttons
		    REGISTER = new Button("REGISTER");
		   // REGISTER.setForeground(Color.OPAQUE);
		    REGISTER.setBackground(Color.MAGENTA);
		    CLEAR = new Button("CLEAR");
		   CLEAR.setBackground(Color.MAGENTA);


		    // Null layoutd
		    setLayout(null);

		    // Name
		    j1.setBounds(150, 80, 150, 40);
		    jt1.setBounds(320, 80, 300, 40);

		    // Email
		    j2.setBounds(150, 140, 150, 40);
		    jt2.setBounds(320, 140, 300, 40);

		    // Password
		    j3.setBounds(150, 200, 150, 40);
		    jp.setBounds(320, 200, 300, 40);

		    // Gender
		    j4.setBounds(150, 260, 150, 40);
		    male.setBounds(320, 260, 90, 40);
		    female.setBounds(410, 260, 100, 40);
		    others.setBounds(510, 260, 100, 40);

		    // City

j5.setBounds(150, 320, 150, 40);
jcb1.setBounds(320, 320, 300, 40);

		    // Department
j6.setBounds(150, 380, 150, 40);
jcb2.setBounds(320, 380, 300, 40);

		    // Year
j7.setBounds(150, 440, 150, 40);
jcb3.setBounds(320, 440, 300, 40);

		    // Hobbies
j8.setBounds(150, 500, 150, 40);
jc1.setBounds(320, 500, 90, 40);
jc2.setBounds(410, 500, 100, 40);
jc3.setBounds(510, 500, 100, 40);

		    // Contact
j9.setBounds(150, 560, 150, 40);
jt3.setBounds(320, 560, 300, 40);
		    // Buttons
		  
REGISTER.setBounds(270, 650, 120, 45);
CLEAR.setBounds(410, 650, 120, 45);
		    // Add components
		    add(j1);
		    add(jt1);

		    add(j2);
		    add(jt2);

		    add(j3);
		    add(jp);

		    add(j4);
		    add(male);
		    add(female);
		    add(others);

		    add(j5);
		    add(jcb1);

		    add(j6);
		    add(jcb2);

		    add(j7);
		    add(jcb3);

		    add(j8);
		    add(jc1);
		    add(jc2);
		    add(jc3);

		    add(j9);
		    add(jt3);

		    add(REGISTER);
		    add(CLEAR);

		jt1.addActionListener(this);
		jt2.addActionListener(this);
		jt3.addActionListener(this);
		jp.addActionListener(this);
jcb1.addItemListener(this);
jcb2.addItemListener(this);
jcb3.addItemListener(this);
CLEAR.addActionListener(this);
REGISTER.addActionListener(this);
jc1.addItemListener(this);
jc2.addItemListener(this);
jc3.addItemListener(this);




		    male.addActionListener(this);
	        female.addActionListener(this);
	        others.addActionListener(this);

			
			
			
		}

		 @Override
		 public void itemStateChanged(ItemEvent ii) {
			// TODO Auto-generated method stub
			if(ii.getSource().equals(jcb1)){
				address=(String)jcb1.getSelectedItem();
			}
			if(ii.getSource().equals(jcb2)){
				depart=(String)jcb2.getSelectedItem();
			}
			 
			if(ii.getSource().equals(jcb3)){
				year=(Integer)jcb3.getSelectedItem();
			}
			if (ii.getSource().equals(jc1)) {
			    hobb = "Music";
			}

			if (ii.getSource().equals(jc2)) {
			    hobb = "Sports";
			}

			if (ii.getSource().equals(jc3)) {
			    hobb = "Coding";
			}
			 
			 
		 }
	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource().equals(CLEAR)) {
				
				
				jt1.setText("");
				jt2.setText("");
				jp.setText("");
				jt3.setText("");
				
				
			}
			
			if(e.getSource().equals(male)) {
				female.setSelected(false);
				others.setSelected(false);

				gender=male.getText();
			}
		if(e.getSource().equals(female)) {
			male.setSelected(false);
			others.setSelected(false);
			gender=female.getText();
			}
		if(e.getSource().equals(others)) {
			male.setSelected(false);
			female.setSelected(false);
			gender=others.getText();
		}


			if(e.getSource().equals(REGISTER)) {

				 name=jt1.getText();
				 email=jt2.getText();
				 password=jp.getText();
				contact=jt3.getText();
			}
			
			try {
			//con to mysql
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root","root");
		
			PreparedStatement ps=con.prepareStatement("insert into mainproj values(?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3,password);
			ps.setString(4,gender);
			ps.setString(5,address);
			ps.setString(6,depart);
			ps.setInt(7,year);
			ps.setString(8,hobb);

			ps.setString(9,contact);

			
			
			
			int rw=ps.executeUpdate();
			
			JOptionPane.showMessageDialog(this, "succesfull");
			}
			catch (Exception er) {
				
				er.printStackTrace();
			}
			}
			




			
		
			
			
			
		} */


	

