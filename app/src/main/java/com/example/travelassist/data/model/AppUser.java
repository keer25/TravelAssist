package com.example.travelassist.data.model;

import com.google.firebase.auth.FirebaseUser;

import java.security.PrivateKey;

public class AppUser {
    private String name;
    private String mobile;
    private FirebaseUser firebaseUser;

    private AppUser() {

    }

    public AppUser(String name_inp, String mobile_inp, FirebaseUser fbUser) {
        name = name_inp;
        mobile = mobile_inp;
        firebaseUser = fbUser;
    }

    public String getName() {
        return name;
    }
}
