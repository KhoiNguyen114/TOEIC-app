package com.example.doan_laptrinhdidong.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.doan_laptrinhdidong.Model.Vocabulary;
import com.example.doan_laptrinhdidong.R;

import java.util.List;

public class VocabularyAdapter extends ArrayAdapter<Vocabulary> {
    public VocabularyAdapter(@NonNull Context context, @NonNull List<Vocabulary> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_vocabulary,parent,false);
        TextView textView = convertView.findViewById(R.id.textViewDanhMucVocabulary);
        textView.setText((position + 1 )+ "");
        return convertView;
    }
}
