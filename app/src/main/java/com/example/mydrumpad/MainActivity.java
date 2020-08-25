package com.example.mydrumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool sp;
    private int s1;
    private int s2;
    private int s3;
    private int s4;
    private int s5;
    private int s6;
    private int s7;
    private int s8;
    private int s9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        s1=sp.load(getApplicationContext(),R.raw.sound1,1);
        s2=sp.load(getApplicationContext(),R.raw.sound2,1);
        s3=sp.load(getApplicationContext(),R.raw.sound3,1);
        s4=sp.load(getApplicationContext(),R.raw.sound4,1);
        s5=sp.load(getApplicationContext(),R.raw.sound5,1);
        s6=sp.load(getApplicationContext(),R.raw.sound6,1);
        s7=sp.load(getApplicationContext(),R.raw.sound7,1);
        s8=sp.load(getApplicationContext(),R.raw.sound8,1);
        s9=sp.load(getApplicationContext(),R.raw.sound9,1);
    }


    public void ps1(View v) {
        sp.play(s1,1.0f,1.0f,0,0,10f);
    }
    public void ps2(View v){
        sp.play(s2,1.0f,1.0f,0,0,10f);
    }
    public void ps3(View v){
        sp.play(s3,1.0f,1.0f,0,0,10f);
    }
    public void ps4(View v){
        sp.play(s4,1.0f,1.0f,0,0,10f);
    }
    public void ps5(View v){
        sp.play(s5,1.0f,1.0f,0,0,10f);
    }
    public void ps6(View v){
        sp.play(s6,1.0f,1.0f,0,0,10f);
    }
    public void ps7(View v){
        sp.play(s7,1.0f,1.0f,0,0,10f);
    }
    public void ps8(View v){
        sp.play(s8,1.0f,1.0f,0,0,10f);
    }
    public void ps9(View v){
        sp.play(s9,1.0f,1.0f,0,0,10f);
    }
}