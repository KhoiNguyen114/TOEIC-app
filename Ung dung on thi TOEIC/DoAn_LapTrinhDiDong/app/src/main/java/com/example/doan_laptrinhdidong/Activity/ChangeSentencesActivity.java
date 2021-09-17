package com.example.doan_laptrinhdidong.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.doan_laptrinhdidong.Adapter.ChangeSentencesAdapter;
import com.example.doan_laptrinhdidong.DatabaseHelper;
import com.example.doan_laptrinhdidong.Model.ChangeSentences;
import com.example.doan_laptrinhdidong.R;

import java.util.ArrayList;

public class ChangeSentencesActivity extends AppCompatActivity {

    GridView gridView;
    ChangeSentencesAdapter changeSentencesAdapter;
    ArrayList<ChangeSentences> arrayList;
    ArrayList<ChangeSentences> data;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_sentences);

        gridView = findViewById(R.id.gridViewChangeSentences);
        databaseHelper = new DatabaseHelper(this);
        data = databaseHelper.getAllChangeSentences();
        arrayList = showList(data);
        changeSentencesAdapter = new ChangeSentencesAdapter(getApplicationContext(),arrayList);
        gridView.setAdapter(changeSentencesAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ChangeSentencesActivity.this, DetailChangeSentencesActivity.class);
                String name = arrayList.get(position).getLoaiCau();
                ArrayList<ChangeSentences> ds = new ArrayList<>();
                for(int i=0; i<data.size(); i++)
                {
                    if(data.get(i).getLoaiCau().equals(name))
                    {
                        ChangeSentences cs = data.get(i);
                        ds.add(cs);
                    }
                }
                intent.putExtra("LoaiCau", ds);
                intent.putExtra("TieuDe", arrayList.get(position));
                startActivity(intent);
            }
        });


        getSupportActionBar().setTitle("Change Sentences");
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F4EE6B")));
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.custom_actionbar_vocabulary));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(ChangeSentencesActivity.this, MainActivity.class);
        finish();
        return super.onSupportNavigateUp();
    }

    public ArrayList<ChangeSentences> showList(ArrayList<ChangeSentences> list)
    {
        ArrayList<ChangeSentences> ds = new ArrayList<>();
        for(int i=0; i<list.size(); i++)
        {
            if(ds == null)
            {
                ds.add(list.get(i));
            }
            if(kiemTraList(ds, list.get(i).getLoaiCau()))
            {
                ds.add(list.get(i));
            }
        }
        return ds;
    }

    public boolean kiemTraList(ArrayList<ChangeSentences> list, String pLoaiCau)
    {
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getLoaiCau().equals(pLoaiCau))
            {
                return false;
            }
        }
        return true;
    }
}