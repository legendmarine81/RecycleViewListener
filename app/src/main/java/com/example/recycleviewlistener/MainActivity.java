package com.example.recycleviewlistener;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Model> arrayList = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new Model(R.drawable.animalize,"Animalize","KISS - 1984"));
        arrayList.add(new Model(R.drawable.licktiup,"Lick It Up","KISS - 1983"));
        arrayList.add(new Model(R.drawable.lastcommand,"The Last Command","WASP - 1985"));
        arrayList.add(new Model(R.drawable.toofast,"Too Fast For Love","Motley Crue - 1981"));
        arrayList.add(new Model(R.drawable.wasp,"W.A.S.P.","WASP - 1984"));
        arrayList.add(new Model(R.drawable.crimson,"The Crimson Idol","WASP - 1992"));
        arrayList.add(new Model(R.drawable.british,"British Steel","Judas Priest - 1980"));

        ModelRecyclerView modelRecyclerView=new ModelRecyclerView(this,arrayList);
        recyclerView.setAdapter(modelRecyclerView);





    }
}