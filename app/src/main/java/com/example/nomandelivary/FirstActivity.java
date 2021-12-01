package com.example.nomandelivary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        TextView loginButton = (TextView) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginintent = new Intent(FirstActivity.this, LoginActivity.class);
                FirstActivity.this.startActivity(loginintent);
            }
        });

        TextView userregisterButton = (TextView) findViewById(R.id.userregisterButton);
        userregisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent userregisterintent = new Intent(FirstActivity.this, UserResisterActivity.class);
                FirstActivity.this.startActivity(userregisterintent);
            }
        });

        TextView passwordchangeButton = (TextView) findViewById(R.id.passwordchangeButton);
        passwordchangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passwordchangeintent = new Intent(FirstActivity.this, PasswordChangeActivity.class);
                FirstActivity.this.startActivity(passwordchangeintent);
            }
        });

    }
}