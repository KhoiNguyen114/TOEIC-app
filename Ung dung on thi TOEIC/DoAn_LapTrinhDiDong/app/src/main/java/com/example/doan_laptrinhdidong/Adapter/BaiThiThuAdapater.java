package com.example.doan_laptrinhdidong.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.doan_laptrinhdidong.Model.BaiThiThu;
import com.example.doan_laptrinhdidong.R;

import java.util.List;

public class BaiThiThuAdapater extends ArrayAdapter<BaiThiThu> {
    public BaiThiThuAdapater(@NonNull Context context, @NonNull List<BaiThiThu> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_baithithu, parent, false);
        TextView textView = convertView.findViewById(R.id.textViewBaiThiThu);
        BaiThiThu baiThiThu = getItem(position);
        textView.setText(baiThiThu.getTenDeThi().toUpperCase());
        return convertView;
    }
}
