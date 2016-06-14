package com.example.mayur.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2,c3;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1 = (CheckBox) findViewById(R.id.checkBox);
        c2= (CheckBox) findViewById(R.id.checkBox2);
        c3= (CheckBox) findViewById(R.id.checkBox3);

        b= (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total=0;
                StringBuilder e=new StringBuilder();

                if(c1.isChecked())
                {
                    total+=100;
                    e.append("\nStuff 1 Prize is: " +total);

                }
                if(c2.isChecked())
                {
                        total+=200;
                        e.append("\nStuff 2 Prize is: " +total);


                }
                if(c3.isChecked())
                {

                    e.append("\nStuff 3 Prize is: " +total);
                    total+=300;

                }

                Toast.makeText(MainActivity.this,e.toString()+"\n Stuff Total: "+total,Toast.LENGTH_LONG).show();

                Intent i=new Intent(MainActivity.this,Activity2.class);
                startActivity(i);
            }
        });



    }
}
