package com.example.hp.beat_box;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void recordOnButtonClick(View view){
        ImageButton RecordAudio=findViewById(R.id.RecordButton);
        RecordAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Record=new Intent(MainActivity.this, RecordScreen.class);
                startActivity(Record);
            }
        });
    }
    public void mergeOnButtonClick(View view) {
        ImageButton MergeAudio = findViewById(R.id.MergeButton);
        MergeAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Merge=new Intent(MainActivity.this, MergeScreen.class);
                startActivity(Merge);
            }
        });
    }
}
