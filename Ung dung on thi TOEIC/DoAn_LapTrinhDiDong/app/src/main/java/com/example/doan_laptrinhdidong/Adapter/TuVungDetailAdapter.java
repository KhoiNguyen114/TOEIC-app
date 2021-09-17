package com.example.doan_laptrinhdidong.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.doan_laptrinhdidong.Model.TuVung;
import com.example.doan_laptrinhdidong.R;

import java.util.List;

public class TuVungDetailAdapter extends ArrayAdapter<TuVung> {
    public TuVungDetailAdapter(@NonNull Context context, @NonNull List<TuVung> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_detail_search,parent,false);
        TuVung tuVung = getItem(position);
        TextView textView = convertView.findViewById(R.id.textViewChiTietDanhMuc);
        textView.setText(tuVung.getTu() + " " + tuVung.getLoaiTu() + ": " + tuVung.getNghia());
        return convertView;
    }
}
