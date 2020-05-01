package com.dan.naari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class AddRelative extends AppCompatActivity {

    EditText et1;
    EditText et2;
    Button bt;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_relative);

        et1 = (EditText) findViewById(R.id.editText2);
        et2 = (EditText) findViewById(R.id.editText3);
        bt = (Button) findViewById(R.id.button);
        lv = (ListView) findViewById(R.id.listView);

        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(AddRelative.this,
                android.R.layout.simple_list_item_1, arrayList);
        // Set ListView Adapter
        lv.setAdapter(adapter);
        onBtnClick();


    }

    public void onBtnClick(){
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et1.getText().toString().trim();
                String number = et2.getText().toString().trim();
                arrayList.add(name);
                arrayList.add(number);
                adapter.notifyDataSetChanged();
            }
        });
    }

//    public void addThem(View v){
//        String name = et1.getText().toString().trim();
//        String number = et2.getText().toString().trim();
//        adapter.notifyDataSetChanged();
//    }
}
