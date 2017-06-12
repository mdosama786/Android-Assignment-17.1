package com.example.osama.assignment171;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {

     String tag="MyService";
    MediaPlayer mp;

    @Override
    public IBinder onBind(Intent intent) {

        return null;

    }

    @Override
    public void onCreate () {
        super.onCreate();
        mp = MediaPlayer.create(getApplicationContext(),R.raw.baarish);

    }
    @Override
    public int onStartCommand (Intent intent, int flags, int startId) {
        mp.start();
       // mp.setLooping(true);
        return START_STICKY;
    }

    @Override
    public void onDestroy () {
        mp.release();
        super.onDestroy();

    }
}