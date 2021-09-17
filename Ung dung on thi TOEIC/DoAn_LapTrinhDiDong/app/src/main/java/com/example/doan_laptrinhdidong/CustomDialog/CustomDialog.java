package com.example.doan_laptrinhdidong.CustomDialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.doan_laptrinhdidong.R;


public class CustomDialog extends Dialog implements View.OnClickListener {
    public Activity c;
    public Dialog dialog;
    public Button button;
    public TextView textView1;
    public TextView textView2;
    public TextView textView3;
    public ImageView imageView;
    public String diem, xeploai, title;
    public int hinh;

    public CustomDialog(Activity a, String diem, String xepLoai, int hinh, String tieuDe) {
        super(a);
        this.c = a;
        this.diem = diem;
        this.xeploai = xepLoai;
        this.hinh = hinh;
        this.title = tieuDe;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
        button = findViewById(R.id.btnOK);
        textView1 = findViewById(R.id.textViewTitleDialog);
        textView2 = findViewById(R.id.textViewDiemDilaog);
        textView3 = findViewById(R.id.textViewXepLoai);
        imageView = findViewById(R.id.imageViewDialog);

        textView1.setText(title);
        imageView.setImageResource(hinh);
        textView2.setText(diem);
        textView3.setText(xeploai);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOK:

                break;
        }
        dismiss();
    }
}
