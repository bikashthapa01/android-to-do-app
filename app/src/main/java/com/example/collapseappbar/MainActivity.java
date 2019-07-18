package com.example.collapseappbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CardView firstCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        
        firstCard = findViewById(R.id.firstCard);
        firstCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "First Item Clicked", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),remainders.class);
                startActivity(i);
            }
        });
    }
}
