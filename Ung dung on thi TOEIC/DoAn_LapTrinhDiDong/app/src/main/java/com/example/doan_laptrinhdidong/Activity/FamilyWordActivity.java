package com.example.doan_laptrinhdidong.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.doan_laptrinhdidong.Adapter.FamilyWordAdapter;
import com.example.doan_laptrinhdidong.DatabaseHelper;
import com.example.doan_laptrinhdidong.Model.FamilyWord;
import com.example.doan_laptrinhdidong.R;

import java.util.ArrayList;

public class FamilyWordActivity extends AppCompatActivity {

    GridView gridView;
    FamilyWordAdapter familyWordAdapter;
    ArrayList<FamilyWord> arrayList;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_word);

        gridView = findViewById(R.id.gridFamilyWord);
        databaseHelper = new DatabaseHelper(this);
        arrayList = databaseHelper.getAllFamilyWord();
        familyWordAdapter = new FamilyWordAdapter(getApplicationContext(),arrayList);
        gridView.setAdapter(familyWordAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(FamilyWordActivity.this, DetailFamilyWordActivity.class);
                intent.putExtra("Tu", arrayList.get(position));
                intent.putExtra("DanhSach", arrayList);
                intent.putExtra("viTri", position);
                startActivity(intent);
            }
        });

        getSupportActionBar().setTitle("Family Word");
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F62323")));
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.custom_actionbar_vocabulary));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(FamilyWordActivity.this, MainActivity.class);
        finish();
        return super.onSupportNavigateUp();
    }


}