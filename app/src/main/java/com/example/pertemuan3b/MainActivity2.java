package com.example.pertemuan3b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void actone(View view) {
        Intent b = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(b);
        Toast.makeText(this, "ke activity 1", Toast.LENGTH_SHORT).show();
        onStop();
    }
}