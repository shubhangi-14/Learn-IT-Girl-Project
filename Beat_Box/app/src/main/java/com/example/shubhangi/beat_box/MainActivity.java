package com.example.shubhangi.beat_box;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View.OnClickListener;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        ImageButton TrimAudio = findViewById(R.id.TrimButton);
        ImageButton MergeAudio = findViewById(R.id.MergeButton);

        TrimAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click to trim audio!", Toast.LENGTH_LONG);
            }
        });
        MergeAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click to merge audio!", Toast.LENGTH_LONG);
            }
        });

    }

    public void addListenerOnButton() {

        ImageButton RecordAudio = findViewById(R.id.RecordButton);

        RecordAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(MainActivity.this, DisplayActivity.class) );

            }
        });


        }
}


