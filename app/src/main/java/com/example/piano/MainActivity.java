package com.example.piano;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final int NR_OF_SIMULATION_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;


    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mdSoundId;
    private int meSoundId;
    private int mfSoundId;
    private int mgSoundId;
    private int maSoundId;
    private int mbSoundId;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mSoundPool = new SoundPool(NR_OF_SIMULATION_SOUNDS, AudioManager.STREAM_MUSIC, 0);


        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        mdSoundId = mSoundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        meSoundId = mSoundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        mfSoundId = mSoundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        mgSoundId = mSoundPool.load(getApplicationContext(), R.raw.note5_g, 1);
        maSoundId = mSoundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        mbSoundId = mSoundPool.load(getApplicationContext(), R.raw.note7_b, 1);

    }

    public void playc(View v){
        Log.d("PiaNo", "Button worked");
        mSoundPool.play(mCSoundId,LEFT_VOLUME, RIGHT_VOLUME, NO_LOOP, PRIORITY, NORMAL_PLAY_RATE);
    }
    public void playd(View v){
        Log.d("PiaNo", "Button worked");
        mSoundPool.play(mdSoundId,LEFT_VOLUME, RIGHT_VOLUME, NO_LOOP, PRIORITY, NORMAL_PLAY_RATE);
    }
    public void playe(View v){
        Log.d("PiaNo", "Button worked");
        mSoundPool.play(meSoundId,LEFT_VOLUME, RIGHT_VOLUME, NO_LOOP, PRIORITY, NORMAL_PLAY_RATE);
    }
    public void playf(View v){
        Log.d("PiaNo", "Button worked");
        mSoundPool.play(mfSoundId,LEFT_VOLUME, RIGHT_VOLUME, NO_LOOP, PRIORITY, NORMAL_PLAY_RATE);
    }
    public void playg(View v){
        Log.d("PiaNo", "Button worked");
        mSoundPool.play(mgSoundId,LEFT_VOLUME, RIGHT_VOLUME, NO_LOOP, PRIORITY, NORMAL_PLAY_RATE);
    }
    public void playa(View v){
        Log.d("PiaNo", "Button worked");
        mSoundPool.play(maSoundId,LEFT_VOLUME, RIGHT_VOLUME, NO_LOOP, PRIORITY, NORMAL_PLAY_RATE);
    }
    public void playb(View v){
        Log.d("PiaNo", "Button worked");
        mSoundPool.play(mbSoundId,LEFT_VOLUME, RIGHT_VOLUME, NO_LOOP, PRIORITY, NORMAL_PLAY_RATE);
    }




}
