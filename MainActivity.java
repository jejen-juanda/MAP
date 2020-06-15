package com.example.map;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button tombol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tombol = findViewById(R.id.tombol1);
// Sebuah Listener untuk penanganan kejadian saat tombol diklik
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Memunculkan pesan berupa text dialog saat tombol "Jawab" diklik.
                Toast.makeText(getApplicationContext(), "Waalaikum salam!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}