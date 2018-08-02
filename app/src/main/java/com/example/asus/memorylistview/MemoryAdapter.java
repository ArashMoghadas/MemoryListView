package com.example.asus.memorylistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MemoryAdapter extends ArrayAdapter<String> {

    public MemoryAdapter(@NonNull Context context, @NonNull List<String> memos) {
        super(context, 0, memos);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        String name = getItem(position);

        TextView nameTextView = convertView.findViewById(R.id.text);
        nameTextView.setText(name);


        ImageView faceImageView = convertView.findViewById(R.id.image);

        switch (position) {
            case 0:
                faceImageView.setImageResource(R.drawable.ank0);
                break;
            case 1:
                faceImageView.setImageResource(R.drawable.ank1);
                break;
            case 2:
                faceImageView.setImageResource(R.drawable.ank2);
                break;
            case 3:
                faceImageView.setImageResource(R.drawable.ank3);
                break;
            case 4:
                faceImageView.setImageResource(R.drawable.h0);
                break;
            case 5:
                faceImageView.setImageResource(R.drawable.h1);
                break;
            case 6:
                faceImageView.setImageResource(R.drawable.h2);
                break;
            case 7:
                faceImageView.setImageResource(R.drawable.h3);
                break;
        }


        return convertView;
    }
}
