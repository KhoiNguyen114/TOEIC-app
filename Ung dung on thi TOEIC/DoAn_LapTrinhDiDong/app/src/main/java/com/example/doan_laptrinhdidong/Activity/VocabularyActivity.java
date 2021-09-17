package com.example.doan_laptrinhdidong.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.doan_laptrinhdidong.DatabaseHelper;
import com.example.doan_laptrinhdidong.Model.Vocabulary;
import com.example.doan_laptrinhdidong.R;
import com.example.doan_laptrinhdidong.Adapter.VocabularyAdapter;

import java.util.ArrayList;

public class VocabularyActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Vocabulary> arrayList;
    VocabularyAdapter vocabularyAdapter;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);
        gridView = findViewById(R.id.gridViewVocabulary);
        databaseHelper = new DatabaseHelper(getApplicationContext());
        arrayList = databaseHelper.getAllVocabulary();
        vocabularyAdapter = new VocabularyAdapter(getApplicationContext(),arrayList);
        gridView.setAdapter(vocabularyAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(VocabularyActivity.this, DetailVocabularyActivity.class);
                intent.putExtra("Tu",arrayList.get(position));
                intent.putExtra("DanhSach",arrayList);
                intent.putExtra("viTri",position);
                startActivity(intent);
            }
        });
        getSupportActionBar().setTitle("Vocabulary");
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#77ACF1")));
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.custom_actionbar_vocabulary));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(VocabularyActivity.this, MainActivity.class);
        finish();
        return super.onSupportNavigateUp();
    }


}