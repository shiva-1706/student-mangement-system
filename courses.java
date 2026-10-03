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

public class courses extends JFrame
        implements ActionListener {

    private JLabel title;
    private JLabel c1;
    private JLabel c2;
    private JLabel c3;
    private JLabel c4;
    private JLabel c5;
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


    public courses() {

        // =========================================
        // FRAME SETTINGS
        // =========================================

        setTitle("Available Courses");

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
                "AVAILABLE COURSES"
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
        // COURSE 1
        // =========================================

        c1 = new JLabel(
                "1.  Java Programming"
        );

        styleCourse(c1);

        c1.setBounds(
                80, 135, 440, 40
        );

        add(c1);


        // =========================================
        // COURSE 2
        // =========================================

        c2 = new JLabel(
                "2.  Database Management System"
        );

        styleCourse(c2);

        c2.setBounds(
                80, 190, 440, 40
        );

        add(c2);


        // =========================================
        // COURSE 3
        // =========================================

        c3 = new JLabel(
                "3.  Web Technologies"
        );

        styleCourse(c3);

        c3.setBounds(
                80, 245, 440, 40
        );

        add(c3);


        // =========================================
        // COURSE 4
        // =========================================

        c4 = new JLabel(
                "4.  Data Structures"
        );

        styleCourse(c4);

        c4.setBounds(
                80, 300, 440, 40
        );

        add(c4);


        // =========================================
        // COURSE 5
        // =========================================

        c5 = new JLabel(
                "5.  Computer Networks"
        );

        styleCourse(c5);

        c5.setBounds(
                80, 355, 440, 40
        );

        add(c5);


        // =========================================
        // NOTE
        // =========================================

        note = new JLabel(
                "These are the courses currently available."
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
                100, 410, 400, 30
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
                220, 460, 160, 45
        );

        add(close);


        // =========================================
        // LISTENER
        // =========================================

        close.addActionListener(this);
    }


    // =============================================
    // COURSE LABEL DESIGN
    // =============================================

    private void styleCourse(JLabel label) {

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

import javax.swing.JFrame;
import javax.swing.JLabel;

public class courses extends JFrame
        implements ActionListener {

    private JLabel title;
    private JLabel c1;
    private JLabel c2;
    private JLabel c3;
    private JLabel c4;
    private JLabel c5;

    private Button close;


    public courses() {

        setTitle("Courses");

        setSize(600, 500);

        setLayout(null);


        title =
                new JLabel(
                        "AVAILABLE COURSES"
                );

        title.setBounds(
                200, 50, 300, 40
        );


        c1 =
                new JLabel(
                        "1. Java Programming"
                );

        c2 =
                new JLabel(
                        "2. Database Management System"
                );

        c3 =
                new JLabel(
                        "3. Web Technologies"
                );

        c4 =
                new JLabel(
                        "4. Data Structures"
                );

        c5 =
                new JLabel(
                        "5. Computer Networks"
                );


        c1.setBounds(
                100, 130, 400, 40
        );

        c2.setBounds(
                100, 180, 400, 40
        );

        c3.setBounds(
                100, 230, 400, 40
        );

        c4.setBounds(
                100, 280, 400, 40
        );

        c5.setBounds(
                100, 330, 400, 40
        );


        close =
                new Button("CLOSE");

        close.setBounds(
                220, 390, 120, 40
        );


        add(title);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        add(close);


        close.addActionListener(this);


        setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE
        );

        setLocationRelativeTo(null);
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