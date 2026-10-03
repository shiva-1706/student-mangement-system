package com.mainprojstudent;

import javax.swing.JFrame;

public class excution {

    public static void main(String[] args) {

        login l = new login();

        l.setSize(800, 800);

        l.setTitle(
                "Student Login"
        );

        l.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        l.setVisible(true);
    }
}
