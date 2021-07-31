package com.prabhakar.app2;

import android.content.IntentFilter;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ReceiverBroadCast receiverBroadCast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        broadcastReceiver();
    }

    private void broadcastReceiver() {
        receiverBroadCast = new ReceiverBroadCast();
        IntentFilter intentFilter = new IntentFilter("ACTION.Custom.xyz");
        registerReceiver(receiverBroadCast, intentFilter);
    }
}