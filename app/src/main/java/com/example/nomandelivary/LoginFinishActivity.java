package com.example.nomandelivary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginFinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_finish);

        TextView openButton = (TextView) findViewById(R.id.openButton);
        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openintent = new Intent(LoginFinishActivity.this, OpenActivity.class);
                LoginFinishActivity.this.startActivity(openintent);
            }
        });

        TextView deliverystatusButton = (TextView) findViewById(R.id.deliverystatusButton);
        deliverystatusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deliverystatusintent = new Intent(LoginFinishActivity.this, DeliveryStatusActivity.class);
                LoginFinishActivity.this.startActivity(deliverystatusintent);
            }
        });

        TextView alarmButton = (TextView) findViewById(R.id.alarmButton);
        alarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alarmintent = new Intent(LoginFinishActivity.this, AlarmActivity.class);
                LoginFinishActivity.this.startActivity(alarmintent);
            }
        });
    }
}