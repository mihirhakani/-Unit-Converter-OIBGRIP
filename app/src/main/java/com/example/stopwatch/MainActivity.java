package com.example.stopwatch;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;

import android.widget.Chronometer;



public class MainActivity extends AppCompatActivity {

    private Chronometer Counter;
    private boolean running;
    private long pauseOff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Counter = this.findViewById(R.id.Counter);
    }

    public void StartCounter(View v){
        if (!running){
            Counter.setBase(SystemClock.elapsedRealtime()-pauseOff);
            Counter.start();
            running = true;
        }
    }

    public void floatingActionButton(View v){
        if (running){
            pauseOff = SystemClock.elapsedRealtime() - Counter.getBase();
            Counter.stop();
            running = false;

        }

    }

    public void ResetCounter(View v){
        Counter.setBase(SystemClock.elapsedRealtime());
        pauseOff=0;


    }






}
