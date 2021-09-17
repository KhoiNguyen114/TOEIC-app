package com.example.doan_laptrinhdidong.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
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
import android.widget.Toast;

import com.example.doan_laptrinhdidong.Model.Listening;
import com.example.doan_laptrinhdidong.R;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DetailListeningActivity extends AppCompatActivity {

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
    Listening listening;
    ArrayList<Listening> arrayList;
    int eventNum = 0;
    int eventEnd = 0;
    int soBai = 0;
    SeekBar seekBar;
    ImageButton imageButton;
    TextView textView3;
    TextView textView4;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_listening);

        textView1 = findViewById(R.id.textViewCauDePart2);
        radioButton1 = findViewById(R.id.rdoDapAnAListening);
        radioButton2 = findViewById(R.id.rdoDapAnBListening);
        radioButton3 = findViewById(R.id.rdoDapAnCListening);
        radioButton4 = findViewById(R.id.rdoDapAnDListening);
        radioGroup = findViewById(R.id.RadioGroupListening);
        textView2 = findViewById(R.id.textViewDapAnDungListening);
        button = findViewById(R.id.btnKiemTraListening);
        prev = findViewById(R.id.btnPrevListening);
        next = findViewById(R.id.btnNextListening);
        seekBar = findViewById(R.id.seekBarListening);
        imageButton = findViewById(R.id.imageButtonListening);
        textView3 = findViewById(R.id.textViewTimeProgressListening);
        textView4 = findViewById(R.id.textViewMaxTimeListening);

        listening = (Listening) getIntent().getSerializableExtra("TieuDe");
        arrayList = (ArrayList<Listening>) getIntent().getSerializableExtra("LoaiBaiNghe");
        soBai = (int) getIntent().getSerializableExtra("viTri");
        eventEnd = arrayList.size();

        textView1.setText(listening.getCauDe());
        radioButton1.setText("A. " + listening.getDapAnA());
        radioButton2.setText("B. " + listening.getDapAnB());
        radioButton3.setText("C. " + listening.getDapAnC());
        radioButton4.setText("D. " + listening.getDapAnD());
        textView2.setText("Answer: " + listening.getDapAnDung());
        button.setEnabled(false);

        mediaPlayer = Listening.playSong(DetailListeningActivity.this,listening.getIDAudio());
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

        getSupportActionBar().setTitle("Listening - Lesson " + (soBai + 1) + " - Question " + (eventNum + 1));
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#9DEF55")));
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
        listening = arrayList.get(num);
        getSupportActionBar().setTitle("Listening - Lesson " + (soBai + 1)  + " - Question " + (num + 1));
        textView1.setText(listening.getCauDe());
        radioButton1.setText("A. " + listening.getDapAnA());
        radioButton2.setText("B. " + listening.getDapAnB());
        radioButton3.setText("C. " + listening.getDapAnC());
        radioButton4.setText("D. " + listening.getDapAnD());
        textView2.setText("Answer: " + listening.getDapAnDung());
        textView2.setVisibility(View.INVISIBLE);
        button.setEnabled(false);
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(DetailListeningActivity.this, ListeningActivity.class);
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


}