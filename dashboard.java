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

public class dashboard extends JFrame implements ActionListener {

    private JLabel title;
    private JLabel welcome;
    private JLabel subtitle;
    private JLabel note;
    private JLabel footer;

    private Button profile;
    private Button courses;
    private Button attendance;
    private Button feedback;
    private Button idcard;
    private Button logout;

    private String name;
    private String email;

    // Colors
    private Color backgroundColor =
            new Color(245, 247, 250);

    private Color headerColor =
            new Color(30, 60, 114);

    private Color buttonColor =
            new Color(255, 255, 255);

    private Color buttonTextColor =
            new Color(30, 60, 114);

    private Color logoutColor =
            new Color(220, 53, 69);

    private Color noteColor =
            new Color(255, 248, 220);

    public dashboard(String name, String email) {

        this.name = name;
        this.email = email;

        // =========================================
        // FRAME SETTINGS
        // =========================================

        setTitle("Student Dashboard");

        setSize(800, 650);

        setLayout(null);

        getContentPane().setBackground(
                backgroundColor
        );

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        setLocationRelativeTo(null);

        // =========================================
        // HEADER PANEL
        // =========================================

        JPanel header = new JPanel();

        header.setLayout(null);

        header.setBackground(headerColor);

        header.setBounds(
                0, 0, 800, 150
        );

        add(header);

        // =========================================
        // TITLE
        // =========================================

        title = new JLabel(
                "STUDENT DASHBOARD"
        );

        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        28
                )
        );

        title.setForeground(
                Color.WHITE
        );

        title.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        title.setBounds(
                150, 25, 500, 45
        );

        header.add(title);

        // =========================================
        // WELCOME MESSAGE
        // =========================================

        welcome = new JLabel(
                "Welcome, " + name
        );

        welcome.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        18
                )
        );

        welcome.setForeground(
                Color.WHITE
        );

        welcome.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        welcome.setBounds(
                150, 75, 500, 30
        );

        header.add(welcome);

        // =========================================
        // SUBTITLE
        // =========================================

        subtitle = new JLabel(
                "Manage your student information easily"
        );

        subtitle.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        14
                )
        );

        subtitle.setForeground(
                new Color(220, 230, 245)
        );

        subtitle.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        subtitle.setBounds(
                150, 105, 500, 25
        );

        header.add(subtitle);

        // =========================================
        // PROFILE BUTTON
        // =========================================

        profile = new Button("PROFILE");

        styleButton(profile);

        profile.setBounds(
                100, 200, 180, 60
        );

        add(profile);

        // =========================================
        // COURSES BUTTON
        // =========================================

        courses = new Button("COURSES");

        styleButton(courses);

        courses.setBounds(
                310, 200, 180, 60
        );

        add(courses);

        // =========================================
        // ATTENDANCE BUTTON
        // =========================================

        attendance = new Button("ATTENDANCE");

        styleButton(attendance);

        attendance.setBounds(
                520, 200, 180, 60
        );

        add(attendance);

        // =========================================
        // FEEDBACK BUTTON
        // =========================================

        feedback = new Button("FEEDBACK");

        styleButton(feedback);

        feedback.setBounds(
                100, 300, 180, 60
        );

        add(feedback);

        // =========================================
        // STUDENT ID CARD
        // =========================================

        idcard = new Button(
                "STUDENT ID CARD"
        );

        styleButton(idcard);

        idcard.setBounds(
                310, 300, 180, 60
        );

        add(idcard);

        // =========================================
        // LOGOUT BUTTON
        // =========================================

        logout = new Button("LOGOUT");

        logout.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        15
                )
        );

        logout.setBackground(
                logoutColor
        );

        logout.setForeground(
                Color.WHITE
        );

        logout.setBounds(
                520, 300, 180, 60
        );

        add(logout);

        // =========================================
        // NOTE PANEL
        // =========================================

        JPanel notePanel = new JPanel();

        notePanel.setLayout(null);

        notePanel.setBackground(
                noteColor
        );

        notePanel.setBounds(
                100, 400, 600, 70
        );

        add(notePanel);

        // =========================================
        // NOTE TEXT
        // =========================================

        note = new JLabel(
                "<html><center>"
                + "<b>NOTE:</b> For updating personal details, "
                + "contact information, or department-related "
                + "queries, please contact the college management."
                + "</center></html>"
        );

        note.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        13
                )
        );

        note.setForeground(
                new Color(90, 75, 20)
        );

        note.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        note.setBounds(
                15, 10, 570, 50
        );

        notePanel.add(note);

        // =========================================
        // FOOTER
        // =========================================

        footer = new JLabel(
                "Student Management System"
        );

        footer.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        13
                )
        );

        footer.setForeground(
                new Color(100, 100, 100)
        );

        footer.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        footer.setBounds(
                200, 530, 400, 30
        );

        add(footer);

        // =========================================
        // BUTTON LISTENERS
        // =========================================

        profile.addActionListener(this);

        courses.addActionListener(this);

        attendance.addActionListener(this);

        feedback.addActionListener(this);

        idcard.addActionListener(this);

        logout.addActionListener(this);
    }

    // =============================================
    // BUTTON DESIGN METHOD
    // =============================================

    private void styleButton(Button button) {

        button.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        15
                )
        );

        button.setBackground(
                buttonColor
        );

        button.setForeground(
                buttonTextColor
        );

        button.setFocusable(false);
    }

    // =============================================
    // ACTION PERFORMED
    // =============================================

    @Override
    public void actionPerformed(ActionEvent e) {

        // =========================================
        // PROFILE
        // =========================================

        if (e.getSource() == profile) {

            profile p =
                    new profile(
                            name,
                            email
                    );

            p.setVisible(true);
        }

        // =========================================
        // COURSES
        // =========================================

        if (e.getSource() == courses) {

            courses c =
                    new courses();

            c.setVisible(true);
        }

        // =========================================
        // ATTENDANCE
        // =========================================

        if (e.getSource() == attendance) {

            attendance a =
                    new attendance();

            a.setVisible(true);
        }

        // =========================================
        // FEEDBACK
        // =========================================

        if (e.getSource() == feedback) {

            feedback f =
                    new feedback(
                            name,
                            email
                    );

            f.setVisible(true);
        }

        // =========================================
        // STUDENT ID CARD
        // =========================================

        if (e.getSource() == idcard) {

            studentidcard s =
                    new studentidcard(
                            name,
                            email
                    );

            s.setVisible(true);
        }

        // =========================================
        // LOGOUT
        // =========================================

        if (e.getSource() == logout) {

            this.dispose();

            login l =
                    new login();

            l.setVisible(true);
        }
    }
}

/*package com.mainprojstudent;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class dashboard extends JFrame implements ActionListener {

    private JLabel title;
    private JLabel welcome;
    private JLabel subtitle;
    private JLabel footer;

    private Button profile;
    private Button courses;
    private Button attendance;
    private Button feedback;
    private Button idcard;
    private Button logout;

    private String name;
    private String email;

    // Colors
    private Color backgroundColor = new Color(245, 247, 250);
    private Color headerColor = new Color(30, 60, 114);
    private Color buttonColor = new Color(255, 255, 255);
    private Color buttonTextColor = new Color(30, 60, 114);
    private Color logoutColor = new Color(220, 53, 69);
    private Color cardBorder = new Color(210, 215, 220);

    public dashboard(String name, String email) {

        this.name = name;
        this.email = email;

        // =========================================
        // FRAME SETTINGS
        // =========================================

        setTitle("Student Dashboard");

        setSize(800, 650);

        setLayout(null);

        getContentPane().setBackground(backgroundColor);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        // =========================================
        // HEADER PANEL
        // =========================================

        JPanel header = new JPanel();

        header.setLayout(null);

        header.setBackground(headerColor);

        header.setBounds(0, 0, 800, 150);

        add(header);

        // =========================================
        // TITLE
        // =========================================

        title = new JLabel("STUDENT DASHBOARD");

        title.setFont(
                new Font("Arial", Font.BOLD, 28)
        );

        title.setForeground(Color.WHITE);

        title.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        title.setBounds(150, 25, 500, 45);

        header.add(title);

        // =========================================
        // WELCOME MESSAGE
        // =========================================

        welcome = new JLabel(
                "Welcome, " + name
        );

        welcome.setFont(
                new Font("Arial", Font.BOLD, 18)
        );

        welcome.setForeground(Color.WHITE);

        welcome.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        welcome.setBounds(150, 75, 500, 30);

        header.add(welcome);

        // =========================================
        // SUBTITLE
        // =========================================

        subtitle = new JLabel(
                "Manage your student information easily"
        );

        subtitle.setFont(
                new Font("Arial", Font.PLAIN, 14)
        );

        subtitle.setForeground(
                new Color(220, 230, 245)
        );

        subtitle.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        subtitle.setBounds(150, 105, 500, 25);

        header.add(subtitle);

        // =========================================
        // PROFILE BUTTON
        // =========================================

        profile = new Button("PROFILE");

        styleButton(profile);

        profile.setBounds(
                100, 200, 180, 60
        );

        add(profile);

        // =========================================
        // COURSES BUTTON
        // =========================================

        courses = new Button("COURSES");

        styleButton(courses);

        courses.setBounds(
                310, 200, 180, 60
        );

        add(courses);

        // =========================================
        // ATTENDANCE BUTTON
        // =========================================

        attendance = new Button("ATTENDANCE");

        styleButton(attendance);

        attendance.setBounds(
                520, 200, 180, 60
        );

        add(attendance);

        // =========================================
        // FEEDBACK BUTTON
        // =========================================

        feedback = new Button("FEEDBACK");

        styleButton(feedback);

        feedback.setBounds(
                100, 300, 180, 60
        );

        add(feedback);

        // =========================================
        // STUDENT ID CARD BUTTON
        // =========================================

        idcard = new Button("STUDENT ID CARD");

        styleButton(idcard);

        idcard.setBounds(
                310, 300, 180, 60
        );

        add(idcard);

        // =========================================
        // LOGOUT BUTTON
        // =========================================

        logout = new Button("LOGOUT");

        logout.setFont(
                new Font("Arial", Font.BOLD, 15)
        );

        logout.setBackground(logoutColor);

        logout.setForeground(Color.WHITE);

        logout.setBounds(
                520, 300, 180, 60
        );

        add(logout);

        // =========================================
        // FOOTER
        // =========================================

        footer = new JLabel(
                "Student Management System"
        );

        footer.setFont(
                new Font("Arial", Font.PLAIN, 13)
        );

        footer.setForeground(
                new Color(100, 100, 100)
        );

        footer.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        footer.setBounds(
                200, 550, 400, 30
        );

        add(footer);

        // =========================================
        // BUTTON LISTENERS
        // =========================================

        profile.addActionListener(this);

        courses.addActionListener(this);

        attendance.addActionListener(this);

        feedback.addActionListener(this);

        idcard.addActionListener(this);

        logout.addActionListener(this);
    }

    // =============================================
    // BUTTON DESIGN METHOD
    // =============================================

    private void styleButton(Button button) {

        button.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        15
                )
        );

        button.setBackground(buttonColor);

        button.setForeground(buttonTextColor);

        button.setFocusable(false);
    }

    // =============================================
    // ACTION PERFORMED
    // =============================================

    @Override
    public void actionPerformed(ActionEvent e) {

        // =========================================
        // PROFILE
        // =========================================

        if (e.getSource() == profile) {

            profile p =
                    new profile(
                            name,
                            email
                    );

            p.setVisible(true);
        }

        // =========================================
        // COURSES
        // =========================================

        if (e.getSource() == courses) {

            courses c =
                    new courses();

            c.setVisible(true);
        }

        // =========================================
        // ATTENDANCE
        // =========================================

        if (e.getSource() == attendance) {

            attendance a =
                    new attendance();

            a.setVisible(true);
        }

        // =========================================
        // FEEDBACK
        // =========================================

        if (e.getSource() == feedback) {

            feedback f =
                    new feedback(
                            name,
                            email
                    );

            f.setVisible(true);
        }

        // =========================================
        // STUDENT ID CARD
        // =========================================

        if (e.getSource() == idcard) {

            studentidcard s =
                    new studentidcard(
                            name,
                            email
                    );

            s.setVisible(true);
        }

        // =========================================
        // LOGOUT
        // =========================================

        if (e.getSource() == logout) {

            this.dispose();

            login l =
                    new login();

            l.setVisible(true);
        }
    }
}
*/

/*package com.mainprojstudent;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class dashboard extends JFrame
        implements ActionListener {

    private JLabel title;
    private JLabel welcome;

    private Button profile;
    private Button courses;
    private Button attendance;
    private Button feedback;
    private Button idcard;
    private Button logout;

    private String name;
    private String email;


    public dashboard(
            String name,
            String email) {

        this.name = name;
        this.email = email;


        // ==============================
        // TITLE
        // ==============================

        title =
                new JLabel(
                        "STUDENT DASHBOARD"
                );

        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        25
                )
        );

        title.setForeground(Color.BLUE);


        welcome =
                new JLabel(
                        "Welcome, " + name
                );


        // ==============================
        // BUTTONS
        // ==============================

        profile =
                new Button("PROFILE");

        courses =
                new Button("COURSES");

        attendance =
                new Button("ATTENDANCE");

        feedback =
                new Button("FEEDBACK");

        idcard =
                new Button("STUDENT ID CARD");

        logout =
                new Button("LOGOUT");


        profile.setBackground(Color.CYAN);
        courses.setBackground(Color.CYAN);
        attendance.setBackground(Color.CYAN);
        feedback.setBackground(Color.CYAN);
        idcard.setBackground(Color.CYAN);
        logout.setBackground(Color.RED);


        // ==============================
        // FRAME
        // ==============================

        setTitle("Student Dashboard");

        setSize(800, 650);

        setLayout(null);


        title.setBounds(
                250, 60, 400, 50
        );

        welcome.setBounds(
                100, 130, 400, 40
        );


        profile.setBounds(
                100, 200, 180, 50
        );

        courses.setBounds(
                310, 200, 180, 50
        );

        attendance.setBounds(
                520, 200, 180, 50
        );

        feedback.setBounds(
                100, 300, 180, 50
        );

        idcard.setBounds(
                310, 300, 180, 50
        );

        logout.setBounds(
                520, 300, 180, 50
        );


        add(title);
        add(welcome);

        add(profile);
        add(courses);
        add(attendance);
        add(feedback);
        add(idcard);
        add(logout);


        // ==============================
        // LISTENERS
        // ==============================

        profile.addActionListener(this);
        courses.addActionListener(this);
        attendance.addActionListener(this);
        feedback.addActionListener(this);
        idcard.addActionListener(this);
        logout.addActionListener(this);


        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {


        // PROFILE
        if (e.getSource() == profile) {

            profile p =
                    new profile(
                            name,
                            email
                    );

            p.setVisible(true);
        }


        // COURSES
        if (e.getSource() == courses) {

            courses c =
                    new courses();

            c.setVisible(true);
        }


        // ATTENDANCE
        if (e.getSource() == attendance) {

            attendance a =
                    new attendance();

            a.setVisible(true);
        }


        // FEEDBACK
        if (e.getSource() == feedback) {

            feedback f =
                    new feedback(
                            name,
                            email
                    );

            f.setVisible(true);
        }


        // ID CARD
        if (e.getSource() == idcard) {

            studentidcard s =
                    new studentidcard(name,email);

            s.setVisible(true);
        }


        // LOGOUT
        if (e.getSource() == logout) {

            this.dispose();

            login l =
                    new login();

            l.setVisible(true);
        }
    }
}
*/

/*package com.mainprojstudent;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class dashboard extends JFrame implements ActionListener {

    private JLabel welcome;
    private JLabel emailLabel;
    private Button logout;

    private String name;
    private String email;

    public dashboard(String name, String email) {

        this.name = name;
        this.email = email;

        setTitle("Student Dashboard");
        setSize(700, 500);
        setLayout(null);

        welcome = new JLabel("Welcome, " + name);
        welcome.setBounds(100, 100, 400, 40);

        emailLabel = new JLabel("Email: " + email);
        emailLabel.setBounds(100, 160, 400, 40);

        logout = new Button("LOGOUT");
        logout.setBounds(100, 230, 120, 40);
        logout.setBackground(Color.MAGENTA);

        logout.addActionListener(this);

        add(welcome);
        add(emailLabel);
        add(logout);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }


	@Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(logout)) {

            this.dispose();

            register r = new register();
            r.setVisible(true);
        }
    }
}*/
