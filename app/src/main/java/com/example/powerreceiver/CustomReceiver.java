package com.example.powerreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import static android.media.AudioManager.ACTION_HEADSET_PLUG;

public class CustomReceiver extends BroadcastReceiver {
    private static final String ACTION_CUSTOM_BROADCAST= BuildConfig.APPLICATION_ID +".ACTION_CUSTOM_BROADCAST";
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
       String intenAction =  intent.getAction();
       if(intenAction!=null){
           String toastMessage ="unknown intent action";
           switch (intenAction){
               case Intent.ACTION_POWER_CONNECTED:
                   toastMessage ="Power connected!";
                   break;
               case Intent.ACTION_POWER_DISCONNECTED:
                   toastMessage= "Power disconnected";
                   break;
               case ACTION_CUSTOM_BROADCAST:
                   toastMessage="Custom Broadcast Received";
                   break;
               case ACTION_HEADSET_PLUG:
                   toastMessage="HeadSet Connected";
                   break;

           }
           Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
       }
    }
}
