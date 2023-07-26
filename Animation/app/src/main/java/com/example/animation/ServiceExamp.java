package com.example.animation;

import static com.example.animation.channelclass.channelId;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

public class ServiceExamp extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent,int flags, int startId) {
        Intent notiinetent = new  Intent(this,MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,notiinetent,0);
        Notification notification = new NotificationCompat.Builder(this,channelId)
                .setContentTitle("MY Notification")
                .setContentText("This my notification")
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentIntent(pendingIntent).build();

        startForeground(1,notification);
        return START_NOT_STICKY;
    }
}
