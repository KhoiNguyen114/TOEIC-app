package com.example.doan_laptrinhdidong.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import android.widget.ListView;

import com.example.doan_laptrinhdidong.Model.TuVung;
import com.example.doan_laptrinhdidong.R;
import com.example.doan_laptrinhdidong.Adapter.TuVungDetailAdapter;

import java.util.ArrayList;


public class DetailSearchActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<TuVung> arrayList;
    TuVungDetailAdapter tuVungDetailAdapter;
    String tenDanhMuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_search);

        listView = findViewById(R.id.listViewDetailSearch);

        arrayList = (ArrayList<TuVung>) getIntent().getSerializableExtra("DanhSachTu");
        tenDanhMuc = (String) getIntent().getSerializableExtra("TenDanhMuc");

        tuVungDetailAdapter = new TuVungDetailAdapter(getApplicationContext(), arrayList);
        listView.setAdapter(tuVungDetailAdapter);

        getSupportActionBar().setTitle(tenDanhMuc);
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F4EE6B")));
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.custom_actionbar_vocabulary));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(DetailSearchActivity.this, MainActivity.class);
        finish();
        return super.onSupportNavigateUp();
    }
}