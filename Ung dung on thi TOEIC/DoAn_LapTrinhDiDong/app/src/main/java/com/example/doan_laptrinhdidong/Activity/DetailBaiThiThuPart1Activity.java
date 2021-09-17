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
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.doan_laptrinhdidong.Application.AppTest;
import com.example.doan_laptrinhdidong.Model.Part1;
import com.example.doan_laptrinhdidong.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class DetailBaiThiThuPart1Activity extends AppCompatActivity {

    ImageView imageView;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioGroup radioGroup;
    Button prev;
    Button next;
    Part1 part1;
    ArrayList<Part1> part1ArrayList;
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
        setContentView(R.layout.activity_detail_bai_thi_thu_part1);

        imageView = findViewById(R.id.imageViewPart1);
        radioButton1 = findViewById(R.id.rdoDapAnABaiThiThuPart1);
        radioButton2 = findViewById(R.id.rdoDapAnBBaiThiThuPart1);
        radioButton3 = findViewById(R.id.rdoDapAnCBaiThiThuPart1);
        radioButton4 = findViewById(R.id.rdoDapAnDBaiThiThuPart1);
        radioGroup = findViewById(R.id.RadioGroupBaiThiThuPart1);
        prev = findViewById(R.id.btnPrevBaiThiThuPart1);
        next = findViewById(R.id.btnNextBaiThiThuPart1);
        seekBar = findViewById(R.id.seekBarBaiThiThuPart1);
        imageButton = findViewById(R.id.imageButtonBaiThiThuPart1);
        textView3 = findViewById(R.id.textViewTimeProgressBaiThiThuPart1);
        textView4 = findViewById(R.id.textViewMaxTimeBaiThiThuPart1);
        textView5 = findViewById(R.id.textViewTimeSongSongPart1);

        part1ArrayList = ((AppTest) getApplication()).getPart1ArrayList();
        part1 = part1ArrayList.get(0);
        Log.d("arPart1", part1ArrayList.size() + "");

        eventEnd = part1ArrayList.size();
        setEventData(eventNum);
        loadArraylist(eventNum);

        /*imageView.setImageResource(part1.getHinh());
        radioButton1.setText("A. " + part1.getDapAnA());
        radioButton2.setText("B. " + part1.getDapAnB());
        radioButton3.setText("C. " + part1.getDapAnC());
        radioButton4.setText("D. " + part1.getDapAnD());*/

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

        mediaPlayer = Part1.playSong(DetailBaiThiThuPart1Activity.this, part1.getIDAudio());
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
                    ((AppTest) getApplication()).getPart1ArrayList().get(eventNum).setDapAnChon(dapAnA);
                }
            }
        });

        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    String dapAnA = radioButton2.getText().toString().substring(0, 1);
                    ((AppTest) getApplication()).getPart1ArrayList().get(eventNum).setDapAnChon(dapAnA);
                }
            }
        });

        radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    String dapAnA = radioButton3.getText().toString().substring(0, 1);
                    ((AppTest) getApplication()).getPart1ArrayList().get(eventNum).setDapAnChon(dapAnA);
                }
            }
        });

        radioButton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    String dapAnA = radioButton4.getText().toString().substring(0, 1);
                    ((AppTest) getApplication()).getPart1ArrayList().get(eventNum).setDapAnChon(dapAnA);
                }
            }
        });

        getSupportActionBar().setTitle("Part 1 - Question " + (eventNum + 1));
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F3CABE")));
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.custom_actionbar_vocabulary));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void setEventData(int num)
    {
        ArrayList<Part1> ds = ((AppTest) getApplication()).getPart1ArrayList();
        Part1 part1 = ds.get(num);
        getSupportActionBar().setTitle("Part 1 - Question " + (num + 1));
        if(mediaPlayer != null) {
            mediaPlayer.stop();
        }
        mediaPlayer = Part1.playSong(DetailBaiThiThuPart1Activity.this, part1.getIDAudio());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");  //Format thành kiểu 00:00
        textView4.setText(simpleDateFormat.format(mediaPlayer.getDuration()));  //Gán giá trị thời lượng audio
        seekBar.setMax(mediaPlayer.getDuration());
        imageButton.setImageResource(R.drawable.ic_baseline_play_arrow_24);
        imageView.setImageBitmap(Part1.convertStringToBitmapFromAccess(DetailBaiThiThuPart1Activity.this, part1.getHinh()));
        radioButton1.setText("A. " + part1.getDapAnA());
        radioButton2.setText("B. " + part1.getDapAnB());
        radioButton3.setText("C. " + part1.getDapAnC());
        radioButton4.setText("D. " + part1.getDapAnD());
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(DetailBaiThiThuPart1Activity.this, DanhMucBaiThiThuActivity.class);
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
        ArrayList<Part1> ds = ((AppTest) getApplication()).getPart1ArrayList();
        Part1 part1 = ds.get(num);
        if(!part1.getDapAnChon().equals(""))
        {
            Log.d("dapAN1",part1.getDapAnChon());
            switch (part1.getDapAnChon())
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
                case "D":
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