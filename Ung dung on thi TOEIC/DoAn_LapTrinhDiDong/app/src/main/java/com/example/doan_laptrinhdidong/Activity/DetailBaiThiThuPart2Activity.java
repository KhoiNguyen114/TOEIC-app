package com.example.doan_laptrinhdidong.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.doan_laptrinhdidong.Application.AppTest;
import com.example.doan_laptrinhdidong.Model.Nghe;
import com.example.doan_laptrinhdidong.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class DetailBaiThiThuPart2Activity extends AppCompatActivity {

    TextView textView1;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioGroup radioGroup;
    Button prev;
    Button next;
    Nghe nghe;
    ArrayList<Nghe> arrayList;
    int eventNum = 0;
    int eventEnd = 0;
    SeekBar seekBar;
    ImageButton imageButton;
    TextView textView3;
    TextView textView4;
    MediaPlayer mediaPlayer;
    TextView textView5;
    public static CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_bai_thi_thu_part2);

        textView1 = findViewById(R.id.textViewCauDePart2);
        radioButton1 = findViewById(R.id.rdoDapAnABaiThiThuPart2);
        radioButton2 = findViewById(R.id.rdoDapAnBBaiThiThuPart2);
        radioButton3 = findViewById(R.id.rdoDapAnCBaiThiThuPart2);
        radioButton4 = findViewById(R.id.rdoDapAnDBaiThiThuPart2);
        radioGroup = findViewById(R.id.RadioGroupBaiThiThuPart2);
        prev = findViewById(R.id.btnPrevBaiThiThuPart2);
        next = findViewById(R.id.btnNextBaiThiThuPart2);
        seekBar = findViewById(R.id.seekBarBaiThiThuPart2);
        imageButton = findViewById(R.id.imageButtonBaiThiThuPart2);
        textView3 = findViewById(R.id.textViewTimeProgressBaiThiThuPart2);
        textView4 = findViewById(R.id.textViewMaxTimeBaiThiThuPart2);
        textView5 = findViewById(R.id.textViewTimeSongSongPart2);

        arrayList = ((AppTest) getApplication()).getPart2ArrayList();
        nghe = arrayList.get(0);

        eventEnd = arrayList.size();
        setEventData(eventNum);
        loadArraylist(eventNum);

        String mang [] = nghe.getCauDe().split("\\.");
        String cau = mang[0];

        countDownTimer = new CountDownTimer((DanhMucBaiThiThuActivity.miliLong-900), 1000) {
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

        mediaPlayer = Nghe.playSong(DetailBaiThiThuPart2Activity.this, nghe.getIDAudio());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");  //Format thành kiểu 00:00
        textView4.setText(simpleDateFormat.format(mediaPlayer.getDuration()));  //Gán giá trị thời lượng audio
        seekBar.setMax(mediaPlayer.getDuration());

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mediaPlayer.seekTo(seekBar.getProgress());
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.pause();
                    imageButton.setImageResource(R.drawable.ic_baseline_play_arrow_24);
                }
                else
                {
                    mediaPlayer.start();
                    imageButton.setImageResource(R.drawable.ic_baseline_pause_24);
                }
                UpdateTime();
            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                imageButton.setImageResource(R.drawable.ic_baseline_play_arrow_24);
            }
        });

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
                    ((AppTest) getApplication()).getPart2ArrayList().get(eventNum).setDapAnChon(dapAnA);
                }
            }
        });

        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    String dapAnA = radioButton2.getText().toString().substring(0, 1);
                    ((AppTest) getApplication()).getPart2ArrayList().get(eventNum).setDapAnChon(dapAnA);
                }
            }
        });

        radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    String dapAnA = radioButton3.getText().toString().substring(0, 1);
                    ((AppTest) getApplication()).getPart2ArrayList().get(eventNum).setDapAnChon(dapAnA);
                }
            }
        });

        radioButton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    String dapAnA = radioButton4.getText().toString().substring(0, 1);
                    ((AppTest) getApplication()).getPart2ArrayList().get(eventNum).setDapAnChon(dapAnA);
                }
            }
        });


        getSupportActionBar().setTitle("Part 2 - Question " + cau);
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F3CABE")));
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.custom_actionbar_vocabulary));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public void setEventData(int num)
    {
        ArrayList<Nghe> ds = ((AppTest) getApplication()).getPart2ArrayList();
        Nghe nghe = ds.get(num);
        String mang [] = nghe.getCauDe().split("\\.");
        String cau = mang[0];
        getSupportActionBar().setTitle("Part 2 - Question " + cau);
        if(mediaPlayer != null) {
            mediaPlayer.stop();
        }
        mediaPlayer = Nghe.playSong(DetailBaiThiThuPart2Activity.this, nghe.getIDAudio());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");  //Format thành kiểu 00:00
        textView4.setText(simpleDateFormat.format(mediaPlayer.getDuration()));  //Gán giá trị thời lượng audio
        seekBar.setMax(mediaPlayer.getDuration());
        imageButton.setImageResource(R.drawable.ic_baseline_play_arrow_24);
        textView1.setText(nghe.getCauDe());
        radioButton1.setText("A. " + nghe.getDapAnA());
        radioButton2.setText("B. " + nghe.getDapAnB());
        radioButton3.setText("C. " + nghe.getDapAnC());
        radioButton4.setText("D. " + nghe.getDapAnD());

    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(DetailBaiThiThuPart2Activity.this, DanhMucBaiThiThuActivity.class);
        mediaPlayer.stop();
        finish();
        return super.onSupportNavigateUp();
    }

    public void UpdateTime()
    {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
                textView3.setText(simpleDateFormat.format(mediaPlayer.getCurrentPosition()));   //Gán giá trị thời lượng thực tế của audio
                seekBar.setProgress(mediaPlayer.getCurrentPosition());
                handler.postDelayed(this,500);
            }
        },100);
    }

    public void loadArraylist(int num)
    {
        ArrayList<Nghe> ds = ((AppTest) getApplication()).getPart2ArrayList();
        Nghe nghe = ds.get(num);
        if(!nghe.getDapAnChon().equals(""))
        {
            Log.d("dapAN2",nghe.getDapAnChon());
            switch (nghe.getDapAnChon())
            {
                case"A":
                    radioButton1.setChecked(true);
                    break;
                case"B":
                    radioButton2.setChecked(true);
                    break;
                case"C":
                    radioButton3.setChecked(true);
                    break;
                case"D":
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