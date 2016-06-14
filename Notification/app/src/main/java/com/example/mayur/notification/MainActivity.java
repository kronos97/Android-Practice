package com.example.mayur.notification;

import android.app.NotificationManager;
import android.provider.Settings;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    NotificationManager notificationManager;
    NotificationCompat.Builder notify=new NotificationCompat.Builder(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view) {
        Toast.makeText(MainActivity.this,"Notification shown",Toast.LENGTH_LONG).show();

        notify.setTicker("Notification");
        notify.setContentTitle("Title");
        notify.setContentText("Message here");
        notify.setWhen(System.currentTimeMillis());
        notify.setSmallIcon(R.drawable.notificationimage);

        notificationManager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(1,notify.build());


    }
}

