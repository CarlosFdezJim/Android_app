package com.CarlosFdez.xilofono;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void reproducirDo(View view){
        button = (Button) findViewById(R.id.button);
        MediaPlayer mpButton =  MediaPlayer.create(this,R.raw.note1);
        mpButton.start();
    }
    public void reproducirRe(View view){
        button2 = (Button) findViewById(R.id.button2);
        MediaPlayer mpButton =  MediaPlayer.create(this,R.raw.note2);
        mpButton.start();
    }
    public void reproducirMi(View view){
        button3 = (Button) findViewById(R.id.button3);
        MediaPlayer mpButton =  MediaPlayer.create(this,R.raw.note3);
        mpButton.start();
    }
    public void reproducirFa(View view){
        button4 = (Button) findViewById(R.id.button4);
        MediaPlayer mpButton =  MediaPlayer.create(this,R.raw.note4);
        mpButton.start();
    }
    public void reproducirSol(View view){
        button5 = (Button) findViewById(R.id.button5);
        MediaPlayer mpButton =  MediaPlayer.create(this,R.raw.note5);
        mpButton.start();
    }
    public void reproducirLa(View view){
        button6 = (Button) findViewById(R.id.button6);
        MediaPlayer mpButton =  MediaPlayer.create(this,R.raw.note6);
        mpButton.start();
    }
    public void reproducirSi(View view){
        button7 = (Button) findViewById(R.id.button7);
        MediaPlayer mpButton =  MediaPlayer.create(this,R.raw.note7);
        mpButton.start();
    }

}