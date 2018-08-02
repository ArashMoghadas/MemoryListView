package com.example.asus.memorylistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MemoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);

        ArrayList<String> memos = new ArrayList<>();
        memos.add(getString(R.string.memo1));
        memos.add(getString(R.string.memo2));
        memos.add(getString(R.string.memo3));
        memos.add(getString(R.string.memo4));
        memos.add(getString(R.string.memo5));
        memos.add(getString(R.string.memo6));
        memos.add(getString(R.string.memo7));
        memos.add(getString(R.string.memo8));

        ListView memoListView = findViewById(R.id.memory);
        MemoryAdapter adapter = new MemoryAdapter(this, memos);
        memoListView.setAdapter((ListAdapter) adapter);

    }

}
