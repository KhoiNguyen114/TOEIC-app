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

import com.example.doan_laptrinhdidong.Model.Grammar;
import com.example.doan_laptrinhdidong.R;

import java.util.List;

public class GrammarAdapter extends ArrayAdapter<Grammar>{
    public GrammarAdapter(@NonNull Context context, @NonNull List<Grammar> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_grammar,parent,false);
        Grammar grammar = getItem(position);
        ImageView imageView = convertView.findViewById(R.id.imageViewGrammar);
        TextView textView = convertView.findViewById(R.id.textViewGrammar);
        imageView.setImageBitmap(Grammar.convertStringToBitmapFromAccess(getContext(),"icon_grammar.png"));
        textView.setText(grammar.getLoaiNguPhap());
        return convertView;
    }
}
