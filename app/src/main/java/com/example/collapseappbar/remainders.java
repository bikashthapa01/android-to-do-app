package com.example.collapseappbar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class remainders extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> items;
    Adapter adapter;
    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remainders);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Remainders");
        // items added to the list
        items = new ArrayList<>();
        items.add("First Item");
        items.add("Second Item");
        items.add("Third Item");
        items.add("Fourth Item");
        items.add("Fifth Item");
        recyclerView = findViewById(R.id.remainder_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this,items);
        recyclerView.setAdapter(adapter);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(remainders.this, "New Remainder Added", Toast.LENGTH_SHORT).show();
                items.add("New Item "  + count);
                count++;
                adapter.notifyDataSetChanged();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
