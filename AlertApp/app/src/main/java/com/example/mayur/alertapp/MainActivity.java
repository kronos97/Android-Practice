package com.example.mayur.alertapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
                alert.setMessage("Drink Water").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        finish();

                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        AlertDialog.Builder alert1= new AlertDialog.Builder(MainActivity.this);
                        alert1.setMessage("Please drink water");
                        alert1.setTitle("Request");
                        AlertDialog a1=alert1.create();
                        a1.show();
                        t= (TextView) findViewById(R.id.textView);
                        t.setText("PLEASE DRINK WATER!");
                        b.setVisibility(b.GONE);

                    }
                });

                alert.setTitle("Drinkwater ALert");
                AlertDialog a = alert.create();
                a.show();

            }
        });


    }
}
