package com.example.mac.training.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mac.training.R;
import com.example.mac.training.api.FastNetworkManager;
import com.example.mac.training.api.requestModel.LoginRequest;
import com.example.mac.training.listner.ResponseLoginRequest;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * this area declare all attributes in the loginScreen.xml , and all objects that will be used
     */
    private Button send;
    private EditText mobileNo, password;
    private TextView forgetPassword;
    private FastNetworkManager managerApi;
    private LoginRequest loginRequest;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        actionViews();
    }

    /**
     * this function set listener to any view that will be clickable
     */
    private void actionViews() {
        send.setOnClickListener(this);
        forgetPassword.setOnClickListener(this);
    }

    /**
     * catch view from xml to java object
     */
    private void initViews() {
        send = findViewById(R.id.LoginActivity_btn_send);
        mobileNo = findViewById(R.id.LoginActivity_EditText_mobileNumber);
        password = findViewById(R.id.LoginActivity_EditText_password);
        forgetPassword = findViewById(R.id.LoginActivity_TextView_forgetPassword);
        managerApi = new FastNetworkManager();
    }

    /**
     * there is if condition filter of view bcs i set same listener to view and make functions in each click
     *
     * @param view this view has be clicked already
     */
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.LoginActivity_btn_send) {
            if (allFieldsRight()) {
                sendRequestToServer();
            }
        } else {
            Toast.makeText(this, "there are not ForgetPassword Page", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * @return the object that will be converted to json object and sent to server ^_^
     */
    private LoginRequest makeRequestLoginObj() {
        return loginRequest = new LoginRequest(mobileNo.getText().toString(), password.getText().toString());
    }

    /**
     * call function in the manager that will send request to server and give correct params
     */
    private void sendRequestToServer() {
        managerApi.postLoginRequest(makeRequestLoginObj(), new ResponseLoginRequest() {
            @Override
            public void isSuccess(boolean isSuccess) {
                goToHomePage();
            }
        });
    }

    /**
     * after request success already will go to HomePage and finish current activity bcs do not r8
     * after login and go to home press back will return me in login page that is not correct
     */
    private void goToHomePage() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }


    /**
     *  in this function review phone number if more than 11 number based on our bessiness
     *  and the same validation on password
     * @return true or false based on fields in login screen
     */
    private boolean allFieldsRight() {
        if (mobileNo.getText().toString().length() < 11) {
            mobileNo.setError(getString(R.string.error_mobile_number));
            return false;
        }
        if (password.getText().toString().length() < 6) {
            mobileNo.setError(getString(R.string.error_password));
            return false;
        }
        return true;
    }

}
