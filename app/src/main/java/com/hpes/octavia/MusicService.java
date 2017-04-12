package com.hpes.octavia;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.MediaStore;

public class MusicService extends Service implements MediaPlayer.OnCompletionListener {
    public MusicService() {
    }
MediaPlayer mplayer;
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mplayer= MediaPlayer.create(this,R.raw.audio1);
        mplayer.setOnCompletionListener(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mplayer.isPlaying()==true)
        {
            mplayer.stop();
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if(mplayer.isPlaying()==false)
        {
            mplayer.start();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCompletion(MediaPlayer mediaPlayer) {
        stopSelf();
    }
}
