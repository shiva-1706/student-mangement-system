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

public class studentidcard extends JFrame
        implements ActionListener {

    private String name;
    private String email;

    private JLabel title;
    private JLabel collegeName;
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel departmentLabel;
    private JLabel yearLabel;
    private JLabel cardNote;

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

    public studentidcard(
            String name,
            String email) {

        this.name = name;
        this.email = email;


        // =========================================
        // FRAME SETTINGS
        // =========================================

        setTitle("Student ID Card");

        setSize(600, 600);

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
                "STUDENT ID CARD"
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
                100, 25, 400, 40
        );

        header.add(title);


        // =========================================
        // COLLEGE NAME
        // =========================================

        collegeName = new JLabel(
                "STUDENT IDENTIFICATION"
        );

        collegeName.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        13
                )
        );

        collegeName.setForeground(
                new Color(220, 230, 245)
        );

        collegeName.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        collegeName.setBounds(
                100, 70, 400, 25
        );

        header.add(collegeName);


        // =========================================
        // NAME
        // =========================================

        nameLabel = new JLabel(
                "Name: "
        );

        styleLabel(nameLabel);

        nameLabel.setBounds(
                80, 145, 440, 40
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
                80, 200, 440, 40
        );

        add(emailLabel);


        // =========================================
        // DEPARTMENT
        // =========================================

        departmentLabel = new JLabel(
                "Department: "
        );

        styleLabel(departmentLabel);

        departmentLabel.setBounds(
                80, 255, 440, 40
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
                80, 310, 440, 40
        );

        add(yearLabel);


        // =========================================
        // NOTE
        // =========================================

        cardNote = new JLabel(
                "This card is issued to the registered student."
        );

        cardNote.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        12
                )
        );

        cardNote.setForeground(
                new Color(100, 100, 100)
        );

        cardNote.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        cardNote.setBounds(
                80, 370, 440, 30
        );

        add(cardNote);


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
                220, 425, 160, 45
        );

        add(close);


        // =========================================
        // LISTENER
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
                        16
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
                    "SELECT name,email,depart,year "
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

                departmentLabel.setText(
                        "Department: "
                        + rs.getString("depart")
                );

                yearLabel.setText(
                        "Year: "
                        + rs.getString("year")
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
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class studentidcard extends JFrame
        implements ActionListener {

    private String name;
    private String email;

    private JLabel title;
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel departmentLabel;
    private JLabel yearLabel;

    private Button close;


    public studentidcard(
            String name,
            String email) {

        this.name = name;
        this.email = email;


        setTitle("Student ID Card");

        setSize(600, 500);

        setLayout(null);


        title =
                new JLabel(
                        "STUDENT ID CARD"
                );

        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        25
                )
        );

        title.setForeground(Color.BLUE);


        nameLabel =
                new JLabel("Name: ");

        emailLabel =
                new JLabel("Email: ");

        departmentLabel =
                new JLabel("Department: ");

        yearLabel =
                new JLabel("Year: ");


        title.setBounds(
                190, 50, 300, 40
        );

        nameLabel.setBounds(
                100, 130, 400, 40
        );

        emailLabel.setBounds(
                100, 180, 400, 40
        );

        departmentLabel.setBounds(
                100, 230, 400, 40
        );

        yearLabel.setBounds(
                100, 280, 400, 40
        );


        close =
                new Button("CLOSE");

        close.setBounds(
                220, 350, 120, 40
        );


        add(title);
        add(nameLabel);
        add(emailLabel);
        add(departmentLabel);
        add(yearLabel);
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
                    "SELECT name,email,depart,year "
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

                departmentLabel.setText(
                        "Department: "
                        + rs.getString("depart")
                );

                yearLabel.setText(
                        "Year: "
                        + rs.getString("year")
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