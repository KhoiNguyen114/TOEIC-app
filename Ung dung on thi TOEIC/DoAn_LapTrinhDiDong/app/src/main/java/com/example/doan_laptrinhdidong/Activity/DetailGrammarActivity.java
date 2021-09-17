package com.example.doan_laptrinhdidong.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.doan_laptrinhdidong.Model.Grammar;
import com.example.doan_laptrinhdidong.R;

import java.util.ArrayList;

public class DetailGrammarActivity extends AppCompatActivity {

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
    Grammar grammar;
    ArrayList<Grammar> arrayList;
    int eventNum = 0;
    int eventEnd = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_grammar);

        textView1 = findViewById(R.id.textViewCauDeGrammar);
        radioButton1 = findViewById(R.id.rdoDapAnAGrammar);
        radioButton2 = findViewById(R.id.rdoDapAnBGrammar);
        radioButton3 = findViewById(R.id.rdoDapAnCGrammar);
        radioButton4 = findViewById(R.id.rdoDapAnDGrammar);
        radioGroup = findViewById(R.id.RadioGroupGrammar);
        textView2 = findViewById(R.id.textViewDapAnDungGrammar);
        button = findViewById(R.id.btnKiemTraGrammar);
        prev = findViewById(R.id.btnPrevGrammar);
        next = findViewById(R.id.btnNextGrammar);

        grammar = (Grammar) getIntent().getSerializableExtra("TieuDe");
        arrayList = (ArrayList<Grammar>) getIntent().getSerializableExtra("LoaiNguPhap");
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
                    eventNum --;
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
                    eventNum ++;
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

        //getSupportActionBar().setTitle(grammar.getLoaiNguPhap() + " - Câu " + (eventNum + 1));
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#EF7CA9")));
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
        grammar = arrayList.get(num);
        //getSupportActionBar().setTitle(grammar.getLoaiNguPhap() + " - Câu " + (num + 1));
        textView3.setText(grammar.getLoaiNguPhap() + " - Question " + (eventNum + 1));
        textView1.setText(grammar.getCauDe());
        radioButton1.setText("A. " + grammar.getDapAnA());
        radioButton2.setText("B. " + grammar.getDapAnB());
        radioButton3.setText("C. " + grammar.getDapAnC());
        radioButton4.setText("D. " + grammar.getDapAnD());
        textView2.setText("Answer: " + grammar.getDapAnDung());
        textView2.setVisibility(View.INVISIBLE);
        button.setEnabled(false);
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(DetailGrammarActivity.this, GrammarActivity.class);
        finish();
        return super.onSupportNavigateUp();
    }
}