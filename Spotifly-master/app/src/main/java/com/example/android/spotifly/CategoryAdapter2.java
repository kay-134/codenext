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

public class CategoryAdapter2 extends ArrayAdapter<Categoryitem> {
    public CategoryAdapter2(Context context, ArrayList list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView2, @NonNull ViewGroup parent) {
        convertView2 = LayoutInflater.from(getContext()).inflate(R.layout.category_list_item2, parent, false);
        Categoryitem currentCategoryItem2 = getItem(position);
        ImageView categoryItemImageView2 = convertView2.findViewById(R.id.list_item_photo2);
        categoryItemImageView2.setImageResource(currentCategoryItem2.getPhoto());
        TextView categoryItemTextView2 = convertView2.findViewById(R.id.list_item_name2);
        categoryItemTextView2.setText(currentCategoryItem2.getName());

        return convertView2;

    }
}


