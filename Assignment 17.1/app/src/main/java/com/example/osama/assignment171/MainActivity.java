package com.example.osama.assignment171;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button play,
            pause,
            stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (Button) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, MyService.class);
                startService(myIntent);
                Toast.makeText(MainActivity.this, "Start Service", Toast.LENGTH_SHORT).show();
            }
        });


        pause = (Button) findViewById(R.id.pause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, MyService.class);
                stopService(myIntent);
                Toast.makeText(MainActivity.this, "Pause Service", Toast.LENGTH_SHORT).show();
            }
        });
        stop = (Button) findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, MyService.class);
                stopService(myIntent);
                Toast.makeText(MainActivity.this, "Stop Service", Toast.LENGTH_SHORT).show();
            }
        });

    }

//    private ProgressBar progressBar = null;
}