package com.example.controller;

import org.mindrot.jbcrypt.BCrypt;

public class UserAuth {

    public static String getHashedPassword(String PlanePassword) {
        // Hash a password for the first time
        String hashed = BCrypt.hashpw(PlanePassword, BCrypt.gensalt(12));
        return hashed;
    }

    public static boolean IsPasswordCorrect(String PlanePassword,String hashedPassword) {
        return BCrypt.checkpw(PlanePassword, hashedPassword);
    }
}
