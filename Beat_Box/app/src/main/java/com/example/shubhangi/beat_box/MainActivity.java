package com.example.shubhangi.beat_box;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.PlayButton);
        Button btn2 = findViewById(R.id.EditButton);
        ImageButton RecordAudio = findViewById(R.id.RecordButton);
        RecordAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click to record audio!", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click to edit audio!", Toast.LENGTH_SHORT)
                        .show();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Click to play audio!", Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
}
