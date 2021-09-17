package com.example.doan_laptrinhdidong.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.doan_laptrinhdidong.MeFragment;
import com.example.doan_laptrinhdidong.Model.Vocabulary;
import com.example.doan_laptrinhdidong.R;

import java.util.ArrayList;

public class DetailVocabularyActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioGroup radioGroup;
    Button button;
    Button prev;
    Button next;
    Vocabulary vocabulary;
    ArrayList<Vocabulary> arrayList;
    int eventNum = 0;
    int eventEnd = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_vocabulary);

        textView1 = findViewById(R.id.textViewCauDeVocabulary);
        textView2 = findViewById(R.id.textViewDapAnDungVocabulary);
        radioButton1 = findViewById(R.id.rdoDapAnAVocabulary);
        radioButton2 = findViewById(R.id.rdoDapAnBVocabulary);
        radioButton3 = findViewById(R.id.rdoDapAnCVocabulary);
        radioButton4 = findViewById(R.id.rdoDapAnDVocabulary);
        radioGroup = findViewById(R.id.RadioGroupVocabulary);
        prev = findViewById(R.id.btnPrevVocabulary);
        next = findViewById(R.id.btnNextVocabulary);
        button = findViewById(R.id.btnKiemTraVocabulary);
        vocabulary = (Vocabulary) getIntent().getSerializableExtra("Tu");
        arrayList = (ArrayList<Vocabulary>) getIntent().getSerializableExtra("DanhSach");
        eventNum = (int) getIntent().getSerializableExtra("viTri");
        eventEnd = arrayList.size();

        textView1.setText(vocabulary.getCauDe());
        textView2.setText("Answer: " + vocabulary.getDapAnDung());
        radioButton1.setText("A. " + vocabulary.getDapAnA());
        radioButton2.setText("B. " + vocabulary.getDapAnB());
        radioButton3.setText("C. " + vocabulary.getDapAnC());
        radioButton4.setText("D. " + vocabulary.getDapAnD());
        button.setEnabled(false);

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

        getSupportActionBar().setTitle("Question " + (eventNum + 1));
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#77ACF1")));
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
        vocabulary = arrayList.get(num);
        getSupportActionBar().setTitle("Question " + (num + 1));
        textView1.setText(vocabulary.getCauDe());
        radioButton1.setText("A. " + vocabulary.getDapAnA());
        radioButton2.setText("B. " + vocabulary.getDapAnB());
        radioButton3.setText("C. " + vocabulary.getDapAnC());
        radioButton4.setText("D. " + vocabulary.getDapAnD());
        textView2.setText("Answer: " + vocabulary.getDapAnDung());
        textView2.setVisibility(View.INVISIBLE);
        button.setEnabled(false);
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(DetailVocabularyActivity.this, VocabularyActivity.class);
        finish();
        return super.onSupportNavigateUp();
    }


}