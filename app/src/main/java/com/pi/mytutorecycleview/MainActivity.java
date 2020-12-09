package com.pi.mytutorecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String elements[]={"element 1", "element 2", "element 3", "element 4", "element 5", "element 6", "element 7",
            "element 8", "element 9", "element 10",};

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycler_view);
        MyAdapter adapter = new MyAdapter(getApplicationContext(),elements);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);


       // RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        //recyclerView.setAdapter(myAdapter);
        //recyclerView.setLayoutManager(layoutManager);

    }
}