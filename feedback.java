package com.mainprojstudent;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class feedback extends JFrame
        implements ActionListener {

    private String name;
    private String email;

    private JLabel title;
    private JLabel instruction;
    private JLabel studentInfo;
    private TextArea area;

    private Button submit;
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

    private Color submitColor =
            new Color(40, 150, 80);

    private Color closeColor =
            new Color(220, 53, 69);


    // =============================================
    // CONSTRUCTOR
    // =============================================

    public feedback(
            String name,
            String email) {

        this.name = name;
        this.email = email;

        // =========================================
        // FRAME SETTINGS
        // =========================================

        setTitle("Student Feedback");

        setSize(600, 550);

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
                "STUDENT FEEDBACK"
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
        // STUDENT INFORMATION
        // =========================================

        studentInfo = new JLabel(
                "Student: " + name
        );

        studentInfo.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        13
                )
        );

        studentInfo.setForeground(
                new Color(220, 230, 245)
        );

        studentInfo.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        studentInfo.setBounds(
                100, 70, 400, 25
        );

        header.add(studentInfo);


        // =========================================
        // INSTRUCTION
        // =========================================

        instruction = new JLabel(
                "Please enter your feedback below:"
        );

        instruction.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        15
                )
        );

        instruction.setForeground(
                textColor
        );

        instruction.setBounds(
                100, 130, 400, 30
        );

        add(instruction);


        // =========================================
        // FEEDBACK TEXT AREA
        // =========================================

        area = new TextArea();

        area.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        14
                )
        );

        area.setBackground(
                Color.WHITE
        );

        area.setBounds(
                100, 170, 400, 150
        );

        add(area);


        // =========================================
        // SUBMIT BUTTON
        // =========================================

        submit = new Button(
                "SUBMIT"
        );

        submit.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        submit.setBackground(
                submitColor
        );

        submit.setForeground(
                Color.WHITE
        );

        submit.setBounds(
                150, 350, 130, 45
        );

        add(submit);


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
                320, 350, 130, 45
        );

        add(close);


        // =========================================
        // BUTTON LISTENERS
        // =========================================

        submit.addActionListener(this);

        close.addActionListener(this);
    }


    // =============================================
    // ACTION PERFORMED
    // =============================================

    @Override
    public void actionPerformed(
            ActionEvent e) {

        // =========================================
        // SUBMIT
        // =========================================

        if (e.getSource() == submit) {

            String message =
                    area.getText().trim();


            // =====================================
            // EMPTY FEEDBACK CHECK
            // =====================================

            if (message.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Enter your feedback",
                        "Feedback",
                        JOptionPane.WARNING_MESSAGE
                );

                return;
            }


            // =====================================
            // DATABASE INSERT
            // =====================================

            try {

                Connection con =
                        DBConnection.getConnection();


              /*  String sql =
                        "INSERT INTO feedback "
                        + "(name,email,message) "
                        + "VALUES (?,?,?)"; */
                String sql =
                        "UPDATE mainproj "
                        + "SET feedback=? "
                        + "WHERE email=?";



                PreparedStatement ps =
                        con.prepareStatement(sql);


                ps.setString(
                        1,
                        name
                );

                ps.setString(
                        2,
                        email
                );

                ps.setString(
                        3,
                        message
                );


                ps.executeUpdate();


                // =================================
                // SUCCESS MESSAGE
                // =================================

                JOptionPane.showMessageDialog(
                        this,
                        "Feedback Submitted Successfully!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE
                );


                area.setText("");


                // =================================
                // CLOSE CONNECTION
                // =================================

                ps.close();

                con.close();

            }
            catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Feedback Error\n"
                        + ex.getMessage(),
                        "Database Error",
                        JOptionPane.ERROR_MESSAGE
                );

                ex.printStackTrace();
            }
        }


        // =========================================
        // CLOSE
        // =========================================

        if (e.getSource() == close) {

            this.dispose();
        }
    }
}

/*package com.mainprojstudent;

import java.awt.Button;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class feedback extends JFrame
        implements ActionListener {

    private String name;
    private String email;

    private JLabel title;
    private TextArea area;

    private Button submit;
    private Button close;


    public feedback(
            String name,
            String email) {

        this.name = name;
        this.email = email;


        setTitle("Feedback");

        setSize(600, 500);

        setLayout(null);


        title =
                new JLabel(
                        "STUDENT FEEDBACK"
                );

        title.setBounds(
                200, 50, 300, 40
        );


        area =
                new TextArea();

        area.setBounds(
                100, 130, 400, 150
        );


        submit =
                new Button("SUBMIT");

        close =
                new Button("CLOSE");


        submit.setBounds(
                170, 330, 120, 40
        );

        close.setBounds(
                310, 330, 120, 40
        );


        add(title);
        add(area);
        add(submit);
        add(close);


        submit.addActionListener(this);
        close.addActionListener(this);


        setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE
        );

        setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(
            ActionEvent e) {


        // ==============================
        // SUBMIT
        // ==============================

        if (e.getSource() == submit) {

            String message =
                    area.getText().trim();


            if (message.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Enter your feedback"
                );

                return;
            }


            try {

                Connection con =
                        DBConnection.getConnection();


                // This requires the feedback table.
                String sql =
                        "INSERT INTO feedback "
                        + "(name,email,message) "
                        + "VALUES (?,?,?)";


                PreparedStatement ps =
                        con.prepareStatement(sql);


                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, message);


                ps.executeUpdate();


                JOptionPane.showMessageDialog(
                        this,
                        "Feedback Submitted"
                );


                area.setText("");


                ps.close();
                con.close();

            }
            catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Feedback Error\n"
                        + ex.getMessage()
                );

                ex.printStackTrace();
            }
        }


        // ==============================
        // CLOSE
        // ==============================

        if (e.getSource() == close) {

            this.dispose();
        }
    }
}
*/