package com.example.mac.training.api.requestModel;

/**
 * Created by mac on 2/22/18.
 */

public class LoginRequest {
    private String mobileNumber;
    private String password;

    public LoginRequest() {
    }

    public LoginRequest(String mobileNumber, String password) {
        this.mobileNumber = mobileNumber;
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
