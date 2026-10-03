package com.mainprojstudent;

import java.awt.Dimension;
import java.awt.Font;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

public class storeindatabase_page extends JFrame {

    private JTable table;
    private JScrollPane scroll;


    public storeindatabase_page() {

        setTitle("Student Database");

        setSize(1200, 700);

        setLayout(null);


        table =
                new JTable();


        scroll =
                new JScrollPane(table);


        scroll.setBounds(
                20, 20, 1140, 550
        );


        add(scroll);


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
                    "SELECT name,email,password,"
                    + "gender,address,depart,year,"
                    + "hobb,contact "
                    + "FROM mainproj";


            PreparedStatement ps =
                    con.prepareStatement(sql);


            ResultSet rs =
                    ps.executeQuery();


            DefaultTableModel model =
                    new DefaultTableModel();


            model.addColumn("Name");
            model.addColumn("Email");
            model.addColumn("Password");
            model.addColumn("Gender");
            model.addColumn("Address");
            model.addColumn("Department");
            model.addColumn("Year");
            model.addColumn("Hobbies");
            model.addColumn("Contact");


            while (rs.next()) {

                model.addRow(
                        new Object[] {

                            rs.getString("name"),

                            rs.getString("email"),

                            rs.getString("password"),

                            rs.getString("gender"),

                            rs.getString("address"),

                            rs.getString("depart"),

                            rs.getString("year"),

                            rs.getString("hobb"),

                            rs.getString("contact")
                        }
                );
            }


            table.setModel(model);


            table.getTableHeader()
                 .setFont(
                         new Font(
                                 "Arial",
                                 Font.BOLD,
                                 16
                         )
                 );


            table.getTableHeader()
                 .setPreferredSize(
                         new Dimension(0, 30)
                 );


            rs.close();
            ps.close();
            con.close();

        }
        catch (Exception e) {

            e.printStackTrace();
        }
    }
}
