package com.example.doan_laptrinhdidong.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import com.example.doan_laptrinhdidong.Application.AppTest;
import com.example.doan_laptrinhdidong.CustomDialog.CustomDialog;
import com.example.doan_laptrinhdidong.CustomDialog.CustomDialogReturn;
import com.example.doan_laptrinhdidong.Model.DanhSachPartNghe;
import com.example.doan_laptrinhdidong.Adapter.DanhSachPartNgheAdapter;
import com.example.doan_laptrinhdidong.MeFragment;
import com.example.doan_laptrinhdidong.Model.BaiThiThu;
import com.example.doan_laptrinhdidong.Model.DocHieu;
import com.example.doan_laptrinhdidong.Model.Nghe;
import com.example.doan_laptrinhdidong.Model.Part1;
import com.example.doan_laptrinhdidong.Model.Part7;
import com.example.doan_laptrinhdidong.R;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class DanhMucBaiThiThuActivity extends AppCompatActivity {

    GridView gridView1;
    BaiThiThu baiThiThu;
    ArrayList<Part1> part1ArrayList;
    ArrayList<Nghe> part2ArrayList;
    ArrayList<Nghe> part3ArrayList;
    ArrayList<Nghe> part4ArrayList;
    ArrayList<DocHieu> part5ArrayList;
    ArrayList<DocHieu> part6ArrayList;
    ArrayList<Part7> part7ArrayList;
    String tenBaiThi;
    TextView textView3;
    Button btnKetThuc;
    public static CountDownTimer countDownTimer;
    public static long miliLong;
    DanhSachPartNgheAdapter danhSachPartNgheAdapter;
    ArrayList<DanhSachPartNghe> arrayList;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_muc_bai_thi_thu);

        gridView1 = findViewById(R.id.gridViewDanhMucBaiThiThuListening);
        textView3 = findViewById(R.id.textViewTimeLamBai);
        btnKetThuc = findViewById(R.id.btnKetThuc);

        baiThiThu = (BaiThiThu) getIntent().getSerializableExtra("BaiThi");
        tenBaiThi = (String) getIntent().getSerializableExtra("TenBaiThi");
        part1ArrayList = baiThiThu.getArrayPart1();
        part2ArrayList = baiThiThu.getArrayPart2();
        part3ArrayList = baiThiThu.getArrayPart3();
        part4ArrayList = baiThiThu.getArrayPart4();
        part5ArrayList = baiThiThu.getArrayPart5();
        part6ArrayList = baiThiThu.getArrayPart6();
        part7ArrayList = baiThiThu.getArrayPart7();

        arrayList = new ArrayList<>();
        arrayList.add(new DanhSachPartNghe(1,"Photographs"));
        arrayList.add(new DanhSachPartNghe(2,"Question-Response"));
        arrayList.add(new DanhSachPartNghe(3, "Conversations"));
        arrayList.add(new DanhSachPartNghe(4,"Short Talks"));
        arrayList.add(new DanhSachPartNghe(5,"Incomplete Sentences"));
        arrayList.add(new DanhSachPartNghe(6,"Text Completion"));
        arrayList.add(new DanhSachPartNghe(7,"Reading Comprehension"));


        danhSachPartNgheAdapter = new DanhSachPartNgheAdapter(getApplicationContext(), arrayList);
        gridView1.setAdapter(danhSachPartNgheAdapter);

        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                /*intent.putExtra("DanhSachNghe", ngheArrayList);
                intent.putExtra("CauNghe",ngheArrayList.get(position));
                intent.putExtra("viTri", position);

                ((AppTest) getApplication()).setNgheArrayList(ngheArrayList);
                startActivity(intent);*/
                switch (position)
                {
                    case 0:
                        Intent intent1 = new Intent(DanhMucBaiThiThuActivity.this, DetailBaiThiThuPart1Activity.class);
                        ((AppTest) getApplication()).setPart1ArrayList(part1ArrayList);
                        startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2 = new Intent(DanhMucBaiThiThuActivity.this, DetailBaiThiThuPart2Activity.class);
                        ((AppTest) getApplication()).setPart2ArrayList(part2ArrayList);
                        startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(DanhMucBaiThiThuActivity.this, DetailBaiThiThuPart3Activity.class);
                        ((AppTest) getApplication()).setPart3ArrayList(part3ArrayList);
                        startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 = new Intent(DanhMucBaiThiThuActivity.this, DetailBaiThiThuPart4Activity.class);
                        ((AppTest) getApplication()).setPart4ArrayList(part4ArrayList);
                        startActivity(intent4);
                        break;
                    case 4:
                        Intent intent5 = new Intent(DanhMucBaiThiThuActivity.this, DetailBaiThiThuPart5Activity.class);
                        ((AppTest) getApplication()).setPart5ArrayList(part5ArrayList);
                        startActivity(intent5);
                        break;
                    case 5:
                        Intent intent6 = new Intent(DanhMucBaiThiThuActivity.this, DetailBaiThiThuPart6Activity.class);
                        ((AppTest) getApplication()).setPart6ArrayList(part6ArrayList);
                        startActivity(intent6);
                        break;
                    case 6:
                        Intent intent7 = new Intent(DanhMucBaiThiThuActivity.this, DetailBaiThiThuPart7Activity.class);
                        ((AppTest) getApplication()).setPart7ArrayList(part7ArrayList);
                        startActivity(intent7);
                        break;
                }
            }
        });

        ((AppTest) getApplication()).countDownTimer = new CountDownTimer(7200000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                textView3.setText(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)
                        +":"+(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)))
                +":"+ (TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)) +""));
                miliLong = millisUntilFinished;
            }

            @Override
            public void onFinish() {
                hoiThoai();
            }
        }.start();

        btnKetThuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hoiThoai1();
                if(DetailBaiThiThuPart1Activity.countDownTimer != null)
                {
                    DetailBaiThiThuPart1Activity.countDownTimer.onFinish();
                }
                if(DetailBaiThiThuPart2Activity.countDownTimer != null)
                {
                    DetailBaiThiThuPart2Activity.countDownTimer.onFinish();
                }
                if(DetailBaiThiThuPart3Activity.countDownTimer != null)
                {
                    DetailBaiThiThuPart3Activity.countDownTimer.onFinish();
                }
                if(DetailBaiThiThuPart4Activity.countDownTimer != null)
                {
                    DetailBaiThiThuPart4Activity.countDownTimer.onFinish();
                }
                if(DetailBaiThiThuPart5Activity.countDownTimer != null)
                {
                    DetailBaiThiThuPart5Activity.countDownTimer.onFinish();
                }
                if(DetailBaiThiThuPart6Activity.countDownTimer != null)
                {
                    DetailBaiThiThuPart6Activity.countDownTimer.onFinish();
                }
                if(DetailBaiThiThuPart7Activity.countDownTimer != null)
                {
                    DetailBaiThiThuPart7Activity.countDownTimer.onFinish();
                }

            }
        });


        getSupportActionBar().setTitle("Testing - " + tenBaiThi);
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F3CABE")));
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.custom_actionbar_vocabulary));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(DanhMucBaiThiThuActivity.this, BaiThiThuActivity.class);
        if(!textView3.getText().equals(("00:00:00"))) {
            AlertDialog.Builder b = new AlertDialog.Builder(this);
            b.setTitle("Warning");
            b.setIcon(R.drawable.icon_question);
            b.setMessage("Are you sure you want to complete the test?");
            b.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    ((AppTest) getApplication()).countDownTimer.cancel();
                    textView3.setText("00:00:00");
                    miliLong = 0;
                    /*AlertDialog.Builder c = new AlertDialog.Builder(DanhMucBaiThiThuActivity.this);
                    c.setTitle("Thông báo");
                    int IDIcon = setIconTheoDiem(tinhDiem());
                    c.setIcon(IDIcon);
                    c.setMessage("Thời gian làm bài đã hết \n" +
                            "Điểm của bạn: " + tinhDiem() + "/150 \n" +
                            xepLoai(tinhDiem()));
                    c.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
                    c.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    c.show();*/
                    hoiThoaiCustomDialogReturn();
                }
            });
            b.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            b.show();
        }
        else
        {
            finish();
        }
        return super.onSupportNavigateUp();
    }

    public void hoiThoai()
    {
        ((AppTest) getApplication()).countDownTimer.cancel();
        textView3.setText("00:00:00");
        miliLong = 0;
        hoiThoaiCustomDialog();
    }

    public void hoiThoai1()
    {
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setTitle("Warning");
        b.setIcon(R.drawable.icon_question);
        b.setMessage("Are you sure you want to complete the test?");
        b.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ((AppTest) getApplication()).countDownTimer.cancel();
                textView3.setText("00:00:00");
                miliLong = 0;
                /*AlertDialog.Builder b = new AlertDialog.Builder(DanhMucBaiThiThuActivity.this);
                b.setTitle("Thông báo");
                int IDIcon = setIconTheoDiem(tinhDiem());
                b.setIcon(IDIcon);
                b.setMessage("Thời gian làm bài đã hết \n" +
                        "Điểm của bạn: " + tinhDiem() + "/150 \n" +
                        xepLoai(tinhDiem()));
                b.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                b.show();*/
                hoiThoaiCustomDialog();
            }
        });
        b.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        b.show();
    }

    public void hoiThoaiCustomDialog()
    {
        int IDIcon = setIconTheoDiem(tinhDiem());
        String xepLoai = xepLoai(tinhDiem());
        String diem = tinhDiem() + "/150";
        String titlte = "Timeout!";
        CustomDialog customDialog = new CustomDialog(DanhMucBaiThiThuActivity.this, diem, xepLoai, IDIcon, titlte);
        customDialog.show();
    }

    public void hoiThoaiCustomDialogReturn()
    {
        int IDIcon = setIconTheoDiem(tinhDiem());
        String xepLoai = xepLoai(tinhDiem());
        String diem = tinhDiem() + "/150";
        String titlte = "Timeout!";
        CustomDialogReturn customDialog = new CustomDialogReturn(DanhMucBaiThiThuActivity.this, diem, xepLoai, IDIcon, titlte);
        customDialog.show();
    }

    public String xepLoai(int diem)
    {
        String rank = null;
        if(diem < 50)
        {
            rank = "BAD!!!";
        }
        else if(diem <100)
        {
            rank = "GOOD!!!";
        }
        else
        {
            rank = "EXCELLENT!!!";
        }
        return rank;
    }

    public int setIconTheoDiem(int diem)
    {
        int rank = 0;
        if(diem < 50)
        {
            rank = R.drawable.icon_bad;
        }
        else if(diem <100)
        {
            rank = R.drawable.icon_good;
        }
        else
        {
            rank = R.drawable.icon_excellent;
        }
        return rank;
    }

    public int tinhDiem()
    {
        int diemPart1 = 0;
        int diemPart2 = 0;
        int diemPart3 = 0;
        int diemPart4 = 0;
        int diemPart5 = 0;
        int diemPart6 = 0;
        int diemPart7 = 0;
        ArrayList<Part1> danhSachPart1 =  ((AppTest) getApplication()).getPart1ArrayList();
        ArrayList<Nghe> danhSachPart2 =  ((AppTest) getApplication()).getPart2ArrayList();
        ArrayList<Nghe> danhSachPart3 =  ((AppTest) getApplication()).getPart3ArrayList();
        ArrayList<Nghe> danhSachPart4 =  ((AppTest) getApplication()).getPart4ArrayList();
        ArrayList<DocHieu> danhSachPart5 = ((AppTest) getApplication()).getPart5ArrayList();
        ArrayList<DocHieu> danhSachPart6 = ((AppTest) getApplication()).getPart6ArrayList();
        ArrayList<Part7> danhSachPart7 = ((AppTest) getApplication()).getPart7ArrayList();

        diemPart1 = tinhDiemPart1(danhSachPart1);
        diemPart2 = tinhDiemNghe(danhSachPart2);
        diemPart3 = tinhDiemNghe(danhSachPart3);
        diemPart4 = tinhDiemNghe(danhSachPart4);
        diemPart5 = tinhDiemDocHieu(danhSachPart5);
        diemPart6 = tinhDiemDocHieu(danhSachPart6);
        diemPart7 = tinhDiemPart7(danhSachPart7);
        int diemTong = diemPart1 + diemPart2 + diemPart3 + diemPart4 + diemPart5 + diemPart6 + diemPart7;

        Log.d("diemP1", diemPart1 + "");
        Log.d("diemP2", diemPart2 + "");
        Log.d("diemP3", diemPart3 + "");
        Log.d("diemP4", diemPart4 + "");
        Log.d("diemP5", diemPart5 + "");
        Log.d("diemP6", diemPart6 + "");
        Log.d("diemP7", diemPart7 + "");

        sharedPreferences  = getSharedPreferences(MeFragment.DATA_ACOUNT, Context.MODE_PRIVATE);
        int diemLuu = sharedPreferences.getInt("diem",0);
        if(diemTong > diemLuu) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putInt("diem", diemTong);
            editor.commit();
        }
        return diemTong;
    }

    public int tinhDiemPart1(ArrayList<Part1> ds)
    {
        int diem = 0;
        if(ds == null)
        {
            diem = 0;
        }
        else
        {
            for(int i=0; i<ds.size(); i++)
            {
                if(ds.get(i).getDapAnChon().equals(ds.get(i).getDapAnDung()))
                {
                    diem += 5;
                }
            }
        }
        return diem;
    }

    public int tinhDiemNghe(ArrayList<Nghe> ds)
    {
        int diem = 0;
        if(ds == null)
        {
            diem = 0;
        }
        else
        {
            for(int i=0; i<ds.size(); i++)
            {
                if(ds.get(i).getDapAnChon().equals(ds.get(i).getDapAnDung()))
                {
                    diem += 5;
                }
            }
        }
        return diem;
    }

    public int tinhDiemDocHieu(ArrayList<DocHieu> ds)
    {
        int diem = 0;
        if(ds == null)
        {
            diem = 0;
        }
        else
        {
            for(int i=0; i<ds.size(); i++)
            {
                if(ds.get(i).getDapAnChon().equals(ds.get(i).getDapAnDung()))
                {
                    diem += 5;
                }
            }
        }
        return diem;
    }

    public int tinhDiemPart7(ArrayList<Part7> ds)
    {
        int diem = 0;
        if(ds == null)
        {
            diem = 0;
        }
        else
        {
            for(int i=0; i<ds.size(); i++)
            {
                if(ds.get(i).getDapAnChon().equals(ds.get(i).getDapAnDung()))
                {
                    diem += 5;
                }
            }
        }
        return diem;
    }

}