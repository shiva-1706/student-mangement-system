package com.mainprojstudent;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame implements ActionListener {

    JLabel title;
    JLabel welcomeLabel;
    JLabel descriptionLabel;
    JLabel emailLabel;
    JLabel passwordLabel;

    JTextField emailText;
    JPasswordField passwordText;

    Button loginButton;
    Button clearButton;
    Button registerButton;


    public login() {

        // ==========================================
        // FRAME
        // ==========================================

        setTitle("Student Login Portal");

        setSize(750, 550);

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
        // LOGIN CARD
        // ==========================================

        Panel loginPanel = new Panel();

        loginPanel.setLayout(null);

        loginPanel.setBackground(
                Color.WHITE
        );

        loginPanel.setBounds(
                100,
                45,
                550,
                420
        );

        add(loginPanel);


        // ==========================================
        // MAIN TITLE
        // ==========================================

        title = new JLabel(
                "STUDENT LOGIN PORTAL"
        );

        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        27
                )
        );

        title.setForeground(
                new Color(25, 75, 135)
        );

        title.setBounds(
                145,
                25,
                350,
                40
        );

        loginPanel.add(title);


        // ==========================================
        // WELCOME TEXT
        // ==========================================

        welcomeLabel = new JLabel(
                "Welcome Back, Student!"
        );

        welcomeLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        19
                )
        );

        welcomeLabel.setForeground(
                new Color(45, 55, 70)
        );

        welcomeLabel.setBounds(
                175,
                75,
                250,
                30
        );

        loginPanel.add(welcomeLabel);


        // ==========================================
        // DESCRIPTION
        // ==========================================

        descriptionLabel = new JLabel(
                "Login to access your student dashboard"
        );

        descriptionLabel.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        13
                )
        );

        descriptionLabel.setForeground(
                new Color(120, 130, 140)
        );

        descriptionLabel.setBounds(
                150,
                105,
                300,
                25
        );

        loginPanel.add(descriptionLabel);


        // ==========================================
        // EMAIL LABEL
        // ==========================================

        emailLabel = new JLabel(
                "Email Address"
        );

        emailLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        emailLabel.setForeground(
                new Color(50, 60, 70)
        );

        emailLabel.setBounds(
                80,
                150,
                150,
                25
        );

        loginPanel.add(emailLabel);


        // ==========================================
        // EMAIL FIELD
        // ==========================================

        emailText = new JTextField();

        emailText.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        15
                )
        );

        emailText.setBounds(
                80,
                177,
                390,
                38
        );

        loginPanel.add(emailText);


        // ==========================================
        // PASSWORD LABEL
        // ==========================================

        passwordLabel = new JLabel(
                "Password"
        );

        passwordLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        passwordLabel.setForeground(
                new Color(50, 60, 70)
        );

        passwordLabel.setBounds(
                80,
                225,
                150,
                25
        );

        loginPanel.add(passwordLabel);


        // ==========================================
        // PASSWORD FIELD
        // ==========================================

        passwordText =
                new JPasswordField();

        passwordText.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        15
                )
        );

        passwordText.setBounds(
                80,
                252,
                390,
                38
        );

        loginPanel.add(passwordText);


        // ==========================================
        // LOGIN BUTTON
        // ==========================================

        loginButton =
                new Button("LOGIN");

        loginButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        loginButton.setBackground(
                new Color(
                        35,
                        110,
                        200
                )
        );

        loginButton.setForeground(
                Color.WHITE
        );

        loginButton.setBounds(
                80,
                325,
                115,
                40
        );

        loginPanel.add(loginButton);


        // ==========================================
        // CLEAR BUTTON
        // ==========================================

        clearButton =
                new Button("CLEAR");

        clearButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        clearButton.setBackground(
                new Color(
                        110,
                        120,
                        130
                )
        );

        clearButton.setForeground(
                Color.WHITE
        );

        clearButton.setBounds(
                220,
                325,
                115,
                40
        );

        loginPanel.add(clearButton);


        // ==========================================
        // REGISTER BUTTON
        // ==========================================

        registerButton =
                new Button("REGISTER");

        registerButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        registerButton.setBackground(
                new Color(
                        40,
                        150,
                        90
                )
        );

        registerButton.setForeground(
                Color.WHITE
        );

        registerButton.setBounds(
                360,
                325,
                110,
                40
        );

        loginPanel.add(registerButton);


        // ==========================================
        // BOTTOM TEXT
        // ==========================================

        JLabel bottomText =
                new JLabel(
                        "New student? Click REGISTER to create your account."
                );

        bottomText.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        12
                )
        );

        bottomText.setForeground(
                new Color(120, 120, 120)
        );

        bottomText.setBounds(
                145,
                380,
                300,
                20
        );

        loginPanel.add(bottomText);


        // ==========================================
        // ACTION LISTENERS
        // ==========================================

        loginButton.addActionListener(this);

        clearButton.addActionListener(this);

        registerButton.addActionListener(this);
    }


    // ==============================================
    // ACTION PERFORMED
    // ==============================================

    @Override
    public void actionPerformed(
            ActionEvent e
    ) {

        // ==========================================
        // LOGIN
        // ==========================================

        if (e.getSource() == loginButton) {

            String email =
                    emailText.getText().trim();

            String password =
                    new String(
                            passwordText.getPassword()
                    );


            if (email.isEmpty()
                    || password.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter your email and password.",
                        "Login",
                        JOptionPane.WARNING_MESSAGE
                );

                return;
            }


            try {

                Connection con =
                        DBConnection.getConnection();


                String sql =
                        "SELECT name, email "
                        + "FROM mainproj "
                        + "WHERE email=? AND password=?";


                PreparedStatement ps =
                        con.prepareStatement(sql);


                ps.setString(
                        1,
                        email
                );

                ps.setString(
                        2,
                        password
                );


                ResultSet rs =
                        ps.executeQuery();


                if (rs.next()) {

                    String name =
                            rs.getString("name");

                    String userEmail =
                            rs.getString("email");


                    JOptionPane.showMessageDialog(
                            this,
                            "Welcome " + name
                                    + "!\nLogin Successful.",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE
                    );


                    dashboard d =
                            new dashboard(
                                    name,
                                    userEmail
                            );

                    d.setVisible(true);

                    this.dispose();

                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Invalid Email or Password.",
                            "Login Failed",
                            JOptionPane.ERROR_MESSAGE
                    );

                    passwordText.setText("");
                }


                rs.close();

                ps.close();

                con.close();

            }
            catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Database Error\n"
                                + ex.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );

                ex.printStackTrace();
            }
        }


        // ==========================================
        // CLEAR
        // ==========================================

        if (e.getSource() == clearButton) {

            emailText.setText("");

            passwordText.setText("");

            emailText.requestFocus();
        }


        // ==========================================
        // REGISTER
        // ==========================================

        if (e.getSource() == registerButton) {

            register r =
                    new register();

            r.setVisible(true);

            this.dispose();
        }
    }


    // ==========================================
    // MAIN METHOD
    // ==========================================

    public static void main(
            String[] args
    ) {

        login l =
                new login();

        l.setVisible(true);
    }
}

/*
 * ------------------------------------------------
 * package com.mainprojstudent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class login extends JFrame implements ActionListener {

    private JTextField emailText;
    private JPasswordField passwordText;

    private JButton loginButton;
    private JButton clearButton;
    private JButton registerButton;

    public login() {

        // =====================================================
        // FRAME
        // =====================================================

        setTitle("Student Portal - Login");
        setSize(1000, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Main gradient panel
        GradientPanel mainPanel = new GradientPanel();

        mainPanel.setLayout(new GridBagLayout());

        // =====================================================
        // LEFT SIDE - WELCOME SECTION
        // =====================================================

        JPanel welcomePanel = new JPanel();
        welcomePanel.setOpaque(false);
        welcomePanel.setPreferredSize(new Dimension(430, 500));

        welcomePanel.setLayout(new BoxLayout(
                welcomePanel,
                BoxLayout.Y_AXIS
        ));

        JLabel logo = new JLabel("🎓");
        logo.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 70));
        logo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel welcome = new JLabel("WELCOME BACK");
        welcome.setFont(new Font(
                "Segoe UI",
                Font.BOLD,
                38
        ));
        welcome.setForeground(Color.WHITE);
        welcome.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel studentPortal = new JLabel("STUDENT PORTAL");
        studentPortal.setFont(new Font(
                "Segoe UI",
                Font.BOLD,
                22
        ));
        studentPortal.setForeground(new Color(
                220, 235, 255
        ));
        studentPortal.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel description = new JLabel(
                "<html><div style='text-align:center;'>"
                + "Access your academic dashboard,<br>"
                + "manage your profile and stay connected."
                + "</div></html>"
        );

        description.setFont(new Font(
                "Segoe UI",
                Font.PLAIN,
                16
        ));

        description.setForeground(new Color(
                220, 230, 250
        ));

        description.setAlignmentX(Component.CENTER_ALIGNMENT);

        welcomePanel.add(Box.createVerticalGlue());
        welcomePanel.add(logo);
        welcomePanel.add(Box.createVerticalStrut(15));
        welcomePanel.add(welcome);
        welcomePanel.add(Box.createVerticalStrut(5));
        welcomePanel.add(studentPortal);
        welcomePanel.add(Box.createVerticalStrut(25));
        welcomePanel.add(description);
        welcomePanel.add(Box.createVerticalGlue());


        // =====================================================
        // LOGIN CARD
        // =====================================================

        RoundedPanel loginCard = new RoundedPanel(
                30,
                Color.WHITE
        );

        loginCard.setPreferredSize(
                new Dimension(400, 500)
        );

        loginCard.setLayout(
                new GridBagLayout()
        );

        GridBagConstraints gbc =
                new GridBagConstraints();

        gbc.insets =
                new Insets(8, 30, 8, 30);

        gbc.fill =
                GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;


        // =====================================================
        // LOGIN TITLE
        // =====================================================

        JLabel loginTitle = new JLabel(
                "Sign In"
        );

        loginTitle.setFont(new Font(
                "Segoe UI",
                Font.BOLD,
                32
        ));

        loginTitle.setForeground(
                new Color(30, 41, 59)
        );

        loginTitle.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        gbc.gridy = 0;

        loginCard.add(
                loginTitle,
                gbc
        );


        // Subtitle

        JLabel subtitle = new JLabel(
                "Enter your account details"
        );

        subtitle.setFont(new Font(
                "Segoe UI",
                Font.PLAIN,
                14
        ));

        subtitle.setForeground(
                new Color(100, 116, 139)
        );

        subtitle.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        gbc.gridy = 1;

        loginCard.add(
                subtitle,
                gbc
        );


        // =====================================================
        // EMAIL LABEL
        // =====================================================

        JLabel emailLabel = new JLabel(
                "Email Address"
        );

        emailLabel.setFont(new Font(
                "Segoe UI",
                Font.BOLD,
                14
        ));

        emailLabel.setForeground(
                new Color(51, 65, 85)
        );

        gbc.gridy = 2;

        gbc.insets =
                new Insets(
                        25,
                        30,
                        5,
                        30
                );

        loginCard.add(
                emailLabel,
                gbc
        );


        // =====================================================
        // EMAIL FIELD
        // =====================================================

        emailText = new JTextField();

        styleTextField(
                emailText
        );

        gbc.gridy = 3;

        gbc.insets =
                new Insets(
                        0,
                        30,
                        10,
                        30
                );

        loginCard.add(
                emailText,
                gbc
        );


        // =====================================================
        // PASSWORD LABEL
        // =====================================================

        JLabel passwordLabel =
                new JLabel(
                        "Password"
                );

        passwordLabel.setFont(new Font(
                "Segoe UI",
                Font.BOLD,
                14
        ));

        passwordLabel.setForeground(
                new Color(51, 65, 85)
        );

        gbc.gridy = 4;

        gbc.insets =
                new Insets(
                        10,
                        30,
                        5,
                        30
                );

        loginCard.add(
                passwordLabel,
                gbc
        );


        // =====================================================
        // PASSWORD FIELD
        // =====================================================

        passwordText =
                new JPasswordField();

        styleTextField(
                passwordText
        );

        gbc.gridy = 5;

        gbc.insets =
                new Insets(
                        0,
                        30,
                        15,
                        30
                );

        loginCard.add(
                passwordText,
                gbc
        );


        // =====================================================
        // LOGIN BUTTON
        // =====================================================

        loginButton =
                new JButton(
                        "LOGIN"
                );

        styleMainButton(
                loginButton
        );

        gbc.gridy = 6;

        gbc.insets =
                new Insets(
                        10,
                        30,
                        8,
                        30
                );

        loginCard.add(
                loginButton,
                gbc
        );


        // =====================================================
        // CLEAR BUTTON
        // =====================================================

        clearButton =
                new JButton(
                        "CLEAR"
                );

        styleSecondaryButton(
                clearButton
        );

        gbc.gridy = 7;

        gbc.insets =
                new Insets(
                        3,
                        30,
                        8,
                        30
                );

        loginCard.add(
                clearButton,
                gbc
        );


        // =====================================================
        // REGISTER TEXT
        // =====================================================

        JLabel registerText =
                new JLabel(
                        "Don't have an account?"
                );

        registerText.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        13
                )
        );

        registerText.setForeground(
                new Color(100, 116, 139)
        );

        registerText.setHorizontalAlignment(
                SwingConstants.CENTER
        );

        gbc.gridy = 8;

        gbc.insets =
                new Insets(
                        12,
                        30,
                        2,
                        30
                );

        loginCard.add(
                registerText,
                gbc
        );


        // =====================================================
        // REGISTER BUTTON
        // =====================================================

        registerButton =
                new JButton(
                        "CREATE ACCOUNT"
                );

        registerButton.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        13
                )
        );

        registerButton.setForeground(
                new Color(37, 99, 235)
        );

        registerButton.setBackground(
                Color.WHITE
        );

        registerButton.setBorderPainted(
                false
        );

        registerButton.setFocusPainted(
                false
        );

        registerButton.setCursor(
                new Cursor(
                        Cursor.HAND_CURSOR
                )
        );

        gbc.gridy = 9;

        gbc.insets =
                new Insets(
                        0,
                        30,
                        15,
                        30
                );

        loginCard.add(
                registerButton,
                gbc
        );


        // =====================================================
        // ADD PANELS
        // =====================================================

        GridBagConstraints mainGbc =
                new GridBagConstraints();

        mainGbc.insets =
                new Insets(
                        30,
                        30,
                        30,
                        30
                );

        mainGbc.gridx = 0;
        mainGbc.gridy = 0;
        mainGbc.weightx = 1;
        mainGbc.weighty = 1;

        mainPanel.add(
                welcomePanel,
                mainGbc
        );

        mainGbc.gridx = 1;

        mainPanel.add(
                loginCard,
                mainGbc
        );


        add(mainPanel);


        // =====================================================
        // ACTION LISTENERS
        // =====================================================

        loginButton.addActionListener(this);
        clearButton.addActionListener(this);
        registerButton.addActionListener(this);

        // Press ENTER to login
        getRootPane().setDefaultButton(
                loginButton
        );
    }


    // =========================================================
    // TEXT FIELD STYLE
    // =========================================================

    private void styleTextField(
            JTextField field
    ) {

        field.setPreferredSize(
                new Dimension(
                        320,
                        45
                )
        );

        field.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        15
                )
        );

        field.setForeground(
                new Color(
                        30,
                        41,
                        59
                )
        );

        field.setBackground(
                new Color(
                        248,
                        250,
                        252
                )
        );

        field.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(
                                new Color(
                                        203,
                                        213,
                                        225
                                ),
                                1
                        ),
                        new EmptyBorder(
                                8,
                                12,
                                8,
                                12
                        )
                )
        );
    }


    // =========================================================
    // MAIN BUTTON
    // =========================================================

    private void styleMainButton(
            JButton button
    ) {

        button.setPreferredSize(
                new Dimension(
                        320,
                        48
                )
        );

        button.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        15
                )
        );

        button.setForeground(
                Color.WHITE
        );

        button.setBackground(
                new Color(
                        37,
                        99,
                        235
                )
        );

        button.setBorder(
                BorderFactory.createEmptyBorder()
        );

        button.setFocusPainted(
                false
        );

        button.setCursor(
                new Cursor(
                        Cursor.HAND_CURSOR
                )
        );
    }


    // =========================================================
    // SECONDARY BUTTON
    // =========================================================

    private void styleSecondaryButton(
            JButton button
    ) {

        button.setPreferredSize(
                new Dimension(
                        320,
                        42
                )
        );

        button.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        13
                )
        );

        button.setForeground(
                new Color(
                        71,
                        85,
                        105
                )
        );

        button.setBackground(
                new Color(
                        241,
                        245,
                        249
                )
        );

        button.setBorder(
                BorderFactory.createEmptyBorder()
        );

        button.setFocusPainted(
                false
        );

        button.setCursor(
                new Cursor(
                        Cursor.HAND_CURSOR
                )
        );
    }


    // =========================================================
    // BUTTON ACTIONS
    // =========================================================

    @Override
    public void actionPerformed(
            ActionEvent e
    ) {

        // =====================================================
        // LOGIN
        // =====================================================

        if (e.getSource() == loginButton) {

            String email =
                    emailText.getText().trim();

            String password =
                    new String(
                            passwordText.getPassword()
                    );


            if (email.isEmpty()
                    || password.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter your email and password.",
                        "Missing Information",
                        JOptionPane.WARNING_MESSAGE
                );

                return;
            }


            try {

                Connection con =
                        DBConnection.getConnection();


                String sql =
                        "SELECT name, email "
                        + "FROM mainproj "
                        + "WHERE email=? AND password=?";


                PreparedStatement ps =
                        con.prepareStatement(
                                sql
                        );


                ps.setString(
                        1,
                        email
                );

                ps.setString(
                        2,
                        password
                );


                ResultSet rs =
                        ps.executeQuery();


                if (rs.next()) {

                    String name =
                            rs.getString(
                                    "name"
                            );

                    String userEmail =
                            rs.getString(
                                    "email"
                            );


                    JOptionPane.showMessageDialog(
                            this,
                            "Welcome back, "
                                    + name
                                    + "!",
                            "Login Successful",
                            JOptionPane.INFORMATION_MESSAGE
                    );


                    dashboard d =
                            new dashboard(
                                    name,
                                    userEmail
                            );

                    d.setVisible(
                            true
                    );

                    this.dispose();

                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Invalid email or password.",
                            "Login Failed",
                            JOptionPane.ERROR_MESSAGE
                    );

                    passwordText.setText("");
                }


                rs.close();
                ps.close();
                con.close();

            }
            catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Unable to connect to the database.\n\n"
                                + ex.getMessage(),
                        "Database Error",
                        JOptionPane.ERROR_MESSAGE
                );

                ex.printStackTrace();
            }
        }


        // =====================================================
        // CLEAR
        // =====================================================

        if (e.getSource() == clearButton) {

            emailText.setText("");
            passwordText.setText("");

            emailText.requestFocus();
        }


        // =====================================================
        // REGISTER
        // =====================================================

        if (e.getSource() == registerButton) {

            register r =
                    new register();

            r.setVisible(
                    true
            );

            this.dispose();
        }
    }


    // =========================================================
    // GRADIENT BACKGROUND
    // =========================================================

    static class GradientPanel
            extends JPanel {

        @Override
        protected void paintComponent(
                Graphics g
        ) {

            super.paintComponent(g);

            Graphics2D g2 =
                    (Graphics2D) g;

            g2.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON
            );


            GradientPaint gradient =
                    new GradientPaint(
                            0,
                            0,
                            new Color(
                                    30,
                                    64,
                                    175
                            ),
                            getWidth(),
                            getHeight(),
                            new Color(
                                    124,
                                    58,
                                    237
                            )
                    );


            g2.setPaint(
                    gradient
            );

            g2.fillRect(
                    0,
                    0,
                    getWidth(),
                    getHeight()
            );


            // Decorative circles

            g2.setColor(
                    new Color(
                            255,
                            255,
                            255,
                            25
                    )
            );

            g2.fillOval(
                    -100,
                    -100,
                    300,
                    300
            );

            g2.fillOval(
                    getWidth() - 200,
                    getHeight() - 200,
                    350,
                    350
            );
        }
    }


    // =========================================================
    // ROUNDED CARD
    // =========================================================

    static class RoundedPanel
            extends JPanel {

        private int radius;
        private Color backgroundColor;


        public RoundedPanel(
                int radius,
                Color backgroundColor
        ) {

            this.radius =
                    radius;

            this.backgroundColor =
                    backgroundColor;

            setOpaque(false);
        }


        @Override
        protected void paintComponent(
                Graphics g
        ) {

            Graphics2D g2 =
                    (Graphics2D) g.create();


            g2.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON
            );


            // Shadow

            g2.setColor(
                    new Color(
                            0,
                            0,
                            0,
                            35
                    )
            );

            g2.fillRoundRect(
                    5,
                    8,
                    getWidth() - 10,
                    getHeight() - 13,
                    radius,
                    radius
            );


            // Card

            g2.setColor(
                    backgroundColor
            );

            g2.fillRoundRect(
                    0,
                    0,
                    getWidth() - 10,
                    getHeight() - 10,
                    radius,
                    radius
            );


            g2.dispose();

            super.paintComponent(g);
        }
    }


    // =========================================================
    // MAIN
    // =========================================================

    public static void main(
            String[] args
    ) {

        SwingUtilities.invokeLater(
                () -> {

                    login l =
                            new login();

                    l.setVisible(
                            true
                    );
                }
        );
    }
}

 
 --------------------------------------------------
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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame implements ActionListener {

    JLabel title, emailLabel, passwordLabel;
    JTextField emailText;
    JPasswordField passwordText;

    Button loginButton, clearButton, registerButton;

    public login() {

        // Title
        title = new JLabel("STUDENT LOGIN PORTAL");
        title.setFont(new Font("Arial", Font.BOLD, 25));
        title.setForeground(Color.BLUE);

        // Labels
        emailLabel = new JLabel("Email");
        passwordLabel = new JLabel("Password");

        // Text fields
        emailText = new JTextField();
        passwordText = new JPasswordField();

        // Buttons
        loginButton = new Button("LOGIN");
        clearButton = new Button("CLEAR");
        registerButton = new Button("REGISTER");

        // Frame layout
        setLayout(null);

        // Setting positions
        title.setBounds(250, 100, 450, 50);

        emailLabel.setBounds(180, 220, 120, 40);
        emailText.setBounds(320, 220, 300, 40);

        passwordLabel.setBounds(180, 300, 120, 40);
        passwordText.setBounds(320, 300, 300, 40);

        loginButton.setBounds(230, 400, 120, 45);
        clearButton.setBounds(370, 400, 120, 45);
        registerButton.setBounds(510, 400, 120, 45);

        // Button colors
        loginButton.setBackground(Color.GREEN);
        clearButton.setBackground(Color.GREEN);
        registerButton.setBackground(Color.GREEN);

        // Add components to frame
        add(title);
        add(emailLabel);
        add(emailText);
        add(passwordLabel);
        add(passwordText);
        add(loginButton);
        add(clearButton);
        add(registerButton);

        // Add action listeners
        loginButton.addActionListener(this);
        clearButton.addActionListener(this);
        registerButton.addActionListener(this);

        // Frame settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Login button
        if (e.getSource().equals(loginButton)) {

            String email = emailText.getText().trim();
            String password = new String(passwordText.getPassword());

            // Check empty fields
            if (email.isEmpty() || password.isEmpty()) {

                JOptionPane.showMessageDialog(
                    this,
                    "Enter email and password"
                );

                return;
            }

            try {

                Connection con = DBConnection.getConnection();

                String sql = "SELECT name, email FROM mainproj "
                           + "WHERE email=? AND password=?";

                PreparedStatement ps = con.prepareStatement(sql);

                ps.setString(1, email);
                ps.setString(2, password);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {

                    String name = rs.getString("name");
                    String userEmail = rs.getString("email");

                    JOptionPane.showMessageDialog(
                        this,
                        "Login Successful"
                    );

                    dashboard d = new dashboard(name, userEmail);
                    d.setVisible(true);

                    this.dispose();

                } else {

                    JOptionPane.showMessageDialog(
                        this,
                        "Invalid Email or Password"
                    );
                }

                rs.close();
                ps.close();
                con.close();

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                    this,
                    "Login Error\n" + ex.getMessage()
                );

                ex.printStackTrace();
            }
        }

        // Clear button
        if (e.getSource() == clearButton) {

            emailText.setText("");
            passwordText.setText("");
        }

        // Register button
        if (e.getSource().equals(registerButton)) {

            register r = new register();
            r.setVisible(true);

            this.dispose();
        }
    }
}
/////////////////////////////////////////////////////
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
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame implements ActionListener {

    private JLabel j1;
    private JLabel j2;
    private JLabel j3;

    private JTextField jt;
    private JPasswordField jp;

    private Button jb1;
    private Button jb2;
    private Button jb3;

    public login() {

        j1 = new JLabel("STUDENT LOGIN PORTAL");

        Font f = new Font(
                "Arial",
                Font.BOLD,
                25
        );

        j1.setFont(f);
        j1.setForeground(Color.BLUE);

        j2 = new JLabel("Email");
        j3 = new JLabel("Password");

        jt = new JTextField();
        jp = new JPasswordField();

        jb1 = new Button("LOGIN");
        jb2 = new Button("CLEAR");
        jb3 = new Button("REGISTER");

        setLayout(null);

        j1.setBounds(250, 100, 450, 50);

        j2.setBounds(180, 220, 120, 40);
        jt.setBounds(320, 220, 300, 40);

        j3.setBounds(180, 300, 120, 40);
        jp.setBounds(320, 300, 300, 40);

        jb1.setBounds(230, 400, 120, 45);
        jb2.setBounds(370, 400, 120, 45);
        jb3.setBounds(510, 400, 120, 45);

        jb1.setBackground(Color.GREEN);
        jb2.setBackground(Color.GREEN);
        jb3.setBackground(Color.GREEN);

        add(j1);
        add(j2);
        add(jt);
        add(j3);
        add(jp);
        add(jb1);
        add(jb2);
        add(jb3);

        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {


        // ============================
        // LOGIN
        // ============================

        if (e.getSource() == jb1) {

            String email = jt.getText().trim();

            String password =
                    new String(jp.getPassword());


            if (email.isEmpty() ||
                password.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Enter email and password"
                );

                return;
            }


            try {

                Connection con =
                        DBConnection.getConnection();


                String sql =
                        "SELECT name,email "
                        + "FROM mainproj "
                        + "WHERE email=? AND password=?";


                PreparedStatement ps =
                        con.prepareStatement(sql);

                ps.setString(1, email);
                ps.setString(2, password);


                ResultSet rs =
                        ps.executeQuery();


                if (rs.next()) {

                    String name =
                            rs.getString("name");

                    String userEmail =
                            rs.getString("email");


                    JOptionPane.showMessageDialog(
                            this,
                            "Login Successful"
                    );


                    dashboard d =
                            new dashboard(
                                    name,
                                    userEmail
                            );

                    d.setVisible(true);

                    this.dispose();

                }
                else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Invalid Email or Password"
                    );
                }


                rs.close();
                ps.close();
                con.close();

            }
            catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Login Error\n"
                        + ex.getMessage()
                );

                ex.printStackTrace();
            }
        }


        // ============================
        // CLEAR
        // ============================

        if (e.getSource() == jb2) {

            jt.setText("");
            jp.setText("");
        }


        // ============================
        // REGISTER
        // ============================

        if (e.getSource() == jb3) {

            register r =
                    new register();

            r.setVisible(true);

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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class login extends JFrame implements ActionListener{

    private JLabel j1, j2, j3;
    private JTextField jt;
    private JPasswordField jp;

    private Button jb1;
    private Button jb2;
    private Button jb3;
    Font f;

    public login() {

        // Labels
        j1 = new JLabel("STUDENT LOGIN PORTAL ");
        f=new Font("Arial",25,25);
        j1.setFont(f);
        j1.setForeground(Color.BLUE);
        j2 = new JLabel("Email*");
        j3 = new JLabel("Password*");

        // Text fields
        jt = new JTextField();
        jp = new JPasswordField();

        // Buttons
        jb1 = new Button("LOGIN");
        jb2 = new Button("CLEAR");
        jb3 = new Button("REGISTER");

        // Null layout
        setLayout(null);

        // Login heading
        j1.setBounds(350, 100, 450, 50);

        // Email
        j2.setBounds(180, 220, 120, 40);
        jt.setBounds(320, 220, 300, 40);

        // Password
        j3.setBounds(180, 300, 120, 40);
        jp.setBounds(320, 300, 300, 40);

        // Buttons
        jb1.setBounds(230, 400, 120, 45);
	    jb1.setBackground(Color.GREEN);

        jb2.setBounds(370, 400, 120, 45);
	    jb2.setBackground(Color.GREEN);

        jb3.setBounds(510, 400, 120, 45);
	    jb3.setBackground(Color.GREEN);


        // Add components
        add(j1);

        add(j2);
        add(jt);

        add(j3);
        add(jp);

        add(jb1);
        add(jb2);
        add(jb3);
       jb3.addActionListener(this);
       jb2.addActionListener(this);
       jb1.addActionListener(this);
       jt.addActionListener(this);
       jp.addActionListener(this);
   
    }

    public void actionPerformed(ActionEvent e) {
    	// TODO Auto-generated method stub
    	
    	Vector v=new Vector();
    	
    	if(e.getSource().equals(jb1)) {
    		
    		String email=jt.getText();
    		
    		String password=jp.getText();
    		
    		try {
    		
    		
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		
    	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
    	
    	PreparedStatement pst=	con.prepareStatement("select email,password from mainproj");

    	ResultSet rs=	pst.executeQuery();
    	
    	for(;rs.next();) {
    	
    	v.add(rs.getString("email"));
    	
    	v.add(	rs.getString("password"));
    	
    	}
    	
    	if(v.contains(email) && v.contains(password)) {
    		
    		storeindatabase_page sip=new storeindatabase_page();
    		
    	sip.setTitle("table"); 
    		
    		sip.setSize(1000,1000);
    		
    		sip.setDefaultCloseOperation(storeindatabase_page.EXIT_ON_CLOSE);
    		
    		sip.setVisible(true);
    		
    		
    	}else {
    		
    		JOptionPane.showMessageDialog(this, "INVALID PASS OR EMAIL !");
    		
    	}
    		
    		
    		}catch (Exception l) {
    			// TODO: handle exception
    			
    			l.printStackTrace();
    		}
    		
    		
    		
    		
    	}
    	
    	
    	
    	
    	if(e.getSource().equals(jb3))
    	{
    		register s=new register();
    		
    		s.setTitle("Register");
    		
    		s.setSize(900,1000);
    		
    		s.setDefaultCloseOperation(login.EXIT_ON_CLOSE );
    		
    		s.setVisible(true);
    		
    		
    	}
    	
    	
    	if(e.getSource().equals(jb2)) {
    		
    		jt.setText("");
    		jp.setText("");
    		
    	}
    	
    }


}*/
