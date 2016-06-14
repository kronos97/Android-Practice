package com.example.mayur.practice;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* TextView t;
        t= (TextView) findViewById(R.id.textView);
        t.setPaintFlags(t.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    */

        Toast.makeText(MainActivity.this, "WELCOME", Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, "You have sucessfully loggeed in.", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        Log.e("Pause","app has paused");
        super.onPause();
        Toast.makeText(MainActivity.this,"App Paused",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        Log.d("on start","start has started");
        super.onStart();
        Toast.makeText(MainActivity.this,"App started",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this,"App stopped",Toast.LENGTH_LONG).show();
    }

}
