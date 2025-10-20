package com.example.model;

/**
 *
 * @author Mubasshir
 */
import com.example.controller.DataTransaction;
import java.sql.*;

public class User {


    private  final String username;
    private  final String firstName;
    private  final String lastName;
    private  final String email;
    private  final String phone;
    private  final String userPass;

    public User(String username, String firstName, String lastName, String email, String phone, String userPass) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.userPass = userPass;
    }

    public static String isUsernameAvailable(String username) {
        //if username is available then return his/her hashed password
        try {
            ResultSet rs;
            try (Connection conn = DataTransaction.getDBConnection()) {
                String sql = "{CALL usp_check_user_availabilty(?)}";
                try (CallableStatement cs = conn.prepareCall(sql)) {
                    cs.setString(1, username);
                    rs = cs.executeQuery();
                }
            }
            String hashedPass = "";
            while (rs.next()) {
                hashedPass = rs.getString("userPass");
            }
            return hashedPass;
        } catch (SQLException sq) {
            return "";
        }
    }

    public boolean saveUser() {
        try {

            try (Connection conn = DataTransaction.getDBConnection()) {
                String sql = "{CALL usp_save_user(?,?,?,?,?,?,?)}";
                boolean isSaved;
                // 🔹 Set input parameters in order
                try (CallableStatement cs = conn.prepareCall(sql)) {
                    // 🔹 Set input parameters in order
                    cs.setString(1, this.username);     // @username
                    cs.setString(2, this.firstName);    // @first_name
                    cs.setString(3, this.lastName );    // @last_name
                    cs.setString(4, this.email );       // @email
                    cs.setString(5, this.phone );       // @phone
                    cs.setString(6, this.userPass );    // @userPass
                    // 🔹 Register output parameter (BIT)
                    cs.registerOutParameter(7, java.sql.Types.BIT);  // @isSaved
                    //Execute
                    cs.execute();
                    isSaved = cs.getBoolean(7);
                } // @username
                return isSaved;
            }
        } catch (SQLException sq) {
            System.out.println("Somthing went wrong: " + sq.getMessage());
            return false;
        }
    }
    
}
