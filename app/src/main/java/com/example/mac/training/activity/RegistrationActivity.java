package com.example.mac.training.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mac.training.R;

public class RegistrationActivity extends AppCompatActivity {

    private EditText name, password, confirmPassword, email, phone;
    private Button signUp;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        initViews();
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkValidation();
            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().isEmpty() ||
                        password .getText().toString().isEmpty() ||
                        confirmPassword .getText().toString().isEmpty() ||
                        phone .getText().toString().isEmpty() ||
                        email .getText().toString().isEmpty())
                    Toast.makeText(RegistrationActivity.this, "Fill fields", Toast.LENGTH_SHORT).show();

                else
                    goToLoginPage();

            }
        });
    }

    private void goToLoginPage () {

        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra("email", email.getText().toString());
        intent.putExtra("password", password.getText().toString());
        startActivity(intent);
    }



        //goToLoginPage();



    private void checkValidation() {
        if (!confirmPassword.getText().toString().equals(password.getText().toString())) {
            confirmPassword.setError("Confirm password Not match");
        }
    }

    private void initViews() {
        name = findViewById(R.id.RegistartionActivity_EditText_name);
        password = findViewById(R.id.RegistartionActivity_EditText_password);
        confirmPassword = findViewById(R.id.RegistartionActivity_EditText_confirmPassword);
        email = findViewById(R.id.RegistartionActivity_EditText_enail);
        phone = findViewById(R.id.RegistartionActivity_EditText_phone);
        signUp = findViewById(R.id.RegistartionActivity_btn_signUp);
        toolbar = findViewById(R.id.RegistrationAcitivity_Toolbar_sigup);

    }
}
