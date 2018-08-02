package com.example.asus.memorylistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void memories(View view) {
        Intent intent = new Intent(MainActivity.this, MemoryActivity.class);
        startActivity(intent);
    }
}
