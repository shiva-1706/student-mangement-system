package com.mainprojstudent;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class profile extends JFrame
        implements ActionListener {

    private String name;
    private String email;

    private JLabel title;
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel genderLabel;
    private JLabel addressLabel;
    private JLabel departmentLabel;
    private JLabel yearLabel;
    private JLabel hobbyLabel;
    private JLabel contactLabel;

    private Button close;

    // =============================================
    // COLORS
    // =============================================

    private Color backgroundColor =
            new Color(245, 247, 250);

    private Color headerColor =
            new Color(30, 60, 114);

    private Color textColor =
            new Color(40, 40, 40);

    private Color closeColor =
            new Color(220, 53, 69);


    // =============================================
    // CONSTRUCTOR
    // =============================================

    public profile(
            String name,
            String email) {

        this.name = name;
        this.email = email;

        // =========================================
        // FRAME SETTINGS
        // =========================================

        setTitle("Student Profile");

        setSize(600, 650);

        setLayout(null);

        getContentPane().setBackground(
                backgroundColor
        );

        setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE
        );

        setLocationRelativeTo(null);


        // =========================================
        // HEADER PANEL
        // =========================================

        JPanel header = new JPanel();

        header.setLayout(null);

        header.setBackground(
                headerColor
        );

        header.setBounds(
                0, 0, 600, 110
        );

        add(header);


        // =========================================
        // TITLE
        // =========================================

        title = new JLabel(
                "STUDENT PROFILE"
        );

        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        25
                )
        );

        title.setForeground(
                Color.WHITE
        );

        title.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        title.setBounds(
                100, 30, 400, 40
        );

        header.add(title);


        // =========================================
        // NAME
        // =========================================

        nameLabel = new JLabel(
                "Name: "
        );

        styleLabel(nameLabel);

        nameLabel.setBounds(
                80, 130, 440, 40
        );

        add(nameLabel);


        // =========================================
        // EMAIL
        // =========================================

        emailLabel = new JLabel(
                "Email: "
        );

        styleLabel(emailLabel);

        emailLabel.setBounds(
                80, 180, 440, 40
        );

        add(emailLabel);


        // =========================================
        // GENDER
        // =========================================

        genderLabel = new JLabel(
                "Gender: "
        );

        styleLabel(genderLabel);

        genderLabel.setBounds(
                80, 230, 440, 40
        );

        add(genderLabel);


        // =========================================
        // ADDRESS
        // =========================================

        addressLabel = new JLabel(
                "Address: "
        );

        styleLabel(addressLabel);

        addressLabel.setBounds(
                80, 280, 440, 40
        );

        add(addressLabel);


        // =========================================
        // DEPARTMENT
        // =========================================

        departmentLabel = new JLabel(
                "Department: "
        );

        styleLabel(departmentLabel);

        departmentLabel.setBounds(
                80, 330, 440, 40
        );

        add(departmentLabel);


        // =========================================
        // YEAR
        // =========================================

        yearLabel = new JLabel(
                "Year: "
        );

        styleLabel(yearLabel);

        yearLabel.setBounds(
                80, 380, 440, 40
        );

        add(yearLabel);


        // =========================================
        // HOBBIES
        // =========================================

        hobbyLabel = new JLabel(
                "Hobbies: "
        );

        styleLabel(hobbyLabel);

        hobbyLabel.setBounds(
                80, 430, 440, 40
        );

        add(hobbyLabel);


        // =========================================
        // CONTACT
        // =========================================

        contactLabel = new JLabel(
                "Contact: "
        );

        styleLabel(contactLabel);

        contactLabel.setBounds(
                80, 480, 440, 40
        );

        add(contactLabel);


        // =========================================
        // CLOSE BUTTON
        // =========================================

        close = new Button(
                "CLOSE"
        );

        close.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        close.setBackground(
                closeColor
        );

        close.setForeground(
                Color.WHITE
        );

        close.setBounds(
                220, 535, 160, 45
        );

        add(close);


        // =========================================
        // BUTTON LISTENER
        // =========================================

        close.addActionListener(this);


        // =========================================
        // LOAD DATABASE DATA
        // =========================================

        loadData();
    }


    // =============================================
    // LABEL DESIGN
    // =============================================

    private void styleLabel(JLabel label) {

        label.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        15
                )
        );

        label.setForeground(
                textColor
        );
    }


    // =============================================
    // LOAD DATA FROM DATABASE
    // =============================================

    private void loadData() {

        try {

            Connection con =
                    DBConnection.getConnection();


            String sql =
                    "SELECT name,email,gender,address,"
                    + "depart,year,hobb,contact "
                    + "FROM mainproj "
                    + "WHERE email=?";


            PreparedStatement ps =
                    con.prepareStatement(sql);


            ps.setString(
                    1,
                    email
            );


            ResultSet rs =
                    ps.executeQuery();


            if (rs.next()) {

                nameLabel.setText(
                        "Name: "
                        + rs.getString("name")
                );

                emailLabel.setText(
                        "Email: "
                        + rs.getString("email")
                );

                genderLabel.setText(
                        "Gender: "
                        + rs.getString("gender")
                );

                addressLabel.setText(
                        "Address: "
                        + rs.getString("address")
                );

                departmentLabel.setText(
                        "Department: "
                        + rs.getString("depart")
                );

                yearLabel.setText(
                        "Year: "
                        + rs.getString("year")
                );

                hobbyLabel.setText(
                        "Hobbies: "
                        + rs.getString("hobb")
                );

                contactLabel.setText(
                        "Contact: "
                        + rs.getString("contact")
                );
            }


            rs.close();

            ps.close();

            con.close();

        }
        catch (Exception e) {

            e.printStackTrace();
        }
    }


    // =============================================
    // ACTION PERFORMED
    // =============================================

    @Override
    public void actionPerformed(
            ActionEvent e) {

        if (e.getSource() == close) {

            this.dispose();
        }
    }
}

/*package com.mainprojstudent;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class profile extends JFrame
        implements ActionListener {

    private String name;
    private String email;

    private JLabel title;
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel genderLabel;
    private JLabel addressLabel;
    private JLabel departmentLabel;
    private JLabel yearLabel;
    private JLabel hobbyLabel;
    private JLabel contactLabel;

    private Button close;


    public profile(
            String name,
            String email) {

        this.name = name;
        this.email = email;


        setTitle("Student Profile");

        setSize(600, 650);

        setLayout(null);


        title =
                new JLabel("STUDENT PROFILE");

        title.setBounds(
                200, 40, 250, 40
        );


        nameLabel =
                new JLabel("Name: ");

        emailLabel =
                new JLabel("Email: ");

        genderLabel =
                new JLabel("Gender: ");

        addressLabel =
                new JLabel("Address: ");

        departmentLabel =
                new JLabel("Department: ");

        yearLabel =
                new JLabel("Year: ");

        hobbyLabel =
                new JLabel("Hobbies: ");

        contactLabel =
                new JLabel("Contact: ");


        nameLabel.setBounds(
                100, 120, 400, 40
        );

        emailLabel.setBounds(
                100, 170, 400, 40
        );

        genderLabel.setBounds(
                100, 220, 400, 40
        );

        addressLabel.setBounds(
                100, 270, 400, 40
        );

        departmentLabel.setBounds(
                100, 320, 400, 40
        );

        yearLabel.setBounds(
                100, 370, 400, 40
        );

        hobbyLabel.setBounds(
                100, 420, 400, 40
        );

        contactLabel.setBounds(
                100, 470, 400, 40
        );


        close =
                new Button("CLOSE");

        close.setBounds(
                220, 530, 120, 40
        );


        add(title);
        add(nameLabel);
        add(emailLabel);
        add(genderLabel);
        add(addressLabel);
        add(departmentLabel);
        add(yearLabel);
        add(hobbyLabel);
        add(contactLabel);
        add(close);


        close.addActionListener(this);


        loadData();


        setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE
        );

        setLocationRelativeTo(null);
    }


    private void loadData() {

        try {

            Connection con =
                    DBConnection.getConnection();


            String sql =
                    "SELECT name,email,gender,address,"
                    + "depart,year,hobb,contact "
                    + "FROM mainproj "
                    + "WHERE email=?";


            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, email);


            ResultSet rs =
                    ps.executeQuery();


            if (rs.next()) {

                nameLabel.setText(
                        "Name: "
                        + rs.getString("name")
                );

                emailLabel.setText(
                        "Email: "
                        + rs.getString("email")
                );

                genderLabel.setText(
                        "Gender: "
                        + rs.getString("gender")
                );

                addressLabel.setText(
                        "Address: "
                        + rs.getString("address")
                );

                departmentLabel.setText(
                        "Department: "
                        + rs.getString("depart")
                );

                yearLabel.setText(
                        "Year: "
                        + rs.getString("year")
                );

                hobbyLabel.setText(
                        "Hobbies: "
                        + rs.getString("hobb")
                );

                contactLabel.setText(
                        "Contact: "
                        + rs.getString("contact")
                );
            }


            rs.close();
            ps.close();
            con.close();

        }
        catch (Exception e) {

            e.printStackTrace();
        }
    }


    @Override
    public void actionPerformed(
            ActionEvent e) {

        if (e.getSource() == close) {

            this.dispose();
        }
    }
}
*/