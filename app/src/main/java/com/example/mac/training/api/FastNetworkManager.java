package com.example.mac.training.api;


import com.example.mac.training.api.requestModel.LoginRequest;
import com.example.mac.training.listner.ResponseLoginRequest;

/**
 * Created by mac on 2/22/18.
 */

public class FastNetworkManager {


    public void postLoginRequest(LoginRequest loginRequest, ResponseLoginRequest resonseLoginRequest) {
        resonseLoginRequest.isSuccess(true);
    }
}
