package com.example.doan_laptrinhdidong.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.doan_laptrinhdidong.Model.ChangeSentences;
import com.example.doan_laptrinhdidong.R;

import java.util.ArrayList;

public class DetailChangeSentencesActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioGroup radioGroup;
    Button button;
    Button prev;
    Button next;
    ChangeSentences changeSentences;
    ArrayList<ChangeSentences> arrayList;
    int eventNum = 0;
    int eventEnd = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_change_sentences);
        textView1 = findViewById(R.id.textViewCauDeChangeSentences);
        radioButton1 = findViewById(R.id.rdoDapAnAChangeSentences);
        radioButton2 = findViewById(R.id.rdoDapAnBChangeSentences);
        radioButton3 = findViewById(R.id.rdoDapAnCChangeSentences);
        radioButton4 = findViewById(R.id.rdoDapAnDChangeSentences);
        radioGroup = findViewById(R.id.RadioGroupChangeSentences);
        textView2 = findViewById(R.id.textViewDapAnDungChangeSentences);
        button = findViewById(R.id.btnKiemTraChangeSentences);
        prev = findViewById(R.id.btnPrevChangeSentences);
        next = findViewById(R.id.btnNextChangeSentences);

        changeSentences = (ChangeSentences) getIntent().getSerializableExtra("TieuDe");
        arrayList = (ArrayList<ChangeSentences>) getIntent().getSerializableExtra("LoaiCau");
        eventEnd = arrayList.size();

        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_actionbar_title);
        textView3 = findViewById(R.id.textViewActionbarTitle);
        setEventData(eventNum);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButton1.setEnabled(false);
                radioButton2.setEnabled(false);
                radioButton3.setEnabled(false);
                radioButton4.setEnabled(false);
                textView2.setVisibility(View.VISIBLE);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eventNum > 0)
                {
                    eventNum--;
                    setEventData(eventNum);
                    return;
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eventNum < eventEnd - 1)
                {
                    eventNum++;
                    setEventData(eventNum);
                    return;
                }
            }
        });

        radioButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                button.setEnabled(true);
            }
        });
        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                button.setEnabled(true);
            }
        });
        radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                button.setEnabled(true);
            }
        });
        radioButton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                button.setEnabled(true);
            }
        });


        //getSupportActionBar().setTitle(changeSentences.getLoaiCau() + " - Câu " + (eventNum + 1));
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F4EE6B")));
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.custom_actionbar_vocabulary));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void setEventData(int num)
    {
        radioGroup.clearCheck();
        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);
        radioButton3.setEnabled(true);
        radioButton4.setEnabled(true);
        changeSentences = arrayList.get(num);
        //getSupportActionBar().setTitle(changeSentences.getLoaiCau() + " - Câu " + (num + 1));
        textView3.setText(changeSentences.getLoaiCau() + " - Question " + (eventNum + 1));
        textView1.setText(changeSentences.getCauDe());
        radioButton1.setText("A. " + changeSentences.getDapAnA());
        radioButton2.setText("B. " + changeSentences.getDapAnB());
        radioButton3.setText("C. " + changeSentences.getDapAnC());
        radioButton4.setText("D. " + changeSentences.getDapAnD());
        textView2.setText("Answer: " + changeSentences.getDapAnDung());
        textView2.setVisibility(View.INVISIBLE);
        button.setEnabled(false);
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(DetailChangeSentencesActivity.this, ChangeSentencesActivity.class);
        finish();
        return super.onSupportNavigateUp();
    }
}