package com.prabhakar.app2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private TextView receiveMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        receiveMessage = findViewById(R.id.message);
        receiveMessage.setText(getIntent().getStringExtra("msg"));
    }
}