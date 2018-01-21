package com.example.hp.beat_box;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;


import android.graphics.Movie;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.nio.channels.FileChannel;
import java.util.List;


public class MergeScreen extends AppCompatActivity {
    Handler handler=new Handler();
                  handler.postDelayed(new Runnable() {

        @Override
        public void run() {

            File first =  new File();
            File second = new File(path2);
            String filepath = Environment.getExternalStorageDirectory().getPath();
            File file = new File(filepath, "Dictatapp");
            mergeSongs(new File(file.getAbsoluteFile()+"/mergedFile.mp3"), new File[] {first, second});

        }
    },2000);
    private void mergeSongs(File mergedFile,File...mp3Files){

        try {
            FileInputStream fis1 = new FileInputStream(mp3Files[0]);
            FileInputStream fis2 = new FileInputStream(mp3Files[1]);
            Log.i("merge",mp3Files[0]+" "+mp3Files[1]);
            Toast.makeText(MainActivity.this, mp3Files[0].toString()+mp3Files[1].toString(), Toast.LENGTH_LONG).show();
            SequenceInputStream sis = new SequenceInputStream(fis1,fis2);

            if(!mergedFile.exists()){
                mergedFile.createNewFile();}

            FileOutputStream fos = new FileOutputStream(mergedFile);

            int temp;

            while ((temp = sis.read())!= -1){

                fos.write((byte)temp);

            }

            fis1.close();
            fis2.close();
            sis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merge_screen);
    }
}
