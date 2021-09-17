package com.example.doan_laptrinhdidong.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.doan_laptrinhdidong.Model.DanhSachPartNghe;
import com.example.doan_laptrinhdidong.R;

import java.util.List;

public class DanhSachPartNgheAdapter extends ArrayAdapter<DanhSachPartNghe> {
    public DanhSachPartNgheAdapter(@NonNull Context context, @NonNull List<DanhSachPartNghe> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_danhmuc_baithithu, parent, false);
        TextView textView = convertView.findViewById(R.id.textViewDanhMucNgheBaiThiThu);
        DanhSachPartNghe danhSachPartNghe = getItem(position);
        textView.setText(danhSachPartNghe.getPart() + ". " + danhSachPartNghe.getMoTa());
        return convertView;
    }
}
