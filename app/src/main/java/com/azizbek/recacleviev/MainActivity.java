package com.azizbek.recacleviev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView1;
    ArrayList <Integer> imagearraylist;
    ArrayList<String> namerraylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView1=findViewById(R.id.recucle);
        imagearraylist=new ArrayList<>();
        namerraylist=new ArrayList<>();
        imagearraylist.add(R.drawable.bugatti1);
        imagearraylist.add(R.drawable.bmv1);
        imagearraylist.add(R.drawable.nissan1);
        imagearraylist.add(R.drawable.koenigsegg1);

        namerraylist.add("bugatt");
        namerraylist.add("BMV");
        namerraylist.add("NISSAN");
        namerraylist.add("koenigsegg");


    }
}