package com.example.doan_laptrinhdidong.Activity;

import androidx.appcompat.app.AppCompatActivity;

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

import com.example.doan_laptrinhdidong.Model.FamilyWord;
import com.example.doan_laptrinhdidong.R;

import java.util.ArrayList;

public class DetailFamilyWordActivity extends AppCompatActivity {

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
    FamilyWord familyWord;
    ArrayList<FamilyWord> arrayList;
    int eventNum = 0;
    int eventEnd = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_family_word);

        textView1 = findViewById(R.id.textViewCauDeFamilyWord);
        textView2 = findViewById(R.id.textViewDapAnDungFamilyWord);
        radioButton1 = findViewById(R.id.rdoDapAnAFamilyWord);
        radioButton2 = findViewById(R.id.rdoDapAnBFamilyWord);
        radioButton3 = findViewById(R.id.rdoDapAnCFamilyWord);
        radioButton4 = findViewById(R.id.rdoDapAnDFamilyWord);
        radioGroup = findViewById(R.id.RadioGroupFamilyWord);
        prev = findViewById(R.id.btnPrevFamilyWord);
        next = findViewById(R.id.btnNextFamilyWord);
        button = findViewById(R.id.btnKiemTraFamilyWord);
        familyWord = (FamilyWord) getIntent().getSerializableExtra("Tu");
        arrayList = (ArrayList<FamilyWord>) getIntent().getSerializableExtra("DanhSach");
        eventNum = (int) getIntent().getSerializableExtra("viTri");
        eventEnd = arrayList.size();
        button.setEnabled(false);

        textView1.setText(familyWord.getCauDe());
        textView2.setText("Answer: "+ familyWord.getDapAnDung());
        radioButton1.setText("A. " + familyWord.getDapAnA());
        radioButton2.setText("B. " + familyWord.getDapAnB());
        radioButton3.setText("C. " + familyWord.getDapAnC());
        radioButton4.setText("D. " + familyWord.getDapAnD());


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
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F62323")));
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
        familyWord = arrayList.get(num);
        getSupportActionBar().setTitle("Question " + (num + 1));
        textView1.setText(familyWord.getCauDe());
        radioButton1.setText("A. " + familyWord.getDapAnA());
        radioButton2.setText("B. " + familyWord.getDapAnB());
        radioButton3.setText("C. " + familyWord.getDapAnC());
        radioButton4.setText("D. " + familyWord.getDapAnD());
        textView2.setText("Answer: "+ familyWord.getDapAnDung());
        textView2.setVisibility(View.INVISIBLE);
        button.setEnabled(false);
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(DetailFamilyWordActivity.this, FamilyWordActivity.class);
        finish();
        return super.onSupportNavigateUp();
    }
}