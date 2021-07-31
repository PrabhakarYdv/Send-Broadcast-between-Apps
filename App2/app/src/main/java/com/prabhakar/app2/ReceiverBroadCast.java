package com.prabhakar.app2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ReceiverBroadCast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent newIntent = new Intent(context,MainActivity2.class);
        newIntent.putExtra("msg", intent.getStringExtra("msg"));
        context.startActivity(newIntent);
    }
}
