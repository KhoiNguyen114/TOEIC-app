package com.example.doan_laptrinhdidong.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.doan_laptrinhdidong.Adapter.GrammarAdapter;
import com.example.doan_laptrinhdidong.DatabaseHelper;
import com.example.doan_laptrinhdidong.Model.Grammar;
import com.example.doan_laptrinhdidong.R;

import java.util.ArrayList;

public class GrammarActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Grammar> arrayList;
    ArrayList<Grammar> data;
    GrammarAdapter grammarAdapter;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar);

        gridView = findViewById(R.id.gridViewGrammar);
        databaseHelper = new DatabaseHelper(this);
        data = databaseHelper.getAllGrammar();
        arrayList = showList(data);
        grammarAdapter = new GrammarAdapter(getApplicationContext(),arrayList);
        gridView.setAdapter(grammarAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(GrammarActivity.this, DetailGrammarActivity.class);
                String name = arrayList.get(position).getLoaiNguPhap();
                ArrayList<Grammar> ds = new ArrayList<>();
                for(int i=0; i<data.size(); i++)
                {
                    if(data.get(i).getLoaiNguPhap().equals(name))
                    {
                        Grammar cs = data.get(i);
                        ds.add(cs);
                    }
                }
                intent.putExtra("LoaiNguPhap", ds);
                intent.putExtra("TieuDe",arrayList.get(position));
                startActivity(intent);
            }
        });

        getSupportActionBar().setTitle("Grammar");
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#EF7CA9")));
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.custom_actionbar_vocabulary));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(GrammarActivity.this, MainActivity.class);
        finish();
        return super.onSupportNavigateUp();
    }


    public ArrayList<Grammar> showList(ArrayList<Grammar> list)
    {
        ArrayList<Grammar> ds = new ArrayList<>();
        for(int i=0; i<list.size(); i++)
        {
            if(ds == null)
            {
                ds.add(list.get(i));
            }
            if(kiemTraList(ds, list.get(i).getLoaiNguPhap()))
            {
                ds.add(list.get(i));
            }
        }
        return ds;
    }

    public boolean kiemTraList(ArrayList<Grammar> list, String pLoaiNguPhap)
    {
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getLoaiNguPhap().equals(pLoaiNguPhap))
            {
                return false;
            }
        }
        return true;
    }
}