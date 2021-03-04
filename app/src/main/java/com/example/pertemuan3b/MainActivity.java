package com.example.pertemuan3b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void acttwo(View view) {
        Intent a = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(a);
        Toast.makeText(this, "Ke activity 2", Toast.LENGTH_SHORT).show();
    }
}