package com.sksouk.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<recyclerview_class> lstRecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstRecyclerview = new ArrayList<>();
        lstRecyclerview.add(new recyclerview_class("Title","message 1","message 2","message 3"));
        lstRecyclerview.add(new recyclerview_class("Title","message 1","message 2","message 3"));
        lstRecyclerview.add(new recyclerview_class("Title","message 1","message 2","message 3"));

        RecyclerView myrv = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstRecyclerview);
        myrv.setLayoutManager(new GridLayoutManager(this,1));
        myrv.setAdapter(myAdapter);
    }
}
