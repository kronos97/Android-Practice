package com.example.mayur.restaurantmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    /* object for listview can be created here as well */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String[] array1 ={"Parley","Britannia","Nestle","Cadbury","Sunfeast","Oreo","Aloo Dum","Random Alooo","More food","Parley","Britannia","Nestle","Cadbury","Sunfeast","Oreo","Aloo Dum","Random Alooo","More food"};

        ListAdapter listAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array1);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(listAdapter);




    }
}
