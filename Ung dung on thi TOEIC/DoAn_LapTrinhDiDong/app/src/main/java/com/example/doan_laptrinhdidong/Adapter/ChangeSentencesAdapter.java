package com.example.doan_laptrinhdidong.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.doan_laptrinhdidong.Model.ChangeSentences;
import com.example.doan_laptrinhdidong.R;

import java.util.List;

public class ChangeSentencesAdapter extends ArrayAdapter<ChangeSentences> {
    public ChangeSentencesAdapter(@NonNull Context context, @NonNull List<ChangeSentences> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_change_sentences,parent,false);
        ChangeSentences changeSentences = getItem(position);
        ImageView imageView = convertView.findViewById(R.id.imageViewChangeSentences);
        TextView textView = convertView.findViewById(R.id.textViewChangeSentences);
        imageView.setImageBitmap(ChangeSentences.convertStringToBitmapFromAccess(getContext(),"icon_changsentences.png"));
        textView.setText(changeSentences.getLoaiCau());
        return convertView;
    }
}
