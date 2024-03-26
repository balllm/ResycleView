package com.example.resycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycleView);

        ArrayList<MyRecycleView> arrayList = new ArrayList<>();

        arrayList.add(new MyRecycleView(R.drawable.braz, "Бразилия", "Бразилиа"));
        arrayList.add(new MyRecycleView(R.drawable.arg, "Аргентина", "Буэнос-Айрес"));
        arrayList.add(new MyRecycleView(R.drawable.colu, "Колумбия", "Богота"));
        arrayList.add(new MyRecycleView(R.drawable.uru, "Уругвай", "Монтевидео"));
        arrayList.add(new MyRecycleView(R.drawable.chi, "Чили", "Сантьяго"));



        recyclerView.setHasFixedSize(true);
        MyRecycleViewAdapter adapter = new MyRecycleViewAdapter(arrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}