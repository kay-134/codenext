package com.example.android.spotifly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CategoryAdapter extends ArrayAdapter<Categoryitem> {
    public CategoryAdapter(Context context, ArrayList list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.category_list_item, parent, false);
        Categoryitem currentCategoryItem = getItem(position);
        ImageView categoryItemImageView = convertView.findViewById(R.id.list_item_photo);
        categoryItemImageView.setImageResource(currentCategoryItem.getPhoto());
        TextView categoryItemTextView = convertView.findViewById(R.id.list_item_name);
        categoryItemTextView.setText(currentCategoryItem.getName());

        return convertView;

    }


}