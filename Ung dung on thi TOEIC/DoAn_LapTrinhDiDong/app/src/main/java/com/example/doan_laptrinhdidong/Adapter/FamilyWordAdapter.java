package com.example.doan_laptrinhdidong.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.doan_laptrinhdidong.Model.FamilyWord;
import com.example.doan_laptrinhdidong.R;

import java.util.List;

public class FamilyWordAdapter extends ArrayAdapter<FamilyWord> {
    public FamilyWordAdapter(@NonNull Context context, @NonNull List<FamilyWord> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_family_word,parent,false);
        TextView textView1 = convertView.findViewById(R.id.textViewDanhMucFamilyWord);
        textView1.setText((position + 1) + "");
        return convertView;
    }
}
