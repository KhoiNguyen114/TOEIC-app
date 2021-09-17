package com.example.doan_laptrinhdidong.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.doan_laptrinhdidong.Application.AppTest;
import com.example.doan_laptrinhdidong.Model.DocHieu;
import com.example.doan_laptrinhdidong.R;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class DetailBaiThiThuPart6Activity extends AppCompatActivity {

    TextView textView1;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioGroup radioGroup;
    Button prev;
    Button next;
    DocHieu docHieu;
    ArrayList<DocHieu> arrayList;
    int eventNum = 0;
    int eventEnd = 0;
    TextView textView5;
    public static CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_bai_thi_thu_part6);

        textView1 = findViewById(R.id.textViewCauDePart6);
        radioButton1 = findViewById(R.id.rdoDapAnABaiThiThuPart6);
        radioButton2 = findViewById(R.id.rdoDapAnBBaiThiThuPart6);
        radioButton3 = findViewById(R.id.rdoDapAnCBaiThiThuPart6);
        radioButton4 = findViewById(R.id.rdoDapAnDBaiThiThuPart6);
        radioGroup = findViewById(R.id.RadioGroupBaiThiThuPart6);
        prev = findViewById(R.id.btnPrevBaiThiThuPart6);
        next = findViewById(R.id.btnNextBaiThiThuPart6);
        textView5 = findViewById(R.id.textViewTimeSongSongPart6);

        arrayList = ((AppTest) getApplication()).getPart6ArrayList();
        docHieu = arrayList.get(0);

        eventEnd = arrayList.size();
        setEventData(eventNum);
        loadArraylist(eventNum);

        String mang [] = docHieu.getCauDe().split("\\.");
        String cau = mang[0];

        countDownTimer = new CountDownTimer((DanhMucBaiThiThuActivity.miliLong-700), 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                textView5.setText(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)
                        +":"+(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)))
                        +":"+ (TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)) +""));

            }

            @Override
            public void onFinish() {
                radioButton1.setEnabled(false);
                radioButton2.setEnabled(false);
                radioButton3.setEnabled(false);
                radioButton4.setEnabled(false);
            }
        }.start();

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eventNum > 0)
                {
                    eventNum--;
                    setEventData(eventNum);
                    loadArraylist(eventNum);
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
                    loadArraylist(eventNum);
                    return;
                }
            }
        });

        radioButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    String dapAnA = radioButton1.getText().toString().substring(0, 1);
                    ((AppTest) getApplication()).getPart6ArrayList().get(eventNum).setDapAnChon(dapAnA);
                }
            }
        });

        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    String dapAnA = radioButton2.getText().toString().substring(0, 1);
                    ((AppTest) getApplication()).getPart6ArrayList().get(eventNum).setDapAnChon(dapAnA);
                }
            }
        });

        radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    String dapAnA = radioButton3.getText().toString().substring(0, 1);
                    ((AppTest) getApplication()).getPart6ArrayList().get(eventNum).setDapAnChon(dapAnA);
                }
            }
        });

        radioButton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    String dapAnA = radioButton4.getText().toString().substring(0, 1);
                    ((AppTest) getApplication()).getPart6ArrayList().get(eventNum).setDapAnChon(dapAnA);
                }
            }
        });

        getSupportActionBar().setTitle("Part 6 - Question " + cau);
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F3CABE")));
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.custom_actionbar_vocabulary));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void setEventData(int num)
    {
        ArrayList<DocHieu> ds = ((AppTest) getApplication()).getPart6ArrayList();
        DocHieu docHieu = ds.get(num);
        String mang [] = docHieu.getCauDe().split("\\.");
        String cau = mang[0];
        getSupportActionBar().setTitle("Part 6 - Question " + cau);
        textView1.setText(docHieu.getCauDe());
        radioButton1.setText("A. " + docHieu.getDapAnA());
        radioButton2.setText("B. " + docHieu.getDapAnB());
        radioButton3.setText("C. " + docHieu.getDapAnC());
        radioButton4.setText("D. " + docHieu.getDapAnD());
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(DetailBaiThiThuPart6Activity.this, DanhMucBaiThiThuActivity.class);
        finish();
        return super.onSupportNavigateUp();
    }

    public void loadArraylist(int num)
    {
        ArrayList<DocHieu> ds = ((AppTest) getApplication()).getPart6ArrayList();
        DocHieu docHieu = ds.get(num);
        if(!docHieu.getDapAnChon().equals(""))
        {
            Log.d("dapAN5",docHieu.getDapAnChon());
            switch (docHieu.getDapAnChon())
            {
                case "A":
                    radioButton1.setChecked(true);
                    break;
                case "B":
                    radioButton2.setChecked(true);
                    break;
                case "C":
                    radioButton3.setChecked(true);
                    break;
                default:
                    radioButton4.setChecked(true);
                    break;
            }
        }
        else
        {
            radioGroup.clearCheck();
        }
    }
}