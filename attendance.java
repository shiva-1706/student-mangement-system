package com.mainprojstudent;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class attendance extends JFrame
        implements ActionListener {

    private JLabel title;
    private JLabel javaLabel;
    private JLabel dbmsLabel;
    private JLabel webLabel;
    private JLabel dsLabel;
    private JLabel note;

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


    public attendance() {

        // =========================================
        // FRAME SETTINGS
        // =========================================

        setTitle("Student Attendance");

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
                "STUDENT ATTENDANCE"
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
        // JAVA
        // =========================================

        javaLabel = new JLabel(
                "Java Programming"
        );

        javaLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16
                )
        );

        javaLabel.setForeground(
                textColor
        );

        javaLabel.setBounds(
                80, 140, 250, 35
        );

        add(javaLabel);


        JLabel javaPercentage =
                new JLabel("85%");

        javaPercentage.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16
                )
        );

        javaPercentage.setForeground(
                new Color(40, 150, 80)
        );

        javaPercentage.setBounds(
                430, 140, 80, 35
        );

        add(javaPercentage);


        // =========================================
        // DBMS
        // =========================================

        dbmsLabel = new JLabel(
                "DBMS"
        );

        dbmsLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16
                )
        );

        dbmsLabel.setForeground(
                textColor
        );

        dbmsLabel.setBounds(
                80, 195, 250, 35
        );

        add(dbmsLabel);


        JLabel dbmsPercentage =
                new JLabel("90%");

        dbmsPercentage.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16
                )
        );

        dbmsPercentage.setForeground(
                new Color(40, 150, 80)
        );

        dbmsPercentage.setBounds(
                430, 195, 80, 35
        );

        add(dbmsPercentage);


        // =========================================
        // WEB TECHNOLOGIES
        // =========================================

        webLabel = new JLabel(
                "Web Technologies"
        );

        webLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16
                )
        );

        webLabel.setForeground(
                textColor
        );

        webLabel.setBounds(
                80, 250, 250, 35
        );

        add(webLabel);


        JLabel webPercentage =
                new JLabel("80%");

        webPercentage.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16
                )
        );

        webPercentage.setForeground(
                new Color(40, 150, 80)
        );

        webPercentage.setBounds(
                430, 250, 80, 35
        );

        add(webPercentage);


        // =========================================
        // DATA STRUCTURES
        // =========================================

        dsLabel = new JLabel(
                "Data Structures"
        );

        dsLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16
                )
        );

        dsLabel.setForeground(
                textColor
        );

        dsLabel.setBounds(
                80, 305, 250, 35
        );

        add(dsLabel);


        JLabel dsPercentage =
                new JLabel("88%");

        dsPercentage.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16
                )
        );

        dsPercentage.setForeground(
                new Color(40, 150, 80)
        );

        dsPercentage.setBounds(
                430, 305, 80, 35
        );

        add(dsPercentage);


        // =========================================
        // NOTE
        // =========================================

        note = new JLabel(
                "Attendance percentage is based on current records."
        );

        note.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        12
                )
        );

        note.setForeground(
                new Color(100, 100, 100)
        );

        note.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        note.setBounds(
                100, 355, 400, 30
        );

        add(note);


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
                220, 405, 160, 45
        );

        add(close);


        // =========================================
        // LISTENER
        // =========================================

        close.addActionListener(this);
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


