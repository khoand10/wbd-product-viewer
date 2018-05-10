package controller;

import model.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class main {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AwesomeBusiness","root","dangkhoa1997");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT id, code, name FROM Product");
            while (rs.next()) {
                System.out.println(rs.getString("id"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
