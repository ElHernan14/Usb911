package com.constante.usb911;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class MensajeRecibido extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getExtras().getBoolean("connected")){
            Intent llamar = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:"+911));
            context.startActivity(intent);
        }
    }
}
