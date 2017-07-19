package com.example.abubakarzahid.arrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // loading data in to listview.
        String [] names = {"Abubakar","Arshad","Nouman","Mobashir","Hamza","Naeem","Asad","Ahmad","Shezi","Danish","Ahsan"};
        // now passing data in to array adapter
        ArrayAdapter<String> nameadapter= new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,names);
        //  now i am a accesing a listview
        ListView livnames = (ListView)findViewById(R.id.lvnames);
        // setting an adapter
        livnames.setAdapter(nameadapter);

    }
}
