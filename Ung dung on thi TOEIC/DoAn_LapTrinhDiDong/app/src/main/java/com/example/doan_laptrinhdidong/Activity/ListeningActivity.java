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

import com.example.doan_laptrinhdidong.Adapter.ListeningAdapter;
import com.example.doan_laptrinhdidong.DatabaseHelper;
import com.example.doan_laptrinhdidong.Model.Listening;
import com.example.doan_laptrinhdidong.R;
import com.example.doan_laptrinhdidong.Utils;

import java.util.ArrayList;

public class ListeningActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Listening> arrayList;
    ArrayList<Listening> data;
    ListeningAdapter listeningAdapter;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listening);

        gridView = findViewById(R.id.gridviewListening);
        databaseHelper = new DatabaseHelper(this);
        data = databaseHelper.getAllListening();
        Log.d("listListen", data.size() + "");
        arrayList = showList(data);
        Log.d("listListen1", arrayList.size() + "");
        listeningAdapter = new ListeningAdapter(getApplicationContext(),arrayList);
        gridView.setAdapter(listeningAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListeningActivity.this, DetailListeningActivity.class);
                String name = arrayList.get(position).getIDAudio();
                ArrayList<Listening> ds = new ArrayList<>();
                for(int i=0; i<data.size(); i++)
                {
                    if(data.get(i).getIDAudio().equals(name))
                    {
                        Listening ls = data.get(i);
                        ds.add(ls);
                    }
                }
                intent.putExtra("LoaiBaiNghe", ds);
                intent.putExtra("TieuDe",arrayList.get(position));
                intent.putExtra("viTri",position);
                startActivity(intent);
            }
        });

        getSupportActionBar().setTitle("Listening");
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#9DEF55")));
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.custom_actionbar_vocabulary));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(ListeningActivity.this, MainActivity.class);
        finish();
        return super.onSupportNavigateUp();
    }


    public ArrayList<Listening> showList(ArrayList<Listening> list)
    {
        ArrayList<Listening> ds = new ArrayList<>();
        for(int i=0; i<list.size(); i++)
        {
            if(ds == null)
            {
                ds.add(list.get(i));
            }
            if(kiemTraList(ds, list.get(i).getIDAudio()))
            {
                ds.add(list.get(i));
            }
        }
        return ds;
    }

    public boolean kiemTraList(ArrayList<Listening> list, String pIDAudio)
    {
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getIDAudio().equals(pIDAudio))
            {
                return false;
            }
        }
        return true;
    }
}